package prog2.model;

public class Bungalow extends Casa {

    private int placesParking;
    private boolean terrassa;
    private boolean televisio;
    private boolean aireFred;

    // Constructor
    public Bungalow(String nom, String id,
                    String mida, int numHab, int capacitat,
                    int placesParking, boolean terrassa,
                    boolean televisio, boolean aireFred) {

        super(nom, id, mida, numHab, capacitat);

        this.placesParking = placesParking;
        this.terrassa = terrassa;
        this.televisio = televisio;
        this.aireFred = aireFred;
    }

    // Getters i setters
    public int getPlacesParking() {
        return placesParking;
    }

    public void setPlacesParking(int placesParking) {
        this.placesParking = placesParking;
    }

    public boolean isTerrassa() {
        return terrassa;
    }

    public void setTerrassa(boolean terrassa) {
        this.terrassa = terrassa;
    }

    public boolean isTelevisio() {
        return televisio;
    }

    public void setTelevisio(boolean televisio) {
        this.televisio = televisio;
    }

    public boolean isAireFred() {
        return aireFred;
    }

    public void setAireFred(boolean aireFred) {
        this.aireFred = aireFred;
    }

    // Funcionament correcte
    @Override
    public boolean correcteFuncionament() {
        return aireFred;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Bungalow{placesParking=" + placesParking +
                ", terrassa=" + terrassa +
                ", televisio=" + televisio +
                ", aireFred=" + aireFred + "}";
    }
}
