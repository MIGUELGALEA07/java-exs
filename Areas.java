public class Areas(
Run | Debug 1 Run main | Debug main public static void main(String(] args)(
Scanner ed • new Scanner (Systen. in) ;
System. out-printin(x: "Calculador de areas: \n1.-Cuadrado\n2.-Circulo") ;
int op = ed.nextInt();
switch
(op) (
case 1:
System.out-printIn(x: "Ingrese el lado del circulo: ");
double l = ed.nextDouble();
Systen.out.printIn("El área es: "+AreaCuadrado.computearea(1)):
break;
case 2:
system.out-printIn(x: "Ingrese el radio: "):
double r = ed.nextDoublel):
Systen.out-print In("El área es: "+AreaCirculo.computearea(r));
break;
default:
System.out-printIn(x: "Opcion no valida"): break;
ed.close();
}
}
