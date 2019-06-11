package com.wildcodeschool.example.mySpringHibernate.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Charactersdbz {

    public Charactersdbz() {}

    public Charactersdbz(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int power;

    @Override
    public String toString() {
        return "Character [id =" + id + ", Name = " + name + ", power " + power + "]";
    }



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
