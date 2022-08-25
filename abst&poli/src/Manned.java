/**
 * Representa el objeto Manned(tripulado) que hereda de Spacevehicule(Nave
 * espacial) y a la vez implementa la interface ISpacevehicule
 * 
 * @author Andrés Castro
 */
public class Manned extends Spacevehicule implements ISpacevehicule {
    /**
     * Representa el atributo para identificar el peso de la nave
     */
    private Integer weight;
    /**
     * Representa el atributo para identificar la orbita en la cual se mantiene la
     * nave
     */
    private Integer orbit;
    /**
     * Representa el atributo para identificar el país de fabricación de la nave
     */
    private String country;

    /**
     * Representa al constructor de la nave tripulada trayendo los atributos
     * heredados por el padre
     * 
     * @param name    Nombre de la nave
     * @param year    Año en la que fue fabricada o lanzada la nave
     * @param weight  Peso de la nave
     * @param orbit   Orbita a la cual navega la nave
     * @param country País de origen de la nave
     */
    public Manned(String name, Integer year, Integer weight, Integer orbit, String country) {
        super(name, year);
        this.weight = weight;
        this.orbit = orbit;
        this.country = country;
    }

    /**
     * 
     * @return Devuelve el peso de la nave creada
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
     * @return Devuelve la orbita en km con respecto a la tierra en la que orbitá la
     *         nave
     */
    public Integer getOrbit() {
        return orbit;
    }

    /**
     * Define la orbita en km con respecto a la tierra en la que orbitá la neve
     * creada
     * 
     * @param orbit Orbita de la nave
     */
    public void setOrbit(Integer orbit) {
        this.orbit = orbit;
    }

    /**
     * 
     * @return Devuelve el país de fabricación de la nave creada
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el país de fabricación de la nave
     * 
     * @param country
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
        System.out.println("La nave tripulada" + getName() + "ha arrancado");
    }

    /**
     * Sobreescribe el metodo launch(Lanza la nave al espacio) definido por la clase
     * abstracta
     */
    @Override
    public void launch() {
        System.out.println("La nave tripulada" + getName() + "ha despegado");

    }

}