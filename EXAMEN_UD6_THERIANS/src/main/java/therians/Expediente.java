package therians;

import java.util.ArrayList;
import java.util.Scanner;


public class Expediente {

    static Scanner teclado = new Scanner(System.in);
    static String control= "S";

    private Ciudadano ciudadano;
    private ArrayList<TipoSer> listaSeres;
    private EstadoTramite estadoTramite;

    public Expediente(Ciudadano ciudadano, EstadoTramite estadoTramite){
        this.ciudadano = ciudadano;
        listaSeres = new ArrayList<>();
        this.estadoTramite = estadoTramite;
    }

    public void insertarSeres(){
        do {
            System.out.println("Inserta el tipo de ser que quieres censar [THERIAN, DOMESTICO, EXOTICO]:");
            TipoSer tipo = TipoSer.valueOf(teclado.next());
            System.out.println("Tipo tasa actual: " + tipo.getPuntos());
            listaSeres.add(tipo);
            System.out.println("¿Quieres añadir otro tipo de ser? [S/N]");
            control = teclado.next();
        }while (control=="S");
    }

    public void vertareas(){

    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public ArrayList<TipoSer> getListaSeres() {
        return listaSeres;
    }

    public void setListaSeres(ArrayList<TipoSer> listaSeres) {
        this.listaSeres = listaSeres;
    }

    public EstadoTramite getEstadoTramite() {
        return estadoTramite;
    }

    public void setEstadoTramite(EstadoTramite estadoTramite) {
        this.estadoTramite = estadoTramite;
    }
}
