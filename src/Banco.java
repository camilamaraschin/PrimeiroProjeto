import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner Dados = new Scanner(System.in);
        System.out.println(" Digite seu nome completo: ");

        String nome = Dados.nextLine();
        System.out.println(" Tipo de conta");

        String conta = Dados.nextLine();
        System.out.println("Saldo Inicial: ");
        double saldo = Dados.nextDouble();


        System.out.println("Nome:" + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo inicial: "+saldo);

        String menu = """
                Digite uma opção : 
                 1 - Consultar o saldo
                 2- Tranferir valor
                 3- Receber Valor 
                 4 - Sair
                """;

        int opcao = 0;
Scanner leitura = new Scanner(System.in);

        while ( opcao != 4 ){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}