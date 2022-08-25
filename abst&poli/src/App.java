/**
 * Representa el codigo principal de ejecución
 * Importa las librerias pertinentes
 * @author Andrés Castro
 */
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    /**
     * La clase principal de ejecución del codigo
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /**
         * Variables utilizada para decidir lo que hacer en el cuerpo del codigo
         */
        int opcion, fopcion = 0;
        /**
         * Variables que almacenan los valores necesarios para enviarle a los objetos
         */
        String name;
        Integer year;
        /**
         * Array que almacena todos los objetos creados tipo nave espacial
         */
        ArrayList<Spacevehicule> Spacevehicules = new ArrayList<>();
        /**
         * Importamos la clase Scanner para recibir información por teclado
         */
        Scanner input = new Scanner(System.in);
        /**
         * Estructura de control do para ejecutar el codigo las veces que el usuario lo
         * desee
         */
        do {
            System.out.println("Bienvenido");
            System.out.println("Vamos a crear diferentes naves de su elección y datos proporcionados por usted.");
            System.out.println("¿Qué tipo de nave espacial desea agregar?");
            System.out.println("1. Vehículo Lanzadera");
            System.out.println("2. Nave no tripulada");
            System.out.println("3. Nave tripulada");
            opcion = input.nextInt();
            /**
             * Estructura de desición para hacer la acción que desea realizar el usuario
             */
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
                    /**
                     * Creamos la nave espacial utilizando el constructor necesario con las
                     * variables necesarias para su creación
                     */
                    Spacevehicule shuttle = new Shuttle(name, year, load, weight, height, push, country);
                    /**
                     * Almacenamos la nave creada
                     */
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
                    /**
                     * Creamos la nave espacial utilizando el constructor necesario con las
                     * variables necesarias para su creación
                     */
                    Spacevehicule unmanned = new Unmanned(name, year, inition, association, actived);
                    /**
                     * Almacenamos la nave creada
                     */
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
                    /**
                     * Creamos la nave espacial utilizando el constructor necesario con las
                     * variables necesarias para su creación
                     */
                    Spacevehicule manned = new Manned(name, year, weight2, orbit, country2);
                    /**
                     * Almacenamos la nave creada
                     */
                    Spacevehicules.add(manned);
                    break;
                default:
                    /**
                     * Mensaje que aparece en caso de no elegir una opcion correcta
                     */
                    System.out.println("Esa opción elegida no esta disponible");
            }
            /**
             * Decisión para acabar el programa
             */
            System.out.println("¿Desea continuar?");
            System.out.println("(1)Si (0)No");
            fopcion = input.nextInt();
            if (fopcion == 0) {
                System.out.println("Gracias por usar nuestro sistema, ¡Hasta pronto!");
            }
        } while (fopcion != 0);
    }
}
