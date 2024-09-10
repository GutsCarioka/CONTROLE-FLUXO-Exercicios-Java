public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

        //Demostração de If Ternario.  : = Else, ? = Print da resposta caso O processo sejá true  
        String resultado = nota >=7 ? "Aprovado" : nota >=5 || nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        if(nota >= 7)
         System.out.println("Aprovado");

        else if (nota >=5 || nota < 7) {
            System.out.println("Prova de recuperação");
            
        }
        
        else
         System.out.println("Reprovado");
    }
}
