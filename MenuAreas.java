import java.util.Scanner;

public class MenuAreas { public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
int opcion; do {
System.out.println(“=== MENU DE AREAS ===”); 
System.out.println(“1. Area del cuadrado”); 
System.out.println(“2. Area del triangulo”);
System.out.println(“3. Area del circulo”); 
System.out.println(“4. Area del pentagono”); 
System.out.println(“5. Area del hexagono”);

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el lado: ");
                    double lado = sc.nextDouble();
                    System.out.println("Área del cuadrado: " + (lado * lado));
                    break;

                case 2:
                    System.out.println("Ingresa la base: ");
                    double b = sc.nextDouble();
                    System.out.println("Ingresa la altura: ");
                    double h = sc.nextDouble();
                    System.out.println("Área del triángulo: " + ((b * h) / 2));
                    break;

                case 3:
                    System.out.println("Ingresa el radio:");
                    double r = sc.nextDouble();
                    System.out.println("Área del círculo: " + (Math.PI * r * r));
                    break;

                case 4:
                    System.out.println("Ingresa el lado del pentágono:");
                    double ladoP = sc.nextDouble();
                    System.out.println("Ingresa la apotema:");
                    double apotemaP = sc.nextDouble();
                    double perimetroP = 5 * ladoP;
                    double areaP = (perimetroP * apotemaP) / 2;
                    System.out.println("Área del pentágono: " + areaP);
                    break;

                case 5:
                    System.out.println("Ingresa el lado del hexágono:");
                    double ladoH = sc.nextDouble();
                    System.out.println("Ingresa la apotema:");
                    double apotemaH = sc.nextDouble();
                    double perimetroH = 6 * ladoH;
                    double areaH = (perimetroH * apotemaH) / 2;
                    System.out.println("Área del hexágono: " + areaH);
                    break;
            }
        } while (opcion >= 1 && opcion <= 5);
        sc.close();
    }

}
