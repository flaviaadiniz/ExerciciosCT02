/*
Enunciado: Criar um código para que o usuário digite um número no
terminal e ele retorne dizendo se o número é par ou ímpar.
 */

public class ParOuImpar {

    public static void main(String[] args) {

        int numero = Integer.parseInt(args[0]);
        String mensagem = numero % 2 == 0 ? "Número PAR" : "Número ÍMPAR";
        System.out.print(mensagem);

    }
}