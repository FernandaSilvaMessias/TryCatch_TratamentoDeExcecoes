import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner Scan = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = Scan.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = Scan.next();

            System.out.println("Digite sua idade");
            int idade = Scan.nextInt();

            System.out.println("Digite sua altura");
            double altura = Scan.nextInt();

            System.out.println("Olá, me chamo " + nome.toLowerCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " de idade ");
            System.out.println(" minha altura é : " + altura);
        }catch (InputMismatchException e){
            System.out.println("Os campos: (idade) e (altura) devem ser númericos! ");



           }
        }
    }

