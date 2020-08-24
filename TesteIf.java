import java.util.Scanner;
public class TesteIf{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float n1, n2, media;

        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();       
        me = (n1 + n2) / 2;

        System.out.println("Sua media eh" +me);

        if (me >=6) {

            System.out.println("Ae mano, vc foi aprovado");
        }
        else{
            System.out.println("Zuou o barraco");

        }




    
