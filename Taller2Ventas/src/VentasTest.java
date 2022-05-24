public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Carpeta",1000);
        Producto producto2 = new Producto(2, "Tinta",  3000);
        Producto producto3 = new Producto(3, "Cinta pegante",800);
        Producto producto4 = new Producto(4, "Cartulina", 600);
        Orden orden = new Orden(1);
        orden.añadirItem(1, 5, producto1);
        orden.añadirItem(2, 3, producto2);
        orden.añadirItem(3, 2, producto1);
        orden.añadirItem(4, 4, producto4);
        orden.calcularTotalOrden();
        System.out.println(orden);
    }

}
