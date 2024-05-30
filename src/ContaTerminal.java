import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira o número da agência !");

        System.out.print("Agência: ");

        int numeroAgencia = scan.nextInt();

        System.out.println("Por favor, insira o número da sua conta com o - (hífen) !");

        System.out.print("Conta: ");

        String numeroConta = scan.next();

        System.out.println("Por favor, insira o seu nome !");

        System.out.print("Nome: ");

        String nomeUsuario = scan.next();

        System.out.println("Por favor, insira o saldo que deseja colocar !");

        System.out.print("Saldo: ");

        double saldo = scan.nextDouble();

        System.out.println("Seja bem vindo, " + nomeUsuario + "! Obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +" e sua conta é "+numeroConta);
        System.out.println("Atualmente seu saldo é de "+saldo+" reais");

    }
}
