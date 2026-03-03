package prog2.model;

public class BungalowPremium extends Bungalow {
    private boolean tovalloles;
    private boolean wifi;

    public BungalowPremium(String nom, String id,
                    String mida, int numHab, int capacitat,
                    int placesParking, boolean terrassa,
                    boolean televisio, boolean aireFred, boolean tovalloles, boolean wifi) {

        super(nom, id, mida, numHab, capacitat, placesParking,  terrassa, televisio, aireFred);

        this.tovalloles = tovalloles;
        this.wifi = wifi;
    }

    public boolean isTovalloles() {
        return tovalloles;
    }

    public void setTovalloles(boolean tovalloles) {
        this.tovalloles = tovalloles;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
