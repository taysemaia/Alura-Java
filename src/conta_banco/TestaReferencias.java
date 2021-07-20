package conta_banco;

public class TestaReferencias {
    public static void main(String[] args) {
        conta_banco.Conta primeiraConta = new conta_banco.Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta :)" + segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("é a mesma conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}