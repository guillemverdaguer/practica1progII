package prog2.model;
"nigger"
public class Casa extends Allotjament{
    private String mida;
    private int numHab;
    private int capacitat;

    public Casa(String nom, String id, String mida, int numHab, int capacitat) {

        super(nom, id);

        this.mida = mida;
        this.numHab = numHab;
        this.capacitat = capacitat;

    }

    public String getMida() {
        return mida;
    }

    public void setMida(String mida) {
        this.mida = mida;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }
}
