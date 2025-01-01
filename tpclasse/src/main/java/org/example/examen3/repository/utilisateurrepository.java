package org.example.examen3.repository;

import org.example.examen3.entity.niveau;
import org.example.examen3.entity.utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface utilisateurrepository extends JpaRepository<utilisateur, Integer> {
    @Query("SELECT count(c) from utilisateur c join c.classe cc where cc.niveau=:niveau")
    Integer countUtilisateur(@Param("niveau") niveau niveau);

}
