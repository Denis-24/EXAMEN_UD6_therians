package therians;

import java.util.ArrayList;
import java.util.Scanner;


public class Expediente {

    static Scanner teclado = new Scanner(System.in);

    private Ciudadano ciudadano;
    private ArrayList<TipoSer> listaSeres;
    private EstadoTramite estadoTramite;

    public Expediente(Ciudadano ciudadano, EstadoTramite estadoTramite){
        this.ciudadano = ciudadano;
        listaSeres = new ArrayList<>();
        this.estadoTramite = estadoTramite;
    }

    public void insertarSeres(){
        System.out.println("Inserta el tipo de ser que quieres censar [THERIAN, DOMESTICO, EXOTICO]:");
        String tipo = teclado.next();
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
