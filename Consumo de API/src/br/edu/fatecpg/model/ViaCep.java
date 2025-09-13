package br.edu.fatecpg.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ViaCep {

    public static String buscarEndereco(String cep){
        try {
            if (cep == null || cep.isEmpty()) return null;

            URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);

            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine()) != null){
                sb.append(line);
            }
            br.close();

            return sb.toString();
        } catch (Exception e) {
            System.out.println("Erro na busca do CEP: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    private static String extrairCampo(String json, String campo) {
        if(json == null || campo == null) return "";

        String procura = "\"" + campo + "\":";
        int i = json.indexOf(procura);
        if(i == -1) return "";

        int inicio = i + procura.length();

        while(inicio < json.length() && (json.charAt(inicio) == ' ' || json.charAt(inicio) == '\"')) {
            inicio++;
        }

        int fim = inicio;
        while(fim < json.length() && json.charAt(fim) != '\"' && json.charAt(fim) != ',' && json.charAt(fim) != '}') {
            fim++;
        }

        return json.substring(inicio, fim).trim();
    }

    public static Endereco converterEndereco(String cep, String json){
        if(json == null || json.contains("\"erro\": true")) return null;

        String logradouro = extrairCampo(json, "logradouro");
        String complemento = extrairCampo(json, "complemento");
        String bairro = extrairCampo(json, "bairro");
        String localidade = extrairCampo(json, "localidade");
        String uf = extrairCampo(json, "uf");

        return new Endereco(cep, logradouro, complemento, bairro, localidade, uf);
    }
}
