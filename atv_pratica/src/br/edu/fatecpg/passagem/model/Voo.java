package br.edu.fatecpg.passagem.model;

public class Voo {
    private String numVoo;
    private String origem;
    private String destino;
    private int assentoDisponivel;

    public Voo(String numVoo, String origem, String destino, int assentoDisponivel) {
        this.numVoo = numVoo;
        this.origem = origem;
        this.destino = destino;
        this.assentoDisponivel = assentoDisponivel;
    }

    public boolean verificarDisponibilidade(int quantidadeAssentos){
        return quantidadeAssentos <= assentoDisponivel;
    }
    public boolean realizarReserva(int quantidadeAssentos){
        if(verificarDisponibilidade(quantidadeAssentos)){
            assentoDisponivel -= quantidadeAssentos;
            System.out.println("Reserva realizada com sucesso!");
            return true;
        }else {
            System.out.println("Assentos insuficientes!");
            return false;
        }
    }

    public double realizarPagamento(String tipoViagem, boolean pontosTuristicos){
        double total = 500;

        if (tipoViagem.equalsIgnoreCase("ida e volta")) {
            total *= 2;
        }
        if(pontosTuristicos){
            total *= 1.3;
        }
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Valor total: R$" + total);
        return total;
    }

    public void imprimirPassagem(){
        System.out.println("--- Passagem Aerea ---");
        System.out.println();
        System.out.println("Numero do Voo: " + numVoo);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
    }

    @Override
    public String toString() {
        return "Voo " + numVoo + " | " + origem + " -> " + destino + " | Assentos: " + assentoDisponivel;
    }
}
