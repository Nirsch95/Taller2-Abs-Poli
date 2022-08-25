/**
 * Representa el objeto Manned(tripulado) que hereda de Spacevehicule(Nave
 * espacial)
 * 
 * @author Andrés Castro
 */
public class Unmanned extends Spacevehicule {
    /**
     * Representa el atributo para identificar la fuerza de empuje inicial que
     * permite que salga de la tierra
     */
    private Integer iniPushingForce;
    /**
     * Representa el atributo para identificar la asociación encargada de la
     * fabricación de la nave
     */
    private String association;
    /**
     * Representa el atributo para identificar si la nave se encuentra o no activa
     */
    private boolean actived;

    /**
     * Representa al constructor de la nave tripulada trayendo los atributos
     * heredados por el padre
     * 
     * @param name            Nombre de la nave
     * @param year            Año en la que fue fabricada o lanzada la nave
     * @param iniPushingForce Fuerza inicial de empuje de la nave
     * @param association     Asociación que fabricó la nave
     * @param actived         Si la nave se encuentra o no activa
     */
    public Unmanned(String name, Integer year, Integer iniPushingForce, String association,
            boolean actived) {
        super(name, year);
        this.iniPushingForce = iniPushingForce;
        this.association = association;
        this.actived = actived;
    }

    /**
     * 
     * @return Devuelve la fuerza de empuje inicial
     */
    public Integer getIniPushingForce() {
        return iniPushingForce;
    }

    /**
     * Define la fuerza de empuje inicial de la nave creada
     * 
     * @param iniPushingForce Fuerza inicial de empuje de la nave
     */
    public void setIniPushingForce(Integer iniPushingForce) {
        this.iniPushingForce = iniPushingForce;
    }

    /**
     * 
     * @return Devuelve el nombre de la asociación que fabricó la nave
     */
    public String getAssociation() {
        return association;
    }

    /**
     * Define el nombre de la asociación que fabricó la nave creada
     * 
     * @param association Asociación que fabricó la nave
     */
    public void setAssociation(String association) {
        this.association = association;
    }

    /**
     * 
     * @return Devuelve el estado de activación de la nave
     */
    public boolean isActived() {
        return actived;
    }

    /**
     * Define el estado de activación de la nave creada
     * 
     * @param actived Si la nave se encuentra o no activa
     */
    public void setActived(boolean actived) {
        this.actived = actived;
    }

    /**
     * Sobreescribe el metodo start(Arranca la nave) definido por la clase abstracta
     */
    @Override
    public void start() {
        System.out.println("La nave no tripulada" + getName() + "ha arrancado");
    }

    /**
     * Sobreescribe el metodo launch(Lanza la nave al espacio) definido por la clase
     * abstracta
     */
    @Override
    public void launch() {
        System.out.println("La nave no tripulada" + getName() + "ha despegado");
    }

}