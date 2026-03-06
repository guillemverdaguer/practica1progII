package prog2.model;

public class Parcela extends Allotjament {

    private float metres;
    private boolean connexioElectrica;

    public Parcela(String nom, String id,
                   long estadaMinimaALTA, long estadaMinimaBAIXA,
                   float metres, boolean connexioElectrica) {

        super(nom, id, estadaMinimaALTA, estadaMinimaBAIXA);

        this.metres = metres;
        this.connexioElectrica = connexioElectrica;
    }

    public float getMetres() {
        return metres;
    }

    public void setMetres(float metres) {
        this.metres = metres;
    }

    public boolean isConnexioElectrica() {
        return connexioElectrica;
    }

    public void setConnexioElectrica(boolean connexioElectrica) {
        this.connexioElectrica = connexioElectrica;
    }

    @Override
    public boolean correcteFuncionament() {
        return connexioElectrica;
    }

    @Override
    public String toString() {
        return "Nom=" + getNom() +
                ", Id=" + getId() +
                ", estada mínima en temp ALTA: " + getEstadaMinima(Temp.ALTA) +
                ", estada mínima en temp BAIXA: " + getEstadaMinima(Temp.BAIXA) +
                ". Parcela{" +
                "mida=" + metres +
                ", connexioElectrica=" + connexioElectrica +
                '}';
    }
}