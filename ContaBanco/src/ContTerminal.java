import java.util.Locale;
//importar a classe scanner
import java.util.Scanner;

public class ContTerminal {
    
    public static void main(String[] args) {
        //criar a classe scanner
        Scanner conta = new Scanner(System.in).useLocale(Locale.US);

        //solicitar o input do usuário
        System.out.print("Digite o seu nome: ");
        String nomeCliente = conta.next();

        System.out.print("Digite o número da conta: ");
        int numeroConta = conta.nextInt();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = conta.next();
       
        System.out.print("Digite o saldo da conta: ");
        double saldoConta = conta.nextDouble();

        //apresentação das informações inseridas pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");





    }
}
