import java.util.Scanner;

public class ContaTerminal {
   public ContaTerminal() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Bem vindo!!!Aperte ENTER para comecar:");
      scanner.nextLine();
      System.out.println("Por favor, digite o numero da agência.");
      String agencia = scanner.next();
      System.out.println("Por favor, digite o numero da conta.");
      int numero = scanner.nextInt();
      System.out.println("Por favor, digite seu nome.");
      String nomeCliente = scanner.next();
      System.out.println("Saldo:");
      double saldo = scanner.nextDouble();
      System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência \u00e9 " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
      
      scanner.close();
   }
}
