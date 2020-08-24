import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x,contador;
        contador = 1;

        x = teclado.nextInt();

        if (x % 2 ==0){
            x ++;
        }
        while (contador <=6){
            System.out.println(x);
            x +=2;
            contador ++;
        }
    }
}



