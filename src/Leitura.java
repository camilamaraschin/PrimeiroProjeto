import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //rastrear alguma entrada
        System.out.println("digite seu filme favorito");

        String filme = leitura.nextLine(); //leitura de um texto e armazernar a informação
        System.out.println("Qual o ano de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("qual sua nota para esse filme");
        double avaliacao = leitura.nextDouble();



        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
