package nc.redstone.ticketresto.service.mapper;

import nc.redstone.ticketresto.domain.*;
import nc.redstone.ticketresto.service.dto.UtilisateurDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Utilisateur} and its DTO {@link UtilisateurDTO}.
 */
@Mapper(componentModel = "spring", uses = {EntrepriseMapper.class})
public interface UtilisateurMapper extends EntityMapper<UtilisateurDTO, Utilisateur> {

    @Mapping(source = "entreprise.id", target = "entrepriseId")
    UtilisateurDTO toDto(Utilisateur utilisateur);

    @Mapping(target = "tickets", ignore = true)
    @Mapping(target = "removeTicket", ignore = true)
    @Mapping(source = "entrepriseId", target = "entreprise")
    Utilisateur toEntity(UtilisateurDTO utilisateurDTO);

    default Utilisateur fromId(Long id) {
        if (id == null) {
            return null;
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(id);
        return utilisateur;
    }
}
