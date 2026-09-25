import java.util.Scanner;
public class ArregloVentas{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double [][] ventas = new double[12][3];
        int opcion;

        do{
            System.out.println("---VENTAS MENSUALES---\n1- Registrar venta\n2- Buscar venta\n3- Eliminar venta\n4- Mostrar tabla\n5- Salir");
            System.out.print("Ingresa la opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("---Registrar Venta---\nMes(1-12): ");
                    int regVentaMes = teclado.nextInt();
                    System.out.print("Departamento (0 = Ropa, 1 = Deportes, 2 = Juguetería): ");
                    int regDepMes = teclado.nextInt();
                    System.out.print("Monto: $");
                    double monto = teclado.nextDouble();

                    agregarVenta(ventas, regVentaMes, regDepMes, monto);
                    break;

                case 2:
                    System.out.print("---Buscar Venta---\nMes(1-12): ");
                    int busMes = teclado.nextInt();
                    System.out.print("Departamento a buscar (0 = Ropa, 1 = Deportes, 2 = Juguetería): ");
                    int depMes = teclado.nextInt();
                    
                    buscarVenta(ventas, busMes, depMes);
                    break;

                case 3:
                    System.out.print("---Eliminar Venta---\nMes a eliminar (1-12): ");
                    int eliMes = teclado.nextInt();
                    System.out.print("Departamento a eliminar (0 = Ropa, 1 = Deportes, 2 = Juguetería): ");
                    int eliDep = teclado.nextInt();
                    
                    eliminarVenta(ventas, eliMes, eliDep);
                    break;

                case 4:
                    imprimirTabla(ventas);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
            
                default:
                    System.out.println("Error: Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);
        
        teclado.close();
    }


    public static void agregarVenta(double [][] ventas, int mes, int departamento, double monto){
            if (mes >= 1 && mes <= 12 && departamento >= 0 && departamento <= 2) {
            ventas[mes - 1][departamento] = monto;
            System.out.println("Venta registrada");
        } else {
            System.out.println("Error: Mes o departamento no encontrado");
        }
    }

    public static void buscarVenta(double[][] ventas, int mes, int departamento){
            if (mes >= 1 && mes <= 12 && departamento >= 0 && departamento <= 2) {
            System.out.println("La venta es: $" + ventas[mes - 1][departamento]);
        } else {
            System.out.println("Error: Mes o departamento no encontrado");
        }
    }

    public static void eliminarVenta(double[][] ventas, int mes, int departamento) {
    if (mes >= 1 && mes <= 12 && departamento >= 0 && departamento <= 2) {
        ventas[mes - 1][departamento] = 0.0;
        System.out.println("Venta eliminada");
    } else {
        System.out.println("Error: Mes o departamento no encontrado");
    }
    }

    //Método extra para imprimir tabla
    public static void imprimirTabla(double[][] ventas) {
    System.out.println("\n=== TABLA DE VENTAS MENSUALES ===");
    System.out.printf("%-15s %-15s %-15s %-15s\n", "Mes", "Ropa", "Deportes", "Juguetería");
    System.out.println("-----------------------------------------------------------------");
    
    String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                             "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    for (int i = 0; i < 12; i++) {
        
        System.out.printf("%-15s" , nombresMeses[i]);
        
        for (int j = 0; j < 3; j++) {
            System.out.printf("$%-14.2f" , ventas[i][j]);
        }
        System.out.println(); 
    }
    System.out.println("-----------------------------------------------------------------");
    }

}