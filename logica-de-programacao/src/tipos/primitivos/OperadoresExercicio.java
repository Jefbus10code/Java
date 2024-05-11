package tipos.primitivos;

public class OperadoresExercicio {

        public static void main (String[]args){

            String gameRPG = "Hogwarts Legacy";
            String gameIndie = "Hollow Knight";

            int age = 35,code = 2367;
            char gender = 'M';

            double priceRPG = 107.80;
            double priceIndie = 46.99;

            double mediaQuebrada = (priceRPG + priceIndie)/2;
            int mediaArredondada = ( (int)priceRPG + (int)priceIndie)/2;



            System.out.println(gameRPG + ", está custando "+ priceRPG);
            System.out.println(gameIndie + ", está custando "+ priceIndie);

            System.out.println("O comprador tinha "+ age+ " anos , code "+ code+" e gênero: "+ gender);
            System.out.println("Média de valor de R$ "+ mediaQuebrada);
            System.out.println("Média de valor de R$ "+ mediaArredondada);

            System.out.printf("A media de preço dos produtos é igual : %.2f ",mediaQuebrada);


        }



}
