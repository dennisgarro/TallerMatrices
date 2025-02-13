import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0, d = 0;
        System.out.println("ingrese el punto que desea visualizar desde el 1 hasta 11");
        opt = sc.nextInt();
        System.out.println("ingrese la dimension de la matriz");
        d = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.println("es el el punto 1");
                break;
            case 2:
                System.out.println("es el punto 2");
                break;

            default:
                System.out.println("pagina en mantenimiento");
                break;
        }
    }
}