package prog2.model;

public class Glamping extends Casa {

    private String tipus; // "tela" o "fusta"
    private boolean casaMascota;

    // Constructor
    public Glamping(String nom, String id,
                    String mida, int numHabitacions, int capacitat,
                    String tipus, boolean casaMascota) {

        super(nom, id, estadaMinAlta, estadaMinBaixa,
                mida, numHabitacions, capacitat);

        this.tipus = tipus;
        this.casaMascota = casaMascota;
    }

    // Getters y setters
    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public boolean isCasaMascota() {
        return casaMascota;
    }

    public void setCasaMascota(boolean casaMascota) {
        this.casaMascota = casaMascota;
    }

    // Funcionamient correcte
    @Override
    public boolean correcteFuncionament() {
        return casaMascota;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Glamping{tipus=" + tipus +
                ", casaMascota=" + casaMascota + "}";
    }
}
