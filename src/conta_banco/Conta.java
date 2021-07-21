package conta_banco;

public class Conta {
        double saldo;
        int agencia;
        int numero;
        Cliente titular;

        public void deposita(double valor){
                this.saldo += valor;
                System.out.println("O valor " + valor + " foi depositado");
        }

        public boolean saca(double valor){

                if(saldo >= valor){
                        this.saldo -= valor;
                        return true;
                }
                return false;
        }

        public boolean transfere(double valor, Conta destino) {
                if(this.saldo >= valor) {
                        this.saldo -= valor;
                        destino.deposita(valor);
                        return true;
                } else {
                        return false;
                }
        }
}
