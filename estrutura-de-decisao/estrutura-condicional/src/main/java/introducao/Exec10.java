package introducao;
import java.util.Scanner;

public class Exec10 {


    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);

        double peso, altura ,IMC;
        String nome;


        System.out.print("Insira seu nome : ");
        nome = sc.nextLine();

        System.out.println("Olá "+ nome + " ,vamos calcular seu IMC ");


        System.out.print("Digite seu peso : ");
        peso = sc.nextDouble();

        System.out.println("Agora "+nome+" , precisamos da sua altura : ");
        altura = sc.nextDouble();

        IMC = peso / (altura * altura);


        switch (IMC){
            case (IMC < 18.5 ):
                System.out.println(nome + "esta com um IMC de "+ IMC +" diagnosticado com Magreza");
                break;

            case (IMC >= 18.5 && IMC <= 24.9 ):
                System.out.println(nome + "esta com um IMC de "+ IMC +" diagnosticado com Normal");
                break;
            case (IMC >= 25 && IMC <= 29.9 ):
                System.out.println(nome + "esta com um IMC de "+ IMC +" diagnosticado com Sobrepeso");
                break;
            case (IMC >= 30 && IMC <= 34.9):
                System.out.println(nome + "esta com um IMC de "+ IMC +" diagnosticado com Obesidade Grau 1");
                break;
            case (IMC >= 35 && IMC <=39.9 ):
                System.out.println(nome + "esta com um IMC de "+ IMC +" diagnosticado com Obesidade Grau 2");
                break;
            case (IMC >= 40 ):
                System.out.println(nome + "esta com um IMC de "+ IMC +" diagnosticado com Obesidade Grau 3");
                break;

            default:




        };














    }
};
