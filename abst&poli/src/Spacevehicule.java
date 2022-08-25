/**
 * Representa el objeto Spacevehicule que a su vez es la clase padre de las
 * otras y a la vez abstracta
 * 
 * @author Andrés Castro
 */
public abstract class Spacevehicule {
    /**
     * Representa el atributo para identificar el nombre de la nave
     */
    private String name;
    /**
     * Representa el atributo para identificar el año en que se fabricó o lanzó la
     * nave
     */
    private Integer year;

    /**
     * Representa al constructor de la nave
     * 
     * @param name
     * @param year
     */
    public Spacevehicule(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    /**
     * 
     * @return Devuelve el nombre de la nave
     */
    public String getName() {
        return name;
    }

    /**
     * Define el nombre de la nave creada
     * 
     * @param name Nombre de la nave
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return Devuelve el año en que se fabricó o lanzó la nave
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Define el año en que se fabricó o lanzó la nave
     * 
     * @param year Año de fabricación o lanzamiento
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Metodo abstracto que deben utilizar las clases que heredan para arrancar la
     * nave
     */
    public abstract void start();

    /**
     * Metodo abstracto que deben utilizar las clases que heredan para lanzar la
     * nave
     */
    public abstract void launch();
}