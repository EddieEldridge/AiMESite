package com.example.AimE.Utility;

public class StatusGenerator {

    public String generateStatus()
    {
        FileLoader fl = new FileLoader();
        fl.loadFiles();

        int arrayListSize = 0;
        int randomNum = 0;
        String status = "";

        arrayListSize = fl.statoos.size();
        randomNum = (int) (Math.random() * arrayListSize);
        status = fl.statoos.get(randomNum);

        return status;
    }
}
