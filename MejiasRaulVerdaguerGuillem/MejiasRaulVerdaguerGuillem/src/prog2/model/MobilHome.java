package prog2.model;

public class MobilHome extends Casa {

    private boolean terrassa;
    private boolean barbacoa;

    public MobilHome(String nom, String id, String mida, int numHab, int capacitat, boolean terrassa, boolean barbacoa) {

        super(nom, id, mida, numHab, capacitat);

        this.terrassa = terrassa;
        this.barbacoa = barbacoa;
    }

    public boolean isTerrassa() {
        return terrassa;
    }

    public void setTerrassa(boolean terrassa) {
        this.terrassa = terrassa;
    }

    public boolean isBarbacoa() {
        return barbacoa;
    }

    public void setBarbacoa(boolean barbacoa) {
        this.barbacoa = barbacoa;
    }
}
