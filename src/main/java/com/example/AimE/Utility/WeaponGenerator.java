package com.example.AimE.Utility;

public class WeaponGenerator
{
    public String generateWeapon()
    {
        FileLoader fl = new FileLoader();
        fl.loadFiles();

        int arrayListSize = 0;
        int randomNum = 0;
        String weapon = "";

        arrayListSize = fl.weapons.size();
        randomNum = (int) (Math.random() * arrayListSize);
        weapon = fl.weapons.get(randomNum);

        return weapon;
    }
}
