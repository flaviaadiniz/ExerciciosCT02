import java.util.Scanner;

public class OperacaoMatematica {

    public static void main(String[] args) {

        Saudacao();

        Scanner numeros = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = numeros.nextDouble();
        System.out.println(num1);

        System.out.print("Digite o segundo número: ");
        double num2 = numeros.nextDouble();
        System.out.println(num2);

        Scanner operacao = new Scanner(System.in);
        System.out.print("Digite + para SOMAR; - para SUBTRAIR; * para MULTIPLICAR; / para DIVIDIR: ");
        String op = operacao.next();


        double soma = Somar(num1, num2);
        double subtracao = Subtrair(num1, num2);
        double multiplicacao = Multiplicar(num1, num2);
        double divisao = Dividir(num1, num2);

        switch (op) {
            case "+":
                System.out.printf("RESULTADO: %.2f + %.2f = %.2f", num1, num2, soma);
                break;
            case "-":
                System.out.printf("RESULTADO: %.2f - %.2f = %.2f", num1, num2, subtracao);
                break;
            case "*":
                System.out.printf("RESULTADO: %.2f * %.2f = %.2f", num1, num2, multiplicacao);
                break;
            case "/":
                if (num2 != 0) {
                    System.out.printf("RESULTADO: %.2f / %.2f = %.2f", num1, num2, divisao);
                } else {
                    System.out.println("Erro: não é possível dividir um número por zero.");
                }
                break;
            default:
                System.out.println("A operação solicitada é inválida, não foi possível calcular!");
                break;
        }
    }

    private static void Saudacao() {
        System.out.println("Olá! Vamos fazer uma operação matemática entre dois números!");
    }

    static double Somar(double num1, double num2) {
        return num1 + num2;
    }

    static double Subtrair(double num1, double num2) {
        return num1 - num2;
    }

    static double Multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    static double Dividir(double num1, double num2) { return num1/num2; }

}
