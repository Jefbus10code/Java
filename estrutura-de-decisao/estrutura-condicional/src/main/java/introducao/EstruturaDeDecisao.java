package introducao;

public class EstruturaDeDecisao {

    public static void main(String[]args){

    double n1,n2,n3,media;

    n1 = 8.5;
    n2 = 2;
    n3 = 2.4;

    media = (n1+n2+n3)/3.0;

    if(media >= 7.0 ){


        System.out.println("Sua media foi " +media+" , e vc fora aprovado .");


    }else if(media >= 5.0 && media < 7.0){

            System.out.println("Sua media foi " +media+" , e vc esta de recuperação .");



        }else{
        System.out.printf("Sua media foi %.1f , e vc fora reprovado .\n",media);

    }

        System.out.println("Muito obrigado por tirar a média conosco ");



}
}