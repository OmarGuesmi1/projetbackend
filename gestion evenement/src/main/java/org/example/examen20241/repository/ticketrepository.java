package org.example.examen20241.repository;

import org.example.examen20241.entity.ticket;
import org.example.examen20241.entity.typeticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ticketrepository extends JpaRepository<ticket, Long> {

    @Query("SELECT sum (c.prixticket) from ticket c join c.evenement ce where ce.nomevenement=:nomevent and c.typeticket=:type")
    Double findByTypeticketAndEvenementNomevenement(@Param("nomevent") String nomevent, @Param("type") typeticket type);

}
