import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;// identificador de cada cliente
   private Date fechaRegistro; // fecha de registro del cliente


    //Constructor
    public Cliente (int idPersona,String nombre, String apellidos, int edad, int idCliente){
        super(nombre, apellidos, idPersona,edad);
        this.idCliente = idCliente;
      fechaRegistro= new Date();

    }

    //Método para establecer el idCliente
    public void setIdCliente (int idCliente) {
        this.idCliente=idCliente;
    }

    //Método para establecer la fecha de registro
    public void setFechaRegistro (Date fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }

    //Método para obtener el Id del objeto persona
    public int getidCliente (){ return idCliente; }
    //Método para obtener la fecha de registro
    public Date fechaRegistro (){ return fechaRegistro; }
    @Override
    public String toString() {
        return super.toString() + " - Cliente{" +
                "idCliente=" + idCliente +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }

}
