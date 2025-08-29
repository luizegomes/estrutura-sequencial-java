/*  
Fazer um programa que leia o número de um funcionário, seu número de horas 
trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas decimais. */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, hrs;
        double valorHrs, salario;
        
        System.out.println("Insira o número de matrícula do funcionário: ");
        n = sc.nextInt();
        System.out.println("Insira o número de horas trabalhadas: ");
        hrs = sc.nextInt();
        System.out.println("Insira o valor que recebe por hora: ");
        valorHrs = sc.nextDouble();

        salario = (double) hrs * valorHrs;

        System.out.printf("NUMBER = %d%n", n);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        sc.close();
    }
}
