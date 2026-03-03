package prog2.model;

import java.time.LocalDate;

public class Allotjament implements InAllotjament{

    private String nom;
    private String id;

    public Allotjament(String nom, String id) {

        this.nom = nom;
        this.id = id;
    }

    public static inAllotjament.Temp getTemporada(LocalDate data);

    //getters i setters
    @Override
    public String getNom() {
        return "";
    }

    @Override
    public void setNom(String nom) {

    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public void setId(String id) {

    }

    @Override
    public long getEstadaMinima(Temp temp) {
        return 0;
    }

    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {

    }

    @Override
    public boolean correcteFuncionament() {
        return false;
    }
}
