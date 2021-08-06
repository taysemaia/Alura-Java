package lista_exercicios.questao1;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        String nome = "Tayse";
        String dataNascimento = "10/12/1997";
        String altura = "1,60";

        pessoa.setNome(nome);
        pessoa.setAltura(altura);
        pessoa.setDataDeNascimento(dataNascimento);

        pessoa.imprimirInformacoes();
        System.out.println("A idade de " + nome
                +" é: " + pessoa.calculaIdade(dataNascimento));

    }

}
