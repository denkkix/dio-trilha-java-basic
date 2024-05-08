import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int numero;  
        String agencia; 
        String nomeCliente; 
        double saldo; 

        System.out.print("Informe seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Insira o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("Insira o número da conta: ");
        numero = sc.nextInt();

        System.out.print("Agora por ultimo, informe seu saldo: ");
        saldo = sc.nextDouble();

        System.out.print("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();

    }
}
