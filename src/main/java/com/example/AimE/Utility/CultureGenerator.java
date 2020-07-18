package com.example.AimE.Utility;

public class CultureGenerator
{
    public String generateCulture()
    {
        FileLoader fl = new FileLoader();
        fl.loadFiles();

        int arrayListSize = 0;
        int randomNum = 0;
        String culture = "";

        arrayListSize = fl.cultures.size();
        randomNum = (int) (Math.random() * arrayListSize);
        culture = fl.cultures.get(randomNum);

        return culture;
    }
}
