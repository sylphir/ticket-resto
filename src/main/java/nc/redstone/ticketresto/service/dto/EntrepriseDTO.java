package nc.redstone.ticketresto.service.dto;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link nc.redstone.ticketresto.domain.Entreprise} entity.
 */
@ApiModel(description = "not an ignored comment")
public class EntrepriseDTO implements Serializable {

    private Long id;

    private String nom;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EntrepriseDTO entrepriseDTO = (EntrepriseDTO) o;
        if (entrepriseDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), entrepriseDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "EntrepriseDTO{" +
            "id=" + getId() +
            ", nom='" + getNom() + "'" +
            "}";
    }
}
