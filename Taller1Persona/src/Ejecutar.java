public class Ejecutar {
public static void main (String args[]){
    Cliente c = new Cliente("luis","jose",38, 29,1);
    System.out.println(c.toString());

    System.out.println(c.getcontadorPersonas());

    Empleado e1 =  new Empleado("ferguson","andres",40, 29L, 2500);
    System.out.println(e1.toString());
    System.out.println(e1.getcontadorPersonas());

    Persona p1 =  new Persona("Juan", "Ramirez", 40, 90);
    System.out.println(p1.toString());
    System.out.println(e1.getcontadorPersonas());
}

}
