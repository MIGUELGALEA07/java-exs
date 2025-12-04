import java.util.Scanner;

public class Areas {
    
    

    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);
        
        System.out.println("Calculador de áreas: \n1.-Cuadrado\n2.-Círculo");
        
        int op = ed.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("Ingrese el lado del cuadrado: ");
                double l = ed.nextDouble();
                System.out.println("El área es: " + Areacuadrado.computearea(l));
                break;
            case 2:
                System.out.println("Ingrese el radio: ");
                double r = ed.nextDouble();
                System.out.println("El área es: " + Areacirculo.computearea(r));
                break;
            case 3:
                System.out.println("Ingrese la altura: ");
                double h = ed.nextDouble();
                System.out.println("Ingrese la base: ");
                double b = ed.nextDouble();

                System.out.println("El área es: "+Areatriangulo.computearea(h, b));
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        
        // Cerrar el Scanner al finalizar
        ed.close();
    }
}
