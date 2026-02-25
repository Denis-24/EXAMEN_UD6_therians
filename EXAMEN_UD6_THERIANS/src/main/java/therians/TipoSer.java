package therians;

public enum TipoSer {
    THERIAN(0.0),DOMESTICO(10.0),EXOTICO(50.0);

    private final double puntos;


    TipoSer(double puntos) {
        this.puntos = puntos;
    }


    public double getPuntos() {
        return puntos;
    }
}
