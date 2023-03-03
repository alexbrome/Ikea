public abstract class Producto{
    
    //ATRIBUTOS
    protected String nombre;
    protected String descripcion;
    double precio;
    //CONSTRUCTOR
    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    @Override
    public String toString() {
        
        return "Nombre = "+this.nombre+"\n"+
        "Descripcion ="+this.descripcion+"\n"+
        "Precio = "+this.precio;
    }
}