import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        int numero;
        int count = 0;
        int quantPares = 0;
        int quantImpares = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
                    else quantImpares++;

            count++;

        } while(count < quantNumeros);
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }
}