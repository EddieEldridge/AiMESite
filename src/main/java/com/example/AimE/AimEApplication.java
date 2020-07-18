package com.example.AimE;

import com.example.AimE.Utility.FileLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AimEApplication {

	public static void main(String[] args)
	{
		init();

		SpringApplication.run(AimEApplication.class, args);
	}

	public static void init()
	{
		FileLoader fileLoader = new FileLoader();
		fileLoader.loadFiles();
	}

}
