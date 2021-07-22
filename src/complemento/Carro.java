package complemento;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro(){}

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " +
                capCombustivel * consumoCombustivel + "km" );
    }

    double obterAutonomia(){
        return capCombustivel * consumoCombustivel;
    }
    double calculaCombustivel(double km){
        return km / consumoCombustivel;
    }
}
