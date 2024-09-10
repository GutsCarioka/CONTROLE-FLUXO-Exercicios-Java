public class CaixaEletronico {
    //Teste de Controle de Fluxo 
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo ){
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo Atual: " + saldo);
        }else
            System.out.println("Saldo Insuficiente: " + saldo);

    }

}
