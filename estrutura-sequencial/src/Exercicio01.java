/* Exercicio 01 - Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos. Ex.: Saída: SOMA = 40 s*/

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        a = sc.nextInt();
        b = sc.nextInt();
        soma = a + b;

        System.out.println("Soma = " + soma);

        sc.close();

    }

}
