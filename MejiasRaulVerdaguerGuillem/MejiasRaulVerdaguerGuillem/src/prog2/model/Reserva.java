package prog2.model;

import java.time.LocalDate;

public class Reserva {

    private Allotjament allotjament;
    private Client client;
    private LocalDate dataEntrada;
    private LocalDate dataSortida;

    // Constructor
    public Reserva(Allotjament allotjament, Client client,
                   LocalDate dataEntrada, LocalDate dataSortida) {

        this.allotjament = allotjament;
        this.client = client;
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
    }

    // Getters
    public Allotjament getAllotjament() {
        return allotjament;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSortida() {
        return dataSortida;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "allotjament=" + allotjament.getId() +
                ", client=" + client.getNom() +
                ", dataEntrada=" + dataEntrada +
                ", dataSortida=" + dataSortida +
                '}';
    }
}