package com.example.tpfoyer.repository;

import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findAllByTypeC(TypeChambre tc);
    Chambre findChambreByNumeroChambre(Long numC);
    @Query("SELECT c FROM Chambre c JOIN c.reservations r JOIN r.etudiants e WHERE e.cin = :cin AND r.estValide = true")
    List<Chambre> findChambreByCin(@Param("cin") String cin);

}
