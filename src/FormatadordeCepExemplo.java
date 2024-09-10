public class FormatadordeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvallidoException e) {
            // TODO Auto-generated catch block
           System.out.println("O cep Não Corresponde com as regras de negocio");
        }
    }

static String formatarCep(String cep) throws CepInvallidoException{
    if (cep.length() != 8) 
        throw new CepInvallidoException();

        //Simulando Um cep Formatado
        return "23.765-064";
    

}
}