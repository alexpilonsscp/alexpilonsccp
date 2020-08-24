import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float A, B, C;
        float perimetro, area;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        perimetro = A + B + C;
        area = ((A  + B) / 2) * C;

        if ((A + B > C) && ( A + C > B) && ( B + C > A)){
            System.out.printf("perimetro = %.1f\n", perimetro);
            }

        else {
            System.out.printf("perimetro = %.1f\n", area);
            }

        }

}
