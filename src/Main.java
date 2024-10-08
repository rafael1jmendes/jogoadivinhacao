//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroGerado = new Random().nextInt(31); // gera o numero aleatorio
        /*System.out.println("Numero gerado: " + numeroGerado); // para depuração*/

        int tentativas = 0;
        int numeroDigitado = 0;

        while ( tentativas < 5 ) {
            System.out.println("Digite um numero entre 0 e 30: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if ( numeroDigitado == numeroGerado ) {
                System.out.println("Parabens, voce acertou o numero em " + tentativas);
                break; //pausa o loop
            }   else if ( numeroDigitado > numeroGerado ) {
                System.out.println("O numero digitado e menor que o numero gerado");
            } else {
                System.out.println("O numero digitado e maior que o numero gerado");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("voce nao conseguiu acertar o numero em 5 tentativas");
        }
    }
}
