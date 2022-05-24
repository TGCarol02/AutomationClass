public class Persona {
    private int idPersona; // Identificador único de cada objeto persona
    private String nombre, apellidos;// Nombre de cada objeto persona

    private int edad;// Edad de cada objeto persona
    private static int contadorPersonas=0; // Contador de registros para cada objeto persona

    //Constructor
    public Persona (String nombre, String apellidos, int edad, int idPersona){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.idPersona=idPersona;
        contadorPersonas++;
    }

    //Método para establecer el nombre de una persona
    public void setNombre (String valornombre){
        nombre = "nombre" + valornombre; //El nombre del objeto persona adquiere el valor que contenga valornombre
    }
    //Método para establecer los apellidos de una persona
    public void setApellidos (String valorapellidos){
        apellidos = "apellidos" + valorapellidos;// los apellidos del objeto persona adquiere el valor que contenga valorapellidos
    }
    //Método para establecer la edad de una persona
    public void setEdad (int valoredad){
        edad = valoredad;//la edad del objeto persona adquiere el valor que contenga valor edad
    }

    //Método para obtener el Id del objeto persona
    public int getidPersona (){ return idPersona; }
    //Método para obtener el nombre del objeto persona
    public String getNombre (){ return nombre; }
    //Método para obtener los apellidos del objeto persona
    public String getApellidos () { return apellidos; }
    //Método para obtener la edad del objeto persona
    public int getEdad () { return edad; }
    public int getcontadorPersonas() { return idPersona; }

    @Override
    public String toString() {
        return "Persona{"+
                "idPersona="+idPersona+
                ", nombre="+nombre+ '\''+
                ", apellidos="+apellidos+'\''+
                ", edad="+edad+
                "}";
    }


}
