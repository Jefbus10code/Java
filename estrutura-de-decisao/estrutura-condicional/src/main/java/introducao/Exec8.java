package introducao;
import java.util.Scanner;


public class Exec8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    double plBasico, minutosPlano, valorAcimaCem,custoAcimaCem,diferenca,minutosUsados,valorTotal;

    plBasico  =  79.09;
    minutosPlano = 100;
    custoAcimaCem = 2.30;
        System.out.print("Digite os minutos usados : ");
        minutosUsados = sc.nextInt();

 if(minutosUsados <= minutosPlano)     {
     System.out.println("O valor a pagar é "+ plBasico);
 }else if (minutosUsados > minutosPlano){

     valorTotal =((minutosUsados - minutosPlano) * custoAcimaCem)+plBasico;
     System.out.println("O valor a pagar pelo "+ minutosUsados+ " minutos é "+valorTotal);

 }else{

 }







    }
}
