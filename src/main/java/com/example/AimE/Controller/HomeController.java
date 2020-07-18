package com.example.AimE.Controller;

import com.example.AimE.NPC.NonPlayableCharacter;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.AimE.Utility.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    NonPlayableCharacterGenerator npcGen = new NonPlayableCharacterGenerator();
    ObjectMarshaller marshaller = new ObjectMarshaller();

    @RequestMapping(value = "/home")
    public String index()
    {
        return "index";
    }

    @GetMapping(value = "/api/generateCharacter", produces = MediaType.APPLICATION_JSON_VALUE)
    public String generateCharacter() throws JsonProcessingException {
        NonPlayableCharacter randomNPC = npcGen.generateCharacter();
        String randomNPCJSON = marshaller.javaObjecToJSON(randomNPC);
        System.out.println(randomNPCJSON);
        return randomNPCJSON;
    }




}
