package conta_banco;

public class Conta {
        double saldo;
        int agencia;
        int numero;
        String titular;

        public void deposita(double valor){
                this.saldo += valor;
                System.out.println("O valor " + valor + " foi depositado");
        }
}
