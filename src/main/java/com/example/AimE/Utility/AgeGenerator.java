package com.example.AimE.Utility;

import com.example.AimE.Utility.FileLoader;

public class AgeGenerator
{
    public int generateAge()
    {
        int age = (int) +((Math.random() * 100) + 16);

        return age;
    }
}
