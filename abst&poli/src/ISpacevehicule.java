/**
 * Representa la interface que complementa los comportamientos de unos tipos de nave
 * @author Andrés Castro
 */
public interface ISpacevehicule {
    /**
     * Representa el metodo para identificar si tiene o no la capacidad de llevar tripulación
     * @param crew Tripulación de la nave
     * @return Retorna la cantidad de tripulación 
     */
    public Integer crewCapacity (Integer crew);
    /**
     * Representa el metodo para identificar si tiene o no la capacidad de llevar oxigeno para la tripulación
     * @param oxigen Oxigeno para la tripulación 
     * @return Retorna la cantidad de oxigeno que necesita para la tripulación
     */
    public Integer oxigenCapacity (Integer oxigen); 
}
