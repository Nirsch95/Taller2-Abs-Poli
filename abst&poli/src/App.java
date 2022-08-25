import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion, fopcion = 0;
        String name;
        Integer year;
        ArrayList<Spacevehicule> Spacevehicules = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Bienvenido");
            System.out.println("Vamos a crear diferentes naves de su elección y datos proporcionados por usted.");
            System.out.println("¿Qué tipo de nave espacial desea agregar?");
            System.out.println("1. Vehículo Lanzadera");
            System.out.println("2. Nave no tripulada");
            System.out.println("3. Nave tripulada");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Nombre de la nave");
                    name = input.next();
                    System.out.println("Fecha de lanzamiento/fabricación");
                    year = input.nextInt();
                    System.out.println("Capacidad de carga");
                    Integer load = input.nextInt();
                    System.out.println("Peso de la nave");
                    Integer weight = input.nextInt();
                    System.out.println("Altura de la nave");
                    Integer height = input.nextInt();
                    System.out.println("Fuerza de empuje de la nave");
                    Integer push = input.nextInt();
                    System.out.println("País del cual fue fabricado");
                    String country = input.next();
                    Spacevehicule shuttle = new Shuttle(name, year, load, weight, height, push, country);
                    Spacevehicules.add(shuttle);
                    break;
                case 2:
                    System.out.println("Nombre de la nave");
                    name = input.next();
                    System.out.println("Fecha de lanzamiento/fabricación");
                    year = input.nextInt();
                    System.out.println("Fuerza de empuje inicial de la nave");
                    Integer inition = input.nextInt();
                    System.out.println("Asociacion encargada de la fabricación de la nave");
                    String association = input.next();
                    System.out.println("Se encuentra actualmente activo");
                    boolean actived = input.nextBoolean();
                    Spacevehicule unmanned = new Unmanned(name, year, inition, association, actived);
                    Spacevehicules.add(unmanned);
                    break;
                case 3:
                    System.out.println("Nombre de la nave");
                    name = input.next();
                    System.out.println("Fecha de lanzamiento/fabricación");
                    year = input.nextInt();
                    System.out.println("Peso de la nave");
                    Integer weight2 = input.nextInt();
                    System.out.println("Asociacion encargada de la fabricación de la nave");
                    Integer orbit = input.nextInt();
                    System.out.println("Se encuentra actualmente activo");
                    String country2 = input.next();
                    Spacevehicule manned = new Manned(name, year, weight2, orbit, country2);
                    Spacevehicules.add(manned);
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestro sistema, ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Esa opción elegida no esta disponible");
            }
            System.out.println("¿Desea continuar?");
            System.out.println("(1)Si (0)No");
            fopcion = input.nextInt();
        } while (fopcion != 0);
    }
}
