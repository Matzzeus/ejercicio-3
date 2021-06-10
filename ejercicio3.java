import java.util.*;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, fact = 1 ;
        System.out.print("ingrese un numero: ");
        n1 = scanner.nextInt();
        if ( n1 > 0 ){
            for ( int i = 1 ;  i <= n1 ; i ++ ){
                fact = fact * i;
                System.out.print( fact );
        }
        System.out.print("el factorial de " + n1 + " es igual a: " + fact);
    } 
        else {
            System.out.print("el factorial no existe");
        }
    }
}