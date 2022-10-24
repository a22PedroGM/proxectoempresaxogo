import java.util.*;
import java.lang.Math;

public class empresaXogo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calcularEntrada();
    }
    
    public static void calcularEntrada() {
        int edad, precio;
        
        System.out.println("Indica la edad del cliente");
        edad = input.nextInt();
        if (edad < 0) {
            System.out.println("La edad no es valida");
        } else {
            if (edad < 4 && edad >= 0) {
                precio = 0;
            } else {
                if (edad < 18) {
                    precio = 5;
                } else {
                    precio = 10;
                }
            }
            System.out.println("El precio de la entrada es " + precio);
        }
    }
}
