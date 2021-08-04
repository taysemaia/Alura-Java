package bytebank.herdado;

//bytebank.herdado.Gerente eh um bytebank.herdado.Funcionario, bytebank.herdado.Gerente herda da class bytebank.herdado.Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do bytebank.herdado.Designer");
		return 200;
	}	

}
