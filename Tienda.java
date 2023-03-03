import java.util.ArrayList;

public class Tienda {
 //ATRIBUTOS   
ArrayList<Producto> productos;

//CONSTRUCTORES
public Tienda(ArrayList<Producto> productos) {
    this.productos = productos;
}
//METODOS
public void agregarProducto(Producto p){
    this.productos.add(p);
}

public void mostrarProducto() {
    for(Producto p:productos){
        System.out.println(p);
    }
    
}


}
