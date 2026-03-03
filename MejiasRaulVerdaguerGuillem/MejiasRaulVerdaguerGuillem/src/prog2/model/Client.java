package prog2.model;

public class Client {

    private String nom;
    private String dni;

    // Constructor
    public Client(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // toString
    @Override
    public String toString() {
        return "Client{nom='" + nom + "', dni='" + dni + "'}";
    }
}