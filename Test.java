public class Test {
    public static void main(String[] args) {
        
     Mueble estanteria=new Mueble("kallax", "2 metros de alto y blanca", 150.99, TipoMaterial.MADERA);
     ArticuloDecoracion flexo=new ArticuloDecoracion("Forsa", "con bombilla led", 29.99 , TipoMaterial.PLASTICO);


     Tienda poligonoSevilla=new Tienda(null);
     poligonoSevilla.agregarProducto(estanteria);
     poligonoSevilla.agregarProducto(flexo);
     System.out.println(poligonoSevilla.toString()); 

    }
}
