package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camping implements InCamping{
    private String nomCamping_;
    private final ArrayList<Allotjament> llistaAllotjaments_;
    private ArrayList<Client> llistaClients_;
    private LlistaReserves llistaReserves_;

    public Camping(String nomCamping_, ArrayList<Allotjament> llistaAllotjaments_, ArrayList<Client> llistaClients_, LlistaReserves llistaReserves_){

        this.nomCamping_ = nomCamping_;
        this.llistaAllotjaments_ = new ArrayList<>();
        this.llistaClients_ = new ArrayList<>();
        this.llistaReserves_ = new LlistaReserves();
    }

    @Override
    public String getNom() {
        return "";
    }

    @Override
    public LlistaReserves getLlistaReserves() {
        return null;
    }

    @Override
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return null;
    }

    @Override
    public ArrayList<Client> getLlistaClients() {
        return null;
    }

    @Override
    public int getNumAllotjaments() {
        return 0;
    }

    @Override
    public int getNumReserves() {
        return 0;
    }

    @Override
    public int getNumClients() {
        return 0;
    }

    @Override
    public void afegirClient(String nom, String dni) {
        Client client = new Client(nom, dni);
        llistaClients_.add(client);

    }

    @Override
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        Parcela parcela = new Parcela(nom_, idAllotjament_, metres, connexioElectrica);
        llistaAllotjaments_.add(parcela);
    }

    @Override
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions,
                               int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        Bungalow bungalow = new Bungalow(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        llistaAllotjaments_.add(bungalow);
    }

    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, boolean codiWifi) {
        BungalowPremium bungalowPremium = new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        llistaAllotjaments_.add(bungalowPremium);
    }

    @Override
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
        Glamping glamping = new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
        llistaAllotjaments_.add(glamping);
    }

    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        MobilHome mobilHome = new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones, terrassaBarbacoa);
        llistaAllotjaments_.add(mobilHome);
    }

    @Override
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        Reserva reserva = new Reserva(id_, dni_, dataEntrada, dataSortida);
        llistaAllotjaments_.add(reserva);
    }

    @Override
    public int calculAllotjamentsOperatius() {
        return 0;
    }

    @Override
    public Allotjament getAllotjamentEstadaMesCurta(InAllotjament.Temp temp) {
        return null;
    }

    public String getNomCamping() {
        return nomCamping_;
    }

    public void setNomCamping(String nomCamping) {
        this.nomCamping_ = nomCamping;
    }

    public void setLlistaClients(ArrayList<Client> llistaClients) {
        this.llistaClients_ = llistaClients;
    }

    public void setLlistaReserves(LlistaReserves llistaReserves) {
        this.llistaReserves_ = llistaReserves;
    }
}
