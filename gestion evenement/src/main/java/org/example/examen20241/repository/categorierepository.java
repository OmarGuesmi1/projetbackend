package org.example.examen20241.repository;

import org.example.examen20241.entity.categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categorierepository extends JpaRepository<categorie,Long> {
}
