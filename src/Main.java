/*Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente
que herede de Persona,
esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto
de la clase Cliente
que debe tener como propiedades la edad, el telefono, el nombre y el credito,
tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador
que herede de Persona, y con una variable salario que solo tenga la clase Trabajador. */
public class Main {
    public static void main(String[] args) {
        Cliente cliente=new Cliente();//instanciacion del obj cliente de la clase Cliente
        cliente.setEdad(28);
        cliente.setTelefono(4456905);
        cliente.setNombre("Daniel");
        cliente.setCredito(150);
        System.out.println("Representacion del obj cliente");
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getNombre());
        System.out.println("-" + cliente.getCredito());
        Trabajador trabajador=new Trabajador();//instanciacion del obj trabajador de la clase Trabajador
        trabajador.setEdad(30);
        trabajador.setTelefono(261466);
        trabajador.setNombre("Matias");
        trabajador.setSalario(250000);
        System.out.println("Representacion del obj trabajador");
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getNombre());
        System.out.println("+" + trabajador.getSalario());
    }
}
class Persona{
    public void Persona(){//constructor
        setEdad(0);
        setNombre("Nombre");
        setTelefono(0);
    }
    private int edad;//variables privadas para encapsulamiento
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    private int telefono;
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }
}
class Cliente extends Persona{//clase Cliente que hereda de clase Persona
    public void Cliente(){
        setCredito(0);
    }
    private double credito;//variable particular no heredada
    public void setCredito(double credito) {
        this.credito = credito;
    }
    public double getCredito() {
        return credito;
    }
}
class Trabajador extends Persona{//clase trabajador que hereda de persona
    public void Trabajador(){
        setSalario(0);
    }
    private double salario;//variable particular de trabajador no heredad

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}