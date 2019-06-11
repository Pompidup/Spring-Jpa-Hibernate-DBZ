package com.wildcodeschool.example.mySpringHibernate.repositories;


import com.wildcodeschool.example.mySpringHibernate.entities.Charactersdbz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CharactersRepository extends JpaRepository<Charactersdbz, Long> {
}
