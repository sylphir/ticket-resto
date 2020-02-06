package nc.redstone.ticketresto.service.mapper;

import nc.redstone.ticketresto.domain.*;
import nc.redstone.ticketresto.service.dto.EntrepriseDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Entreprise} and its DTO {@link EntrepriseDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface EntrepriseMapper extends EntityMapper<EntrepriseDTO, Entreprise> {



    default Entreprise fromId(Long id) {
        if (id == null) {
            return null;
        }
        Entreprise entreprise = new Entreprise();
        entreprise.setId(id);
        return entreprise;
    }
}
