import java.util.List;
import java.util.ArrayList;

public class Bicicleteria{

    /**
     * a.DECLARAR LAS VARIABLES bicicletas, ganancias, cantidadDeVentas; -bicicletas
     * : List <Bicicleta> -ganacias : float -cantidadDeVentas : Integer
     */

    private List<Bicicleta> bicicletas;
    private float ganancias;
    private Integer cantidadDeVentas;

    public Bicicleteria(){
        bicicletas = new ArrayList<Bicicleta>();
        cantidadDeVentas = 0;
        ganancias = 0;
    }

    public void venderBicibleta(Bicicleta bicicleta){
        bicicletas.remove(bicicleta);
        cantidadDeVentas++;
        ganancias = ganancias + bicicleta.getPrecio();
    }

    /**
     * b.IMPLEMENTAR EL MÉTODO addBicicleta 
     * +addBicicleata(nuevaBici:Bicicleta):void 
     * @param nuevaBici
     */
    public void addBicicleta(Bicicleta nuevaBici){
        bicicletas.add(nuevaBici);
    }

    /**
     * Punto 3, ejercicio 2
     * +buscarBicicleta(nroSerie:String):Bicicleta     * 
     * @param nroSerie
     * @return
     */
    public Bicicleta buscarBicicleta(String nroSerie){
        for(Bicicleta bici : bicicletas){
            if(bici.getNroDeSerie().equals(nroSerie))
                return bici;            
        }
        return null;
    }

}