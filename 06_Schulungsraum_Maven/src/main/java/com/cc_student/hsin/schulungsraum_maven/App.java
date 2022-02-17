package com.cc_student.hsin.schulungsraum_maven;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.cc_student.hsin.schulungsraum_maven.model.ConfigReader;
import com.cc_student.hsin.schulungsraum_maven.model.ConfigWriter;
import com.cc_student.hsin.schulungsraum_maven.model.Tier;

public class App {

	public static void main(String[] args) {
		// new File(System.getProperty("user.home")+ "/.bhs").mkdirs();
		String appDir =  System.getProperty("user.home")+ "/.bhs";
		try {
			Files.createDirectories(Paths.get(appDir));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		String homeDir = System.getProperty("user.home");
		System.out.println(homeDir);
		if (Files.exists(Paths.get(homeDir + "/.bhs"))) {
			System.out.println("Ordner vorhanden");
		}
		
		ConfigReader cr = new ConfigReader(appDir + "/config.xml");
		List<Tier> tiere = cr.readConfig();
		for (Tier tier : tiere) {
			System.out.println(tier);
		}
		
//		Tier lamm = new Tier();
//		lamm.setName("Lamm");
//		lamm.setPreis("23");
//		tiere.add(lamm);
		
		ConfigWriter cw = new ConfigWriter(appDir + "/config.xml");
		cw.writeConfig(tiere);

	}

}
