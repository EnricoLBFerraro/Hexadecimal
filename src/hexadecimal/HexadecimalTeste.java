
package hexadecimal;
import java.util.Scanner;
public class HexadecimalTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número a ser convertido: ");
        int numero = input.nextInt();
        Hexadecimal num = new Hexadecimal(numero);
        num.Calcula();
    }
}
