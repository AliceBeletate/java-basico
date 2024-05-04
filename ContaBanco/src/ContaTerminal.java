import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da sua agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta:");
        int conta = scanner.nextInt();

        double saldo = 237.48;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco! Sua agencia é " + agencia
                + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponivel para saque.");

        scanner.close();
    }
}
