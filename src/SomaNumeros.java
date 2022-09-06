import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {

        if (args.length == 2) {
            double valor1 = Double.parseDouble(args[0]);
            double valor2 = Double.parseDouble(args[1]);
            double resultado = valor1 + valor2;
            System.out.printf("A soma dos números é igual a %.2f", resultado);

        } else if (args.length == 1) {
            double valor1 = Double.parseDouble(args[0]);
            Scanner pedeValor2 = new Scanner(System.in);
            System.out.println("Digite mais um número: ");
            double valor2 = pedeValor2.nextDouble();
            double resultado = valor1 + valor2;
            System.out.printf("A soma dos números é igual a %.2f", resultado);

        } else if (args.length == 0) {
            Scanner pedeValor3 = new Scanner(System.in);
            System.out.println("Digite o primeiro número: ");
            double valor1 = pedeValor3.nextDouble();
            System.out.println("Digite o segundo número: ");
            double valor2 = pedeValor3.nextDouble();
            double resultado = valor1 + valor2;
            System.out.printf("A soma dos números é igual a %.2f", resultado);
        } else {
            System.out.println("Erro: quantidade de números inválida!");
        }
    }
}
