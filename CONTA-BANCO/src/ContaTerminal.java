import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
         {
            //Exibir as mensagens para o usuário
            System.out.println("Por favor digite o número da agência: ");
            int numeroAgencia = scanner.nextInt();
            System.out.println("Por favor informe a agência: ");
            String Agencia = scanner.next();
            System.out.println("Por favor digite o seu nome: ");
            String nomeCliente = scanner.next();
            System.out.println("Por favor digite o seu sobrenome: ");
            String sobrenomeCliente = scanner.next();
            System.out.println("Por favor digite o seu saldo: ");
            double saldo = scanner.nextDouble();
            //Obter pelo scanner os valores digitados no terminal
            
            //Exibir a mensagem conta criada
            System.out.println("Olá " + nomeCliente +  " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia +", conta " + numeroAgencia + " e seu saldo "+ saldo + " já está disponível para saque.");
        }
    }
}
