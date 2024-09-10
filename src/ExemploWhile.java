import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada >0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce >= mesada){ //IF para verificar se o valor do doce é maior que a mesada
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: "+ valorDoce + "Adicionado Ao Carrinho" );
            mesada -= valorDoce;

            
        }
        System.out.println("Mesada: "+ mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces ");

       
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
