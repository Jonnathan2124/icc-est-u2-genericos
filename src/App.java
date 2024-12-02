
import models.Persona;
import models.genericos.*;

public class App {
    public static void main(String[] args) throws Exception {


        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(30);

        cajaString.guardar("Guardo un String");
        cajaInteger.guardar(10);
        cajaPersona.guardar(persona);

        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
        System.out.println(cajaPersona.obtener().getNombre());


        Par <String, Integer> par = new Par<>();
    }
}
