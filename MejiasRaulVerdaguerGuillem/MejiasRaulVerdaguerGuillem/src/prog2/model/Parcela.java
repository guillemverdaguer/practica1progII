package prog2.model;

public class Parcela extends Allotjament {
    private int mida;
    private boolean connexioElectrica;

    public Parcela(String nom, String id, int mida, boolean connexioElectrica) {

        super(nom, id);

        this.mida = mida;
        this.connexioElectrica = connexioElectrica;
    }

    // Getters y setters
    public double getMida() {
        return mida;
    }

    public void setMida(double mida) {
        this.mida = mida;
    }

    public boolean isConnexioElectrica() {
        return connexioElectrica;
    }

    public void setConnexioElectrica(boolean connexioElectrica) {
        this.connexioElectrica = connexioElectrica;
    }

    // Funcionamiento correcto
    @Override
    public boolean correcteFuncionament() {
        return connexioElectrica;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Parcela{mida=" + mida +
                ", connexioElectrica=" + connexioElectrica + "}";
    }
}



