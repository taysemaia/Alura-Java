package conta_banco;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente tayse = new Cliente();
        tayse.nome = "Tayse de Oliveira Maia";
        tayse.cpf = "097.777.777-77";
        tayse.profissao = "programadore";

        Conta contaDeTayse = new Conta();
        contaDeTayse.deposita(300);

        contaDeTayse.titular = tayse;
        System.out.println(contaDeTayse.titular.nome);
        System.out.println(contaDeTayse.titular);
        System.out.println(tayse);
    }
}
