
public class Ejecutar {
public static void main (String args[]){
    Cliente c = new Cliente(1,"Jose", "Wolf",35, 1);
    System.out.println(c);
    System.out.println(c.getcontadorPersonas());
    System.out.println(c.toString());



    Empleado e1 =  new Empleado(2, "ferguson","andres",40, 29L, 2500);
    System.out.println(e1.toString());
    System.out.println(e1.getcontadorPersonas());

    Persona p1 =  new Persona("Juan", "Ramirez", 40, 90);
    System.out.println(p1.toString());
    System.out.println(e1.getcontadorPersonas());
}

}
