package atividade_Conta_Bancaria;

public class Caixa {
    public static void main(String[] args) {
        ContaBancaria jarvis = new ContaBancaria("Jarvis", "123.456.789-01" );

        jarvis.info();
        jarvis.depositar(200.0);
        jarvis.sacar(900.0);

    }

}
