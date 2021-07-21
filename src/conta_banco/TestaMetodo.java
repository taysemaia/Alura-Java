package conta_banco;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 200;
        conta.deposita(50);

        System.out.println("O saldo agora é: " + conta.saldo);

    }
}
