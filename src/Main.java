public class Main {

    public static void main(String[] args) {
        System.out.println("Valores por defecto");
        Persona persona = new Persona();
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Teléfono:"+persona.getTelefono());

        Persona personaDos = new Persona();
        System.out.println("\nSe le asignan nuevos valores");

        personaDos.setNombre("Juan");
        personaDos.setEdad(35);
        personaDos.setTelefono(21133);

        System.out.println("Nombre: "+personaDos.getNombre());
        System.out.println("Edad: "+personaDos.getEdad());
        System.out.println("Teléfono:"+personaDos.getTelefono());

    }
}