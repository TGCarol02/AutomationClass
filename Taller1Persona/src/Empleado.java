public class Empleado extends Persona{

    private Long  idEmpleado;// identificador de cada empleado
    private int sueldo;// sueldo de cada empleado


    //Constructor
    public Empleado (String nombre, String apellidos, int edad, Long idEmpleado, int sueldo){
        super(nombre, apellidos, edad,idEmpleado,sueldo);
        this.sueldo = sueldo;
        this.idEmpleado= idEmpleado;
    }

     //Método para establecer el Empleado
    public void idEmpleado (String[] args) {
        int[] idEmpleado = new int[50];
        int id = 0; // Declaramos e inicializamos el contador.

        for (int i = 0; i < 100; i++)
            if (idEmpleado[i] > 50)
                id++; // Incrementamos el contador si corresponde
    }
    //Método para establecer el nombre de una persona
    public void setSueldo (String valors){
        sueldo = Integer.parseInt("sueldo" + valors); //El valor del sueldo será el inicial más el que se ingresa
    }

    //Método para obtener el Id del objeto persona
    public Long getidEmpleado (){ return idEmpleado; }
    //Método para obtener el nombre del objeto persona
    public int getSueldo (){ return sueldo; }

    @Override
    public String toString() {
        return super.toString() + " - Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                '}';
    }
}
