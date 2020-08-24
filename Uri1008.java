import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int nfunc,horas;
        float valorhs,salario;

        nfunc = teclado.nextInt();
        horas = teclado.nextInt();
        valorhs = teclado.nextFloat();

        salario = horas * valorhs;

        System.out.println("NUMBER = " +nfunc);
        System.out.println("SALARY = U$ %.2f\n" +salario);

    }

}        