import java.util.Scanner;

public class Metodos {

    int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    void punto1(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        System.out.println("El factorial de " + numero + " es: " + factorial(numero));

        scanner.close();
    }
}
