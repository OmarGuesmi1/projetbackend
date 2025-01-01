package org.example.examen3.repository;

import org.example.examen3.entity.coursclassroom;
import org.example.examen3.entity.niveau;
import org.example.examen3.entity.specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface coursclassroomrepository extends JpaRepository<coursclassroom, Integer> {
    @Query("SELECT c.nbrheurs from coursclassroom c join c.classes cc where cc.niveau=:niveau and c.specialite=:specialite")
    Integer findcoursclassroomBySpecialiteAndClasseNiveau(@Param("niveau") niveau niveau, @Param("specialite") specialite specialite);

}
