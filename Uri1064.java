import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int somapositivo = 0;
        float numero, media, somavalores = 0;

        for(int contador =1; contador <-6; contador++){
            numero = teclado.nextFloat();
            somavalores = somavalores + numero;

            if (numero>0){
                somapositivo++;
            }
        }

        media = somavalores/6;
        System.out.printf(somapositivo + "valores positivos");
        System.out.printf(media);

        }
}




