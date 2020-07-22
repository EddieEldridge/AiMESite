package com.example.AimE.Utility;

import com.example.AimE.NPC.NonPlayableCharacter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMarshaller
{
    ObjectMapper mapper = new ObjectMapper();

    public String javaObjecToJSON(NonPlayableCharacter npc) throws JsonProcessingException
    {
        String jsonString = mapper.writeValueAsString(npc);
        System.out.println(jsonString);
        return jsonString;
    }
}
