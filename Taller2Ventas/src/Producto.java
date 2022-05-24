public class Producto {
    private int idProducto; /* Atributo que representa el identificador
de un producto */
    private String nombre; // Atributo que identifica el nombre de un producto
    private int precio; // Atributo que identifica el precio de un producto
    /**
     * Constructor de la clase Producto
     * @param idProducto Parámetro que define el identificador de un
     * producto
     * @param nombre Parámetro que define el nombre de un producto
     * @param precio Parámetro que define el precio de un producto
     */
    public Producto(int idProducto, String nombre,int precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;}
    /**
     * Método que obtiene el identificador de un producto
     * @return El identificador de un producto
     */
    public int getIdentificador() {
        return idProducto;
    }
    /**
     * Método que establece el identificador de un producto
     * @param idProducto Parámetro que define el identificador de un
     * producto
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    /**
     * Método que obtiene el nombre de un producto
     * @return El nombre de un producto
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que establece el nombre de un producto
     * @param nombre Parámetro que define el nombre de un producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que obtiene el precio de un producto
     * @return El precio de un producto
     */
    public int getPrecio() {
        return precio;
    }
    /**
     * Método que establece el precio de un producto
     * @param precio Parámetro que define el precio de un producto
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    /**
     * Método que convierte a String los datos de un producto
     * @return Un String con los datos concatenados de un producto
     */
    public String toString() {
        return "idProducto =" + idProducto + ", nombre = " + nombre + ", precio = " + precio;
    }

}
