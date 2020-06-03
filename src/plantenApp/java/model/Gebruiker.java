package plantenApp.java.model;
        import java.util.Date;
/**
 * @author Bart
 */
public class Gebruiker {
    private int gebruiker_id;
    private String voornaam;
    private String achternaam;
    private String email;
    private String rol;
    private Date aanvraag_datum;
    private Byte aanvraag_goedgekeurd;
    public Gebruiker(int gebruiker_id, String voornaam, String achternaam,
                     String email, String rol, Date aanvraag_datum,
                     Byte aanvraag_goedgekeurd, Long wachtwoord_hash) {
        this.gebruiker_id = gebruiker_id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
        this.rol = rol;
        this.aanvraag_datum = aanvraag_datum;
        this.aanvraag_goedgekeurd = aanvraag_goedgekeurd;
        this.wachtwoord_hash = wachtwoord_hash;
    }
    public int getGebruiker_id() {
        return gebruiker_id;
    }
    public void setGebruiker_id(int gebruiker_id) {
        this.gebruiker_id = gebruiker_id;
    }
    public String getVoornaam() {
        return voornaam;
    }
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
    public String getAchternaam() {
        return achternaam;
    }
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public Date getAanvraag_datum() {
        return aanvraag_datum;
    }
    public void setAanvraag_datum(Date aanvraag_datum) {
        this.aanvraag_datum = aanvraag_datum;
    }
    public Byte getAanvraag_goedgekeurd() {
        return aanvraag_goedgekeurd;
    }
    public void setAanvraag_goedgekeurd(Byte aanvraag_goedgekeurd) {
        this.aanvraag_goedgekeurd = aanvraag_goedgekeurd;
    }
    public Long getWachtwoord_hash() {
        return wachtwoord_hash;
    }
    public void setWachtwoord_hash(Long wachtwoord_hash) {
        this.wachtwoord_hash = wachtwoord_hash;
    }
}

    private Long wachtwoord_hash;