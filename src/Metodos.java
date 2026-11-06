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

    int suma(int n){
        if (n <= 1) {
            return n;
        }
        return n + suma(n - 1);
    }

    void punto2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        System.out.println("La suma de 1 hasta " + numero + " es: " + suma(numero));

        scanner.close();
    }

    int potencia(int base, int exponente){
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    void punto3(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        System.out.println(base + " elevado a " + exponente + " es: " + potencia(base, exponente));

        scanner.close();
    }

    int contarDigitos(int n){
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }

    void punto4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        System.out.println("El numero " + numero + " tiene " + contarDigitos(numero) + " digitos");

        scanner.close();
    }
}
