package com.example.AimE.Utility;

import com.example.AimE.Utility.FileLoader;

public class TitleGenerator
{
    public String generateTitle()
    {
        FileLoader fl = new FileLoader();
        fl.loadFiles();

        int arrayListSize = 0;
        int randomNum = 0;
        String title = "";

        arrayListSize = fl.titles.size();
        randomNum = (int) (Math.random() * arrayListSize);
        title = fl.titles.get(randomNum);

        return title;
    }
}
