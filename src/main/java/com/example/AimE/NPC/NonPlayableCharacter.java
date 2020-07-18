package com.example.AimE.NPC;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@Entity
@XmlRootElement(name = "nonPlayableCharacter")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class  NonPlayableCharacter {
    private static final long serialVersionUID = 1L;
    private @Id @GeneratedValue
    Long id;
    private String name;
    private String weapon;
    private String title;


    private int strength;
    private int dexterity;
    private int wisdom;
    private int intelligence;
    private int charisma;
    private int age;

    private String status;
    private String culture;
    private String gender;

    private NonPlayableCharacter() {}

    public NonPlayableCharacter(String firstName, String title, String weapon, String gender, String culture,  int age, String status, int strength, int dexterity, int wisdom, int intelligence, int charisma) {
        this.name = firstName;
        this.title = title;
        this.weapon = weapon;
        this.gender = gender;
        this.culture = culture;
        this.status = status;
        this.age = age;
        this.strength = strength;
        this.dexterity = dexterity;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonPlayableCharacter npc = (NonPlayableCharacter) o;
        return Objects.equals(id, npc.id) &&
                Objects.equals(name, npc.name) &&
                Objects.equals(title, npc.title) &&
                Objects.equals(weapon, npc.weapon) &&
                Objects.equals(gender, npc.gender) &&
                Objects.equals(culture, npc.culture) &&
                Objects.equals(status, npc.status) &&
                Objects.equals(age, npc.age) &&
                Objects.equals(strength, npc.strength) &&
                Objects.equals(dexterity, npc.dexterity) &&
                Objects.equals(wisdom, npc.wisdom) &&
                Objects.equals(intelligence, npc.intelligence) &&
                Objects.equals(charisma, npc.charisma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, title, weapon);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCulture() {return culture;}

    public void setCulture(String culture) {this.culture = culture;}

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence  = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Non Playable Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", weapon='" + weapon + '\'' +
                ", gender='" + gender + '\'' +
                ", culture='" + culture + '\'' +
                ", status='" + status + '\'' +
                ", strength='" + strength + '\'' +
                ", dexterity='" + dexterity + '\'' +
                ", wisdom='" + wisdom + '\'' +
                ", intelligence='" + intelligence + '\'' +
                ", charisma='" + charisma + '\'' +
                '}';
    }
}
