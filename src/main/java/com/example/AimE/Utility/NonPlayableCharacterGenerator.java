package com.example.AimE.Utility;

import com.example.AimE.NPC.NonPlayableCharacter;

public class NonPlayableCharacterGenerator
{
    // Instances
    NameGenerator nameGenerator = new NameGenerator();
    TitleGenerator titleGenerator = new TitleGenerator();
    CultureGenerator cultureGenerator = new CultureGenerator();
    WeaponGenerator weaponGenerator = new WeaponGenerator();
    GenderGenerator genderGenerator = new GenderGenerator();
    DiceRoll diceRoller = new DiceRoll();
    AgeGenerator ageGenerator = new AgeGenerator();
    StatusGenerator statusGenerator = new StatusGenerator();


    public NonPlayableCharacter generateCharacter()
    {
        // Setup Statistics
        String culture = cultureGenerator.generateCulture();
        String gender = genderGenerator.generateGender();
        String name = nameGenerator.generateName(culture, gender);
        String title = titleGenerator.generateTitle();
        String weapon = weaponGenerator.generateWeapon();
        String status = statusGenerator.generateStatus();
        int age = ageGenerator.generateAge();
        int strength = diceRoller.rollD20();
        int dexterity = diceRoller.rollD20();
        int wisdom = diceRoller.rollD20();
        int intelligence = diceRoller.rollD20();
        int charisma = diceRoller.rollD20();

        return new NonPlayableCharacter(name, title, weapon, gender, culture, age,  status, strength, dexterity, wisdom, intelligence, charisma);
    }
}
