public class Operadores {
    public static void main(String[] args) {
     /*   //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println("Nome completo: " + nomeCompleto);

//qual o resultado das expressoes abaixo?
        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);*/

        //classe Operadores.java
        int numero = 5;
        System.out.println("Usando Operador unário de valor negativo (-): " + numero);

        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);
        //Imprimindo o numero negativo
        System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
    }
}