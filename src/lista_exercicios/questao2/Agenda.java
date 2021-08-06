package lista_exercicios.questao2;

//Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes
//        operações: void armazenaPessoa(String nome, int idade, float altura); void removePessoa(String
//        nome); int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa void
//        imprimeAgenda(); // imprime os dados de todas as pessoas da agenda void imprimePessoa(int
//        index); // imprime os dados da pessoa que está na posição “i” da agenda.

import java.util.ArrayList;
import java.util.List;

public class Agenda {

   private List<Pessoa> pessoas = new ArrayList<>();

    public boolean armazenaPessoa(String nome, int idade, float altura) {
        Pessoa p = new Pessoa(nome, idade, altura);
        if (pessoas.size() <= 10) {
            pessoas.add(p);
            return true;
        }
        return false;
    }

    public void removePessoa(String nome){
        int pessoa = buscaPessoa(nome);

        if(pessoa != -1) {
            pessoas.remove(pessoa);
        }
    }

    public int buscaPessoa(String nome){
        for(int i = 0; i < pessoas.size(); i++ ){
            if(pessoas.get(i).getNome().equals(nome)){
                return i;
            }
        }
        return -1;
    }
    public void imprimeAgenda(){

        for(Pessoa p : pessoas){
            System.out.println(p.getNome());
            System.out.println(p.getAltura());
            System.out.println(p.getIdade());
        }
    }

    public void imprimePessoa(int index) {
        if (index <= pessoas.size() - 1 && index > -1){
            System.out.println(pessoas.get(index).getNome());
            System.out.println(pessoas.get(index).getAltura());
            System.out.println(pessoas.get(index).getIdade());
        }

    }
}
