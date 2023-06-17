import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double avaliacao =0;
        double nota =0;

        for (int i = 0; i <3; i++){
            System.out.println("Diga sua nota para o filme ");
            nota = leitura.nextDouble();
            avaliacao += nota;
        }
        System.out.println( "A media da avaliação é: " + avaliacao/3);

    }

}
