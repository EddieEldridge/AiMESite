package com.example.AimE.Utility;

import com.example.AimE.Utility.FileLoader;

public class NameGenerator {

    public String generateName(String culture, String gender) {

        FileLoader fl = new FileLoader();
        fl.loadFiles();

        // Calculate the size of the ArrayList
        int arrayListSize = 0;
        int randomNum = 0;
        String name = "";

        if (gender == "Male") {
            switch (culture) {
                case "Dalish":
                    arrayListSize = fl.daleNamesMale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.daleNamesMale.get(randomNum);
                    break;
                case "Elven":
                    arrayListSize = fl.elfNamesMale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.elfNamesMale.get(randomNum);
                    break;
                case "Woodsmen":
                    arrayListSize = fl.woodmenNamesMale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.woodmenNamesMale.get(randomNum);
                    break;
                case "Bree-land":
                    arrayListSize = fl.breeNamesMale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.breeNamesMale.get(randomNum);
                    break;
                case "Dwarf":
                    arrayListSize = fl.dwarfNames.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.dwarfNames.get(randomNum);
                    break;
                case "Dunlending":
                    arrayListSize = fl.dunlendingNamesMale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.dunlendingNamesMale.get(randomNum);
                    break;
                case "Easterling":
                    arrayListSize = fl.easterlingNamesMale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.easterlingNamesMale.get(randomNum);
                    break;
                case "Haradrim":
                    arrayListSize = fl.haradrimNamesMale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.haradrimNamesMale.get(randomNum);
                    break;
                case "Hobbit":
                    arrayListSize = fl.hobbitNamesMale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.hobbitNamesMale.get(randomNum);
                    break;
                case "Rohirric":
                    arrayListSize = fl.rohirricNamesMale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.rohirricNamesMale.get(randomNum);
                    break;
            }
        } else if (gender == "Female") {
            switch (culture) {
                case "Dalish":
                    arrayListSize = fl.daleNamesFemale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.daleNamesFemale.get(randomNum);
                    break;
                case "Elven":
                    arrayListSize = fl.elfNamesFemale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.elfNamesFemale.get(randomNum);
                    break;
                case "Woodsmen":
                    arrayListSize = fl.woodmenNamesFemale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.woodmenNamesFemale.get(randomNum);
                    break;
                case "Bree-land":
                    arrayListSize = fl.breeNamesFemale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.breeNamesFemale.get(randomNum);
                    break;
                case "Dwarf":
                    arrayListSize = fl.dwarfNames.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.dwarfNames.get(randomNum);
                    break;
                case "Dunlending":
                    arrayListSize = fl.dunlendingNamesFemale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.dunlendingNamesFemale.get(randomNum);
                    break;
                case "Easterling":
                    arrayListSize = fl.easterlingNamesFemale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.easterlingNamesFemale.get(randomNum);
                    break;
                case "Haradrim":
                    arrayListSize = fl.haradrimNamesFemale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.haradrimNamesFemale.get(randomNum);
                    break;
                case "Hobbit":
                    arrayListSize = fl.hobbitNamesFemale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.hobbitNamesFemale.get(randomNum);
                    break;
                case "Rohirric":
                    arrayListSize = fl.rohirricNamesFemale.size();
                    randomNum = (int) (Math.random() * arrayListSize);
                    name = fl.rohirricNamesFemale.get(randomNum);
                    break;
            }
        }

        System.out.println("====");
        System.out.println("Culture: " + culture);
        System.out.println("Name: " + name);
        System.out.println("Array Address: " + randomNum);
        System.out.println("Array List Size: " + arrayListSize);
        System.out.println("====");

        return name;
    }
}
