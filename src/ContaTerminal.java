import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos criar uma conta");
        System.out.println("Primeiro qual o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite aqui seu CPF: ");
        String CPF = scan.nextLine();
        System.out.println("Digite aqui seu email: ");
        String Email = scan.nextLine();
        System.out.println("Digite aqui a senha da conta: ");
        int senha = scan.nextInt();

        System.out.println("Sua conta foi criada!");
        System.out.println("Segue abaixo os dados da sua conta: ");
        System.out.println(nome + " " + CPF + " " +  Email);
        



        
    }
    
}