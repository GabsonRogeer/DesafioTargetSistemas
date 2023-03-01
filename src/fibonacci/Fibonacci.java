/*TODO: 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma
    dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem
     que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
     avisando se o número informado pertence ou não a sequência.
     IMPORTANTE:
     Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;*/

package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        if (isFibonacci(num)) {
            System.out.println("F" + num + " = " + fibo(num));
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("F" + num + " = " + fibo(num));
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return (b == num);
    }

    public static int fibo(int i) {
        if (i < 2) {
            return i;
        } else {
            return fibo(i - 1) + fibo(i - 2);
        }
    }
}

