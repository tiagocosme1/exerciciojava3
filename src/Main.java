//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        double diferenca;
        diferenca = (A * B - C * D);

        System.out.printf("a diferenca eh: %.2f%n", diferenca);

        sc.close();
    }
}
