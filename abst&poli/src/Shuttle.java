/**
 * Representa el objeto Shuttle(lanzadera) que hereda de Spacevehicule(Nave
 * espacial) y a la vez implementa la interface ISpacevehicule
 * 
 * @author Andrés Castro
 */
public class Shuttle extends Spacevehicule implements ISpacevehicule {
    /**
     * Representa el atributo para identificar la carga que puede soportar la nave
     */
    private Integer load;
    /**
     * Representa el atributo para identificar el peso que tiene la nave
     */
    private Integer weight;
    /**
     * Representa el atributo para identificar el alto que tiene la nave
     */
    private Integer height;
    /**
     * Representa el atributo para identificar la fuerza de empuje que tiene la nave
     */
    private Integer pushingForce;
    /**
     * Representa el atributo para identificar el país de fabricación de la nave
     */
    private String country;

    /**
     * Representa al constructor de la nave lanzadera trayendo los atributos
     * heredados por el padre
     * 
     * @param name         Nombre de la nave
     * @param year         Año en la que fue fabricada o lanzada la nave
     * @param load         Carga maxima que soporta la nave
     * @param weight       Peso de la nave
     * @param height       Altura de la nave
     * @param pushingForce Fuerza de empuje que tienen la nave
     * @param country      País de fabricación de la nave
     */
    public Shuttle(String name, Integer year, Integer load, Integer weight, Integer height, Integer pushingForce,
            String country) {
        super(name, year);
        this.load = load;
        this.weight = weight;
        this.height = height;
        this.pushingForce = pushingForce;
        this.country = country;
    }

    /**
     * 
     * @return Devuelve la carga maxima que soporta la nave
     */
    public Integer getLoad() {
        return load;
    }

    /**
     * Define la carga maxima que soporta la nave creada
     * 
     * @param load Carga maxima que soporta la nave
     */
    public void setLoad(Integer load) {
        this.load = load;
    }

    /**
     * 
     * @return Devuelve el peso de la nave
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Define el peso de la nave creada
     * 
     * @param weight Peso de la nave
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return Devuelve la altura de la nave
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Define la altura de la nave creada
     * 
     * @param height Altura de la nave
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return Devuelve la fuerza de empuje de la nave
     */
    public Integer getPushingForce() {
        return pushingForce;
    }

    /**
     * Define la fuerza de empuje de la nave creada
     * 
     * @param pushingForce
     */
    public void setPushingForce(Integer pushingForce) {
        this.pushingForce = pushingForce;
    }

    /**
     * 
     * @return Devuele el país de fabricación de la nave
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el país de fabricación de la nave
     * 
     * @param country País de fabricación
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Sobreescribe el metodo crewCapacity(La capacidad de albergar tripulación)
     * definido por la interface ISpacevehicule
     */
    @Override
    public Integer crewCapacity(Integer crew) {
        return crew;
    }

    /**
     * Sobreescribe el metodo oxigenCapacity(La capacidad de albergar oxigeno para
     * la tripulación) definido por la interface ISpacevehicule
     */
    @Override
    public Integer oxigenCapacity(Integer oxigen) {
        return oxigen;
    }

    /**
     * Sobreescribe el metodo start(Arranca la nave) definido por la clase abstracta
     */
    @Override
    public void start() {
        System.out.println("El vehículo lanzadera" + getName() + "ha arrancado");
    }

    /**
     * Sobreescribe el metodo launch(Lanza la nave al espacio) definido por la clase
     * abstracta
     */
    @Override
    public void launch() {
        System.out.println("El vehículo lanzadera" + getName() + "ha despegado");
    }
}