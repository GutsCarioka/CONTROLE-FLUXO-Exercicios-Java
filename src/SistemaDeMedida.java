public class SistemaDeMedida {
    public static void main(String[] args) {
        
        /* 
        Processo utilizando If e else normal 
        String sigla = "M";

        if(sigla == "P")
            System.out.println("PEQUENO");
        else if(sigla == "M")
            System.out.println("MEDIO");
        else if (sigla == "G")
            System.out.println("Grande");
        else
            System.out.println("Indefinido");
        */

        //Utilizando Case
        String sigla = "A";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M" :{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("Grande");
            }
            default:
                System.out.println("INDEFIDO");
                
        }
        




    }

    
}
