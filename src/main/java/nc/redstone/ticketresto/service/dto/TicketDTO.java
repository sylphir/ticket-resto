package nc.redstone.ticketresto.service.dto;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link nc.redstone.ticketresto.domain.Ticket} entity.
 */
public class TicketDTO implements Serializable {

    private Long id;

    private Float valeur;


    private Long utilisateurId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getValeur() {
        return valeur;
    }

    public void setValeur(Float valeur) {
        this.valeur = valeur;
    }

    public Long getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Long utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TicketDTO ticketDTO = (TicketDTO) o;
        if (ticketDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), ticketDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TicketDTO{" +
            "id=" + getId() +
            ", valeur=" + getValeur() +
            ", utilisateurId=" + getUtilisateurId() +
            "}";
    }
}
