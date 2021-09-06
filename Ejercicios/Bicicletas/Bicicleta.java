public class Bicicleta {
    private String nroDeSerie;
    private String modelo;
    private int año;
    private float precio;

    public Bicicleta (String nroDeSerie, String modelo, int año){
        this.nroDeSerie = nroDeSerie;
        this.modelo = modelo;
        this.año = año;
    }

    public String getNroDeSerie(){
        return nroDeSerie;
    }

    //C. IMPLEMENTAR LOS MÉTODOS getPrecio, setPrecio
    
    /**
     * +getPrecio : float
     * @return
     */
    public float getPrecio(){
        return precio;
    }

    /**
     * +setPrecio : void
     * @param precio
     */

    public void setPrecio(float precio){
        this.precio = precio;
    }
}
