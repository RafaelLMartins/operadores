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
 /*       int numero = 5;
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
    }*/
        //* repetição
      /*  int numero = 5;
        numero ++;
        //numero= numero+1
        System.out.println(numero);
        boolean variavel= false;
        System.out.println(!variavel);
    }*/
        // classe Operadores.java
        int a, b;

        a = 6;
        b = 6;

    /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    String resultado;
    if(a==b)
        resultado = "verdadeiro";
    else
        resultado = "falso";
    */

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);

        String nomeUm= "Rafael";
        String nomeDois="Rafael";
        System.out.println(nomeUm==nomeDois);
        System.out.println(nomeUm.equals(nomeDois));
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 é igual ao numero 2? "+simNao);

        if(numero1 < numero2){
            System.out.println("Essa condição é verdadeira ");
        }

        simNao= numero1 != numero2;
        System.out.println("Numero 1 é diferente de numero 2? "+simNao);

        simNao= numero1 > numero2;
        System.out.println("Numero 1 é maior que numero 2? "+simNao);
    }
}