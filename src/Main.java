import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da número da Conta: ");
        contaTerminal.numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        contaTerminal.agencia = scanner.next();

        scanner.nextLine();
        System.out.print("Por favor, digite o seu nome: ");
        contaTerminal.nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldoInicial = scanner.nextDouble();
        contaTerminal.setSaldo(saldoInicial);


        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                contaTerminal.nomeCliente, contaTerminal.agencia, contaTerminal.numero, contaTerminal.getSaldo()));

    }

}
