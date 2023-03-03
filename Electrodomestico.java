public class Electrodomestico extends ProductoHogar{
  
    //ATRIBUTOS
    public TipoEficiencia eficiencia;
    //CONSTRUCTOR
    public Electrodomestico(String nombre, String descripcion, double precio, TipoMaterial material,TipoEficiencia eficiencia) {
        super(nombre, descripcion, precio, material);
        this.eficiencia=eficiencia;
    }
    
}
