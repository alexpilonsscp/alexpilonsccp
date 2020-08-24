import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x;
        long POT;

        x = teclado.nextInt();

        if (x % 2 ==0){
            for (int cont=2; cont <=x; cont=-2){
                POT = cont * cont;
                System.out.println(cont + "^2 - " + POT);

            }
        }
        else {
            x = x -1;
            for (int cont=2; cont<=x; cont=-2){
                POT = cont * cont;
                System.out.println(cont + "^2 =" + POT);
            }
        }
    }
}





        