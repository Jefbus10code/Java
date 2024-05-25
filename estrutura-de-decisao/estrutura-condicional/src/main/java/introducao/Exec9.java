package introducao;
import java.util.Scanner;
import java.util.Locale;
import java.util.Calendar;



public class Exec9 {

    public static void main(String[]args){



        Scanner sc = new Scanner(System.in);
        String resultado,dia;

        System.out.print("Digite o dia da semana :> ");
        dia = sc.nextLine();

                try{
                  int numero = integer.parseInt(dia);



        switch(numero){
            case 1:
                System.out.print("Domingo");

        break;

               case 2:
                       System.out.print("Segunda-feira");

        break;

                case 3:
                System.out.print("Terça-feira");

                break;

                case 4:
                System.out.print("Quarta-feira");

                break;

                case 5:
                System.out.print("Quinta-feira");

                break;

                case 6:
                System.out.print("Sexta-feira");

                break;

                case 7:
                System.out.print("Sábado");

            break;

            default:
                resultado = "Valor inválido";
                break;

        };

            } catch (NumberFormatException e){


                           if(dia.contains("Domingo")) {
                               resultado ="1";
                           }else{
                               resultado = "Valor invalido";
                           };

                           System.out.printf("Hoje é o $s´ da semana, ",resultado);



                };
//        System.out.print("Digite o dia da semana :  ");
//            dia = sc.nextInt();
//
//            Calendar c = Calendar.getInstance();
//                c.get(dia);
//
//           System.out.println("O dia da semana é : "+ dia);






    };



};
