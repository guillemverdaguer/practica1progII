package prog2.model;

public class MobilHome extends Casa {

    private boolean terrassaBarbacoa;

    public MobilHome(String nom, String id, String mida, int numHab, int capacitat, boolean terrassaBarbacoa) {

        super(nom, id, mida, numHab, capacitat);

        this.terrassaBarbacoa = terrassaBarbacoa;
    }

    public boolean isTerrassaBarbacoa() {
        return terrassaBarbacoa;
    }

    public void setTerrassaBarbacoa(boolean terrassaBarbacoa) {
        this.terrassaBarbacoa = terrassaBarbacoa;
    }
}
