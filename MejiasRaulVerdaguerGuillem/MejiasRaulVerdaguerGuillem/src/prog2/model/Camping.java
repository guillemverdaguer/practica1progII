package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camping implements InCamping {

    private String nomCamping;
    private ArrayList<Allotjament> llistaAllotjaments;
    private ArrayList<Client> llistaClients;
    private LlistaReserves llistaReserves;

    public Camping(String nomCamping) {

        this.nomCamping = nomCamping;
        this.llistaAllotjaments = new ArrayList<>();
        this.llistaClients = new ArrayList<>();
        this.llistaReserves = new LlistaReserves();
    }

    public static InAllotjament.Temp getTemporada(LocalDate data) {
        return null;
    }

    @Override
    public void afegirClient(String nom, String dni) {

        Client client = new Client(nom, dni);
        llistaClients.add(client);
    }

    @Override
    public void afegirParcela(String nom, String id, float metres, boolean connexioElectrica) {

        Parcela parcela = new Parcela(nom, id, metres, connexioElectrica);
        llistaAllotjaments.add(parcela);

    }

    @Override
    public void afegirBungalow(String nom, String id, String mida, int habitacions,
                               int placesPersones, int placesParking,
                               boolean terrassa, boolean televisio, boolean aireFred) {

        Bungalow bungalow = new Bungalow(nom, id, 4, 7,
                mida, habitacions, placesPersones,
                placesParking, terrassa, televisio, aireFred);

        llistaAllotjaments.add(bungalow);
    }

    @Override
    public void afegirBungalowPremium(String nom, String id, String mida, int habitacions,
                                      int placesPersones, int placesParking,
                                      boolean terrassa, boolean televisio,
                                      boolean aireFred, boolean llencols,
                                      String wifi) {

        BungalowPremium bungalowPremium = new BungalowPremium(nom, id, 4, 7, mida, habitacions, placesPersones,
                placesParking, terrassa, televisio, aireFred, llencols, wifi);
        llistaAllotjaments.add(bungalowPremium);
    }

    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, boolean codiWifi) {

    }

    @Override
    public void afegirGlamping(String nom, String id, String mida, int habitacions,
                               int placesPersones, String tipus, boolean casaMascota) {

        Glamping glamping = new Glamping(nom, id, 3, 3,
                mida, habitacions, placesPersones,
                tipus, casaMascota);

        llistaAllotjaments.add(glamping);
    }

    @Override
    public void afegirMobilHome(String nom, String id, String mida, int habitacions,
                                int placesPersones, boolean terrassaBarbacoa) {

        MobilHome mobilHome = new MobilHome(nom, id, 3, 5,
                mida, habitacions, placesPersones,
                terrassaBarbacoa);

        llistaAllotjaments.add(mobilHome);
    }

    private Allotjament buscarAllotjament(String id) {

        for (Allotjament allotjament : llistaAllotjaments) {

            if (allotjament.getId().equals(id)) {
                return allotjament;
            }
        }

        return null;
    }

    private Client buscarClient(String dni) {

        for (Client client : llistaClients) {

            if (client.getDni().equals(dni)) {
                return client;
            }
        }

        return null;
    }

    @Override
    public void afegirReserva(String id, String dni,
                              LocalDate dataEntrada,
                              LocalDate dataSortida) throws ExcepcioReserva {

        Allotjament allotjament = buscarAllotjament(id);
        Client client = buscarClient(dni);

        if (allotjament == null || client == null) {
            return;
        }

        llistaReserves.afegirReserva(allotjament, client, dataEntrada, dataSortida);
    }

    @Override
    public int calculAllotjamentsOperatius() {
        return 0;
    }

    @Override
    public Allotjament getAllotjamentEstadaMesCurta(InAllotjament.Temp temp) {
        return null;
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
        return llistaAllotjaments.size();
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
    public int getNumAllotjamentsOperatius() {

        int comptador = 0;

        for (Allotjament allotjament : llistaAllotjaments) {

            if (allotjament.correcteFuncionament()) {
                comptador++;
            }
        }

        return comptador;
    }
}