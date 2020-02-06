package nc.redstone.ticketresto.service.mapper;

import nc.redstone.ticketresto.domain.*;
import nc.redstone.ticketresto.service.dto.TicketDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Ticket} and its DTO {@link TicketDTO}.
 */
@Mapper(componentModel = "spring", uses = {UtilisateurMapper.class})
public interface TicketMapper extends EntityMapper<TicketDTO, Ticket> {

    @Mapping(source = "utilisateur.id", target = "utilisateurId")
    TicketDTO toDto(Ticket ticket);

    @Mapping(source = "utilisateurId", target = "utilisateur")
    Ticket toEntity(TicketDTO ticketDTO);

    default Ticket fromId(Long id) {
        if (id == null) {
            return null;
        }
        Ticket ticket = new Ticket();
        ticket.setId(id);
        return ticket;
    }
}
