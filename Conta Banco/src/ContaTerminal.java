import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o numero da sua conta");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite o numero da agência");
            String numeroAgencia = scanner.next();

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu saldo");
            Double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque");
        
    }
}
