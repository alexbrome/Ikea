public abstract class ProductoHogar extends Producto{

    //ATRIBUTO
    protected TipoMaterial material;
    //CONSTRUCTOR

    public ProductoHogar(String nombre, String descripcion, double precio, TipoMaterial material) {
        super(nombre, descripcion, precio);
        this.material = material;
    }
    @Override
    public String toString() {
        
        return super.toString()+"\n"+
        "Tipo de material = "+this.material;
    }
    
}
