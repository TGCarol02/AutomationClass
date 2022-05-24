import java.util.Vector;

public class Orden {
    private int idOrden; /* Atributo que identifica los ítems del pedido por medio de un vector
    de Líneas de Pedido */
    private Vector itemsPedido;
    /**
     * Constructor de la clase Orden
     * @param idOrden Parámetro que define el identificador de la
     * orden de pedido
     */
    public Orden(int idOrden) {
        this.idOrden = idOrden;
        itemsPedido = new Vector(); // Crea el vector de líneas de pedido
    }
/**
 * Método que obtiene el identificador de una orden de pedido
 * @return El identificador de una orden de pedido
 */
public int getIdOrden() {
    return idOrden;
}
    /**
     * Método que establece el identificador de una orden de pedido
     * @param idOrden Parámetro que define el identificador de una
     * orden de pedido
     */
    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }
    /**
     * Método que calcula el total de una orden de pedido
     * @return El total de una orden de pedido
     */
    public int calcularTotalOrden() {
        int totalOrden = 0;
        for(int i = 0; i < itemsPedido.size(); i++) { /* Recorre el vector de
líneas de pedido */
// Obtiene cada objeto del vector aplicando casting
            LineaPedido línea = (LineaPedido) itemsPedido.elementAt(i);
// Va totalizando la orden mediante la suma de los subtotales
            totalOrden = totalOrden + línea.calcularSubtotalLíneaPedido();
        }
        return totalOrden;
    }
    /**
     * Método que convierte a String los datos de una orden de pedido
     * @return Un String con los datos de una orden de pedido
     */
    public String toString() {
        return "Orden [idOrden = "+ idOrden +"]" + "Items_del_pedido="+ itemsPedido + "TotalOrden = $" + calcularTotalOrden();
    }
/**
 * Método que permite agregar una línea de pedido a la orden
 * @param identificador Parámetro que define el identificador de la
 * línea de pedido
 * @param cantidad Parámetro que define la cantidad de producto
 * solicitado en la línea de pedido
 * @param producto Parámetro que define el producto solicitado en
 * la línea de pedido
  */


    public void añadirItem(int identificador, int cantidad, Producto producto) {
 // Crea una línea de pedido
 LineaPedido línea = new LineaPedido(identificador, cantidad, producto);
 itemsPedido.add(línea); /* Añade la línea de pedido creada al
         * vector de líneas de pedido */
 }


}
