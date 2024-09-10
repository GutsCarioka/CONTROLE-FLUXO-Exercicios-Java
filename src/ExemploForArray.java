public class ExemploForArray {

    public static void main(String[] args) {

        //em arrays o indice inicia em Zero 
        String alunos[] = {"FELIPE", "JONAS","JULIA","MARCOS"};
    
    for(int x=0; x< alunos.length; x++ ){
        System.out.println("O Aluno no Indice X= "+x+" é "+alunos[x]);
    }
    //Esse é o for each ele ira rodar até que os objetos na array alunos tenham terminados
    //Forma mais enxuta de Fazer um for 
    for (String aluno : alunos) { //for (String Variavel qualquer Vazia : Array)
        System.out.println("O nome do aluno é : "+ aluno);
    }
    }
}
