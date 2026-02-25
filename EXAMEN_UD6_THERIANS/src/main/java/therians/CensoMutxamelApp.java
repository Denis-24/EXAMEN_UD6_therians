package therians;

import java.util.ArrayList;
import java.util.Scanner;

public class CensoMutxamelApp {
    static Scanner teclado = new Scanner(System.in);

    public static ArrayList<Expediente> listaExpedientes = new ArrayList<>();
    public static ArrayList<Agente> agentesPoliciaRegistrados = new ArrayList<>();

    public static int preguntar(){
        System.out.println("=== BIENVENIDO A LA APP DEL CENSO DE BESTIAS DE MITXAMEL ===");
        System.out.println("Introduce tu ID: ");
        int numID = teclado.nextInt();
        return numID;
    }

    public

    static void main(String[] args) {
        agentesPoliciaRegistrados.add(new Agente("Luisa","Mutxamel",2334));
        agentesPoliciaRegistrados.add(new Agente("Raul","Mutxamel",1234));

        for (Agente agente : agentesPoliciaRegistrados){
            System.out.println("Agente " + agente.getNombre() + " registrado. tu ID es: " + agente.getId() );
        }
        Agente a1 = new Agente("Raul","Mutxamel",1234);

        Expediente expediente = a1.crearExpediente();
        listaExpedientes.add(expediente);

        expediente.insertarSeres();




    }



}
