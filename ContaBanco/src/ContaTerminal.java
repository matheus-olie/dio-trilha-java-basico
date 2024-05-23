import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //solicitando as informações da conta (numero, agencia, nome do cliente e saldo)
        
        System.out.println("Por favor, digite o número da sua Conta Bancária!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Agência!");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, informe o seu nome e sobrenome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o valor do Saldo de abertura da sua conta!");
        double saldo = scanner.nextDouble();

        //Imprimindo os dados informados pelo usuário

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo no valor de R$ " + saldo + " já está disponível para saque.");

    }
}
