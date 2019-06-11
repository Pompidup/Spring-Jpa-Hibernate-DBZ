package com.wildcodeschool.example.mySpringHibernate.utils;


import com.wildcodeschool.example.mySpringHibernate.entities.Charactersdbz;
import com.wildcodeschool.example.mySpringHibernate.repositories.CharactersRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Outputter implements CommandLineRunner {

    private Logger LOG = LoggerFactory.getLogger("DBZ");

    @Autowired
    private CharactersRepository charactersRepository;

    @Override
    public void run(String... args) throws Exception {
        LOG.info("*************************");
        LOG.info("Personnage(s) dans la base : " + charactersRepository.count());


// Add new character
        Charactersdbz sangoku = new Charactersdbz("Sangoku", 100000);
        LOG.info("*************************");
        LOG.info(sangoku + " a était crée !");
        charactersRepository.save(sangoku);
        LOG.info(sangoku + " a était sauvegardé");

        // Add 2nd character

        Charactersdbz vegeta = new Charactersdbz("Vegeta", 95000);
        LOG.info("************************");
        LOG.info(vegeta + " a était créé ! ");
        charactersRepository.save(vegeta);
        LOG.info(vegeta + " a était sauvegardé");

        // Lit les informations correspondant au second utilisateur
        Charactersdbz tempChara = charactersRepository.findById(2L).get();
        LOG.info("******************");
        LOG.info("Second user's firstName is " + tempChara.getName());
        LOG.info("Second user's age is " + tempChara.getPower());

        // Liste les persos enregistrés dans la BDD
        LOG.info("******************");
        LOG.info(" perso sont dans la base ");
        for (Charactersdbz myChara : charactersRepository.findAll()) {
            LOG.info(myChara.toString());
        }

        // Supprime le second utilisateur de la BDD
        charactersRepository.deleteById(2L);
        LOG.info("******************");
        LOG.info(" perso sont dans la base ");
        for (Charactersdbz myChara : charactersRepository.findAll()) {
            LOG.info(myChara.toString());
        }
    }
}
