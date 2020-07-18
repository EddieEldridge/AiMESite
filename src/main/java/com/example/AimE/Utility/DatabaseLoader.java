package com.example.AimE.Utility;

import com.example.AimE.NPC.NonPlayableCharacter;
import com.example.AimE.NPC.NonPlayableCharacterRepository;
import com.example.AimE.Utility.DiceRoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.AimE.Utility.*;


@Component
public class DatabaseLoader implements CommandLineRunner
{


    private final NonPlayableCharacterRepository repository;

    NonPlayableCharacterGenerator npcGen = new NonPlayableCharacterGenerator();

    @Autowired
    public DatabaseLoader(NonPlayableCharacterRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception
    {
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
        this.repository.save(npcGen.generateCharacter());
    }

}
