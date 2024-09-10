public class ExemploBrakeContinue {
    public static void main(String[] args) {
        //Break = Finaliza o laço. Continue = Pula O laço em questão 
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
               // break;
               continue;
            System.out.println(numero);
        }
    }
    
}
