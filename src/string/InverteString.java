/*TODO: 5) Escreva um programa que inverta os caracteres de um string.
   IMPORTANTE:
   a) Essa string pode ser informada através de qualquer entrada de sua
   preferência ou pode ser previamente definida no código;
   b) Evite usar funções prontas, como, por exemplo, reverse;*/

package string;

import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.next();
        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}
