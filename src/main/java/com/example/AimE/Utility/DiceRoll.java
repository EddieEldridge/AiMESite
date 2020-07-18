package com.example.AimE.Utility;

public class DiceRoll {

    public int rollD20()
    {
        int diceResult = 1+(int)(Math.random()*20);

        return diceResult;
    }

    public int rollD12()
    {
        int diceResult = 1+(int)(Math.random()*12);

        return diceResult;
    }

    public int rollD6()
    {
        int diceResult = 1+(int)(Math.random()*6);

        return diceResult;
    }


}
