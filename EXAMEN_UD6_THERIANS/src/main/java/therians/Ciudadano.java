package therians;

public class Ciudadano extends Persona{

    private String dni;

    public Ciudadano(String nombre, String poblacion, String dni) {
        super(nombre, poblacion);
        this.dni = dni;
    }

    public void abonarTasas(Expediente expediente){

    }



    @Override
    public void mostrarTipoPersona() {
        System.out.println("Civil");
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
