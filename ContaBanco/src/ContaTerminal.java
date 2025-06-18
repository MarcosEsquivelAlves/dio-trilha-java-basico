import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);


        System.out.println("SEJA BEM VINDO AO SANTANDER");
        System.out.println("------------------------------");
        System.out.println("Vamos criar sua nova conta?");
        System.out.println("(S) SIM / (N) NÃO");
        String resposta = scanner.nextLine().trim().toLowerCase();
        if (resposta.equals("s") || resposta.equals("sim")) {
            System.out.println("Vamos dar continuidade a abertura de sua conta!");
            System.out.println("-----------------------");

            System.out.println("Digite seu nome e sobrenome, por favor.");
            var nomeCliente = scanner.nextLine();
            System.out.println("\n\n");

            System.out.println("Por favor, digite o número da Agência: ");
            var agencia = scanner.nextLine();
            System.out.println("\n\n");

            System.out.println("Por favor, digite o número da conta: ");
            var conta = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n\n");

            System.out.println("Por favor, digite o saldo a ser depositado: ");
            var saldo = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("\n\n");

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque.");
                    System.out.println("------------------------------");
        } else {
            System.out.println("Você optou por não continuar, o programa será encerrado!");
            System.exit(0);
        }
        scanner.close();
    }
}
