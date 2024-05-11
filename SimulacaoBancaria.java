import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        double saque;
        double deposito;
        
        while (true) { 
            int opcao = scanner.nextInt(); 
        
            switch (opcao) {
                case 1:
                    deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f\n", saldo);   
                    }else System.out.println("Saldo insuficiente.");
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}