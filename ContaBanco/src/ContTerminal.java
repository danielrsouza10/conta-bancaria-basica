import java.util.Locale;
import java.util.Scanner;

public class ContTerminal {
    
    public static void main(String[] args) {
       
        Scanner conta = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu nome: ");
        String nomeCliente = conta.next();

        System.out.print("Digite o número da conta: ");
        int numeroConta = conta.nextInt();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = conta.next();
       
        System.out.print("Digite o saldo da conta: ");
        double saldoConta = conta.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");





    }
}
