import java.util.Scanner;
import java.util.Locale;


public class Input {
    public static void main(String[] args) throws Exception {
        

        //Entrada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Hello, World!");

        try{
        System.out.println("Digite o seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        //Saída

        System.out.println("Caro(a) "+nome+ " sua idade é: "+idade+" e sua altura é de: "+altura);
        
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
       
        
    }
}
