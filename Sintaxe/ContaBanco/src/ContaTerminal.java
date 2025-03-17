//Importação do Scanner
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //Criando o scanner
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do Saldo:");
        double saldo = scanner.nextDouble();

        //Saida dos dados digitados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " +
                "conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}