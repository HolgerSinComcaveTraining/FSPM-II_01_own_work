package com.cc_student.hsin.schulungsraum_maven.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.html.HTMLLegendElement;

import javax.xml.stream.XMLEventReader;

public class ConfigReader {

	private String file;
	private final String NAME = "name";
	private final String PREIS = "preis";
	private final String ITEM = "item";
	
	public ConfigReader(String file) {
		this.file = file;
	}
	
	public List<Tier> readConfig(){
		List<Tier> tiere = new ArrayList<Tier>();
		XMLInputFactory inputFactory = XMLInputFactory.newFactory();
		ClassLoader cl = getClass().getClassLoader();
		InputStream is = null;
		Path p = Paths.get(file);
		if (Files.exists(p)) {
			System.out.println("Datei gefunden");
			try {
				is = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			is = cl.getResourceAsStream("config.xml");
		}
		try {
			XMLEventReader eventReader = inputFactory.createXMLEventReader(is);
			Tier tier = null;
			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();
				if (event.isStartElement()){
					StartElement startElement = event.asStartElement();
					String elementName = startElement.getName().getLocalPart();
					switch (elementName) {
					case ITEM:
						tier = new Tier();
						break;
					case NAME:
						event = eventReader.nextEvent();
						tier.setName(event.asCharacters().getData());
						break;
					case PREIS:
						event = eventReader.nextEvent();
						tier.setPreis(event.asCharacters().getData());
						break;					
					}
				}
				if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart().equals(ITEM)) {
						tiere.add(tier);
					}
				}
			}
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tiere;
	}
	
}
