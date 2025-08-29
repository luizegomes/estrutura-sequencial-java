/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor 
unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor 
unitário de cada peça 2. Calcule e mostre o valor a ser pago. */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, qtdPeca1, qtdPeca2;
        double valorUn1, valorUn2, total;
        
        System.out.println("Digite o código do PRIMEIRO produto: ");
        codigoPeca1 = sc.nextInt();
        System.out.println("Insira a quantidade: ");
        qtdPeca1 = sc.nextInt();
        System.out.println("Insira o valor unitário: ");
        valorUn1 = sc.nextDouble();
        
        System.out.println("Digite o código do SEGUNDO produto: ");
        codigoPeca2 = sc.nextInt();
        System.out.println("Insira a quantidade: ");
        qtdPeca2 = sc.nextInt();
        System.out.println("Insira o valor unitário: ");
        valorUn2 = sc.nextDouble();

        total = (qtdPeca1 * valorUn1) + (qtdPeca2 * valorUn2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        
        sc.close();
    }
}
