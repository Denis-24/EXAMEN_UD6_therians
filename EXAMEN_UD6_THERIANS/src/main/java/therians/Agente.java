package therians;


import java.util.Scanner;

public class Agente extends Persona implements AccionesPoliciales{

    static Scanner teclado = new Scanner(System.in);

    static int contador = 0;
    private int id;
    private int codigo_acceso;

    public Agente(String nombre, String poblacion, int codigo_acceso) {
        ++contador;
        super(nombre, poblacion);
        setId();
        this.codigo_acceso = codigo_acceso;
    }
//    public Agente(int id,int codigo_acceso){
//        this.id = id;
//        this.codigo_acceso = codigo_acceso;
//    }

    public boolean login(){

        return true;
    }

    @Override
    public Ciudadano solicitarDatosCiudadano() {
        System.out.println("Nombre:");
        String nombre = teclado.next();
        System.out.println("Poblacion:");
        String poblacion = teclado.next();
        System.out.println("DNI:");
        String DNI = teclado.next();
        System.out.println("Expediente para el ciudadano " + nombre + " creado.");
        Ciudadano c1 = new Ciudadano(nombre,poblacion,DNI);
        return c1;
    }

    @Override
    public Expediente crearExpediente() {
        Expediente e1 = new Expediente(solicitarDatosCiudadano(),EstadoTramite.INICIAND);
        return e1;
    }

    @Override
    public void siguienteEstado(Expediente expediente) {

    }

    @Override
    public void archivarExpediente(Expediente expediente) {

    }

    @Override
    public void mostrarTipoPersona() {
        System.out.println("Autoridad");
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = contador;
    }

    public int getCodigo_acceso() {
        return codigo_acceso;
    }

    public void setCodigo_acceso(int codigo_acceso) {
        this.codigo_acceso = codigo_acceso;
    }
}
