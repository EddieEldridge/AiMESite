package com.example.AimE.Utility;

public class GenderGenerator
{
    public String generateGender()
    {
        int randomNum = (int) (Math.random() * 2);
        String gender;

        if(randomNum==1)
        {
            gender = "Male";
        }
        else
        {
            gender = "Female";
        }
        return gender;
    }

}
