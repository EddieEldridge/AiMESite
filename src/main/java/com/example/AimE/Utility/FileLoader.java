package com.example.AimE.Utility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {

    // ArrayLists to store names from files in
    public ArrayList<String> daleNamesMale = new ArrayList<String>();
    public ArrayList<String> daleNamesFemale = new ArrayList<String>();

    public ArrayList<String> elfNamesMale = new ArrayList<String>();
    public ArrayList<String> elfNamesFemale = new ArrayList<String>();

    public ArrayList<String> woodmenNamesMale = new ArrayList<String>();
    public ArrayList<String> woodmenNamesFemale = new ArrayList<String>();

    public ArrayList<String> breeNamesMale = new ArrayList<String>();
    public ArrayList<String> breeNamesFemale = new ArrayList<String>();

    public ArrayList<String> dunlendingNamesMale = new ArrayList<String>();
    public ArrayList<String> dunlendingNamesFemale = new ArrayList<String>();

    public ArrayList<String> dwarfNames = new ArrayList<String>();

    public ArrayList<String> easterlingNamesMale = new ArrayList<String>();
    public ArrayList<String> easterlingNamesFemale = new ArrayList<String>();

    public ArrayList<String> haradrimNamesMale = new ArrayList<String>();
    public ArrayList<String> haradrimNamesFemale = new ArrayList<String>();

    public ArrayList<String> hobbitNamesMale = new ArrayList<String>();
    public ArrayList<String> hobbitNamesFemale = new ArrayList<String>();

    public ArrayList<String> rohirricNamesMale = new ArrayList<String>();
    public ArrayList<String> rohirricNamesFemale = new ArrayList<String>();

    public ArrayList<String> titles = new ArrayList<String>();

    public ArrayList<String> weapons = new ArrayList<String>();

    public ArrayList<String> cultures = new ArrayList<String>();

    public ArrayList<String> statoos = new ArrayList<String>();

    // Filepath definitions
    String textResources = "./src/main/resources/text/";

    File daleNamesFemaleFile = new File(textResources+"dalishNamesFemale.txt");
    File daleNamesMaleFile = new File(textResources+"dalishNamesMale.txt");

    File elfNamesMalesFile = new File(textResources+"elfNamesMale.txt");
    File elfNamesFemaleFile = new File(textResources+"elfNamesFemale.txt");

    File woodmenNamesMaleFile = new File(textResources+"woodmenNamesMale.txt");
    File woodmenNamesFemaleFile = new File(textResources+"woodmenNamesFemale.txt");

    File breeNamesMaleFile = new File(textResources+"breeNamesMale.txt");
    File breeNamesFemaleFile = new File(textResources+"breeNamesFemale.txt");

    File dwarfNamesFile = new File(textResources+"dwarfNames.txt");

    File dunlendingNamesMaleFile = new File(textResources+"dunlendingNamesMale.txt");
    File dunlendingNamesFemaleFile = new File(textResources+"dunlendingNamesFemale.txt");

    File easterlingNamesMaleFile = new File(textResources+"easterlingNamesMale.txt");
    File easterlingNamesFemaleFile = new File(textResources+"easterlingNamesFemale.txt");

    File haradrimNamesMaleFile = new File(textResources+"haradrimNamesMale.txt");
    File haradrimNamesFemaleFile = new File(textResources+"haradrimNamesFemale.txt");

    File hobbitNamesMaleFile = new File(textResources+"hobbitNamesMale.txt");
    File hobbitNamesFemaleFile = new File(textResources+"hobbitNamesFemale.txt");

    File rohirricNamesMaleFile = new File(textResources+"rohirricNamesMale.txt");
    File rohirricNamesFemaleFile = new File(textResources+"rohirricNamesFemale.txt");

    File titlesFile = new File(textResources+"titles.txt");

    File weaponsFile = new File(textResources+"weapons.txt");

    File culturesFile = new File(textResources+"cultures.txt");

    File statoosFile = new File(textResources+"statoos.txt");

    public void loadFiles()
    {
        // Dale
        daleNamesMale = populateArrayListFromFile(daleNamesFemaleFile);
        daleNamesFemale = populateArrayListFromFile(daleNamesFemaleFile);

        // Elf
        elfNamesMale = populateArrayListFromFile(elfNamesMalesFile);
        elfNamesFemale = populateArrayListFromFile(elfNamesFemaleFile);

        // Woodsmen
        woodmenNamesMale = populateArrayListFromFile(woodmenNamesMaleFile);
        woodmenNamesFemale = populateArrayListFromFile(woodmenNamesFemaleFile);

        // Bree
        breeNamesMale = populateArrayListFromFile(breeNamesMaleFile);
        breeNamesFemale = populateArrayListFromFile(breeNamesFemaleFile);

        // Dunlending
        dunlendingNamesMale = populateArrayListFromFile(dunlendingNamesMaleFile);
        dunlendingNamesFemale = populateArrayListFromFile(dunlendingNamesFemaleFile);

        // Dwarf
        dwarfNames = populateArrayListFromFile(dwarfNamesFile);

        // Easterling
        easterlingNamesMale = populateArrayListFromFile(easterlingNamesMaleFile);
        easterlingNamesFemale = populateArrayListFromFile(easterlingNamesFemaleFile);

        // Haradrim
        haradrimNamesMale = populateArrayListFromFile(haradrimNamesMaleFile);
        haradrimNamesFemale = populateArrayListFromFile(haradrimNamesFemaleFile);

        // Hobbit
        hobbitNamesMale = populateArrayListFromFile(hobbitNamesMaleFile);
        hobbitNamesFemale = populateArrayListFromFile(hobbitNamesFemaleFile);

        // Rohirric
        rohirricNamesMale = populateArrayListFromFile(rohirricNamesMaleFile);
        rohirricNamesFemale = populateArrayListFromFile(rohirricNamesFemaleFile);

        // Title
        titles = populateArrayListFromFile(titlesFile);

        // Weapons
        weapons = populateArrayListFromFile(weaponsFile);

        // Cultures
        cultures = populateArrayListFromFile(culturesFile);

        // Status Generator
        statoos = populateArrayListFromFile(statoosFile);
    }

    public ArrayList<String> populateArrayListFromFile(File fileName)
    {
        ArrayList<String> listOfNames = new ArrayList<String>();

        try
        {
//            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader  = new BufferedReader(
                    new InputStreamReader(new FileInputStream(fileName),"UTF-8"));

            String line;

            while((line=bufferedReader.readLine())!=null)
            {
                listOfNames.add(line);
            }


        }catch(IOException e)
        {
            e.printStackTrace();
        }

        return listOfNames;

    }



}