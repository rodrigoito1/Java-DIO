import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta do cliente: ");
        int numeroConta = scanner.nextInt();

        // Consumir a linha restante (o caractere de nova linha deixado no buffer)
        scanner.nextLine();

        System.out.println("Digite a Agência do cliente: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta do cliente: ");
        double saldoCliente = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar a conta em nosso banco. Sua agência é: " + agencia + ", o número da sua conta é: " + numeroConta + ", e seu saldo é: " + saldoCliente);
        
        scanner.close();
    }
}
