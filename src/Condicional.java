public class Condicional {

    public static void main(String[] args) {
         int anoDeLancamento = 2021;
         boolean incluidoNoPlano = false;
         double notaDoFilme = 8.1;
         String plano ="basic";

         if(anoDeLancamento >= 2022){
             System.out.println("Lançamento que os clientes etsão curtindo");
         }else {
             System.out.println(" Filme que vale a pena ver");
         }

        if(incluidoNoPlano == true || plano.equals("plus")){
            System.out.println("filme liverado");
        } else{
            System.out.println("acesso negado");
        }
    }
}
