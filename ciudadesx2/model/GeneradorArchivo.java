package com.edu.ciudadesx2.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.util.StreamReaderDelegate;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeneradorArchivo {
	
	private List<Country> listCountry;
	
	
	
	public GeneradorArchivo() throws IOException {
		super();
		this.listCountry = new ArrayList<>();
		addCountry();
	}



	public void addCountry() throws IOException {
		File f = new File("./ficheros/country.txt");
		
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String linea = bf.readLine();
		linea = bf.readLine();
		String[] arrayCountry;
		
		while(linea != null) {
			arrayCountry = linea.split(",");
			
			this.listCountry.add(new Country(arrayCountry[0], arrayCountry[1]));
			linea = bf.readLine();
		}
		bf.close();
	}
	
	public void generarFichero() throws IOException {
		File f = new File("./ficheros/yiii.txt");
		
		f.createNewFile();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		
		for(Country c : this.listCountry) {
			bw.append(c.toString());
			bw.newLine();
		}
		bw.close();
	}
	
	public void toJson() throws IOException {
		Gson g = new GsonBuilder().setPrettyPrinting().enableComplexMapKeySerialization().create();
		File f = new File("./ficheros/loco.json");
		f.createNewFile();
		
		PrintWriter pw = new PrintWriter(f);
		g.toJson(this.listCountry,pw);
		
		pw.close();
	}
	
	public void toCsv() throws IOException {
		File f = new File("./ficheros/csvLoco.csv");
		f.createNewFile();
		
		PrintWriter pw = new PrintWriter(f);
		pw.append("Country,id,numCities"+System.lineSeparator());
		
		for(Country c : this.listCountry) {
			pw.append(String.format("%s,%s,%s \n", c.getCountry_id(), c.getCountry(),c.getListCity()));
		}
		pw.close();
	}

	
	public void toXML() {
		try {
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			Element nodoRaiz = doc.createElement("countries");
			doc.appendChild(nodoRaiz);
			
			for(Country c : this.listCountry) {
				Element primerNodoHijo= doc.createElement("country");
				nodoRaiz.appendChild(primerNodoHijo);
				
				Element nombreId = doc.createElement("id");
				nombreId.appendChild(doc.createTextNode(c.getCountry_id()));
				primerNodoHijo.appendChild(nombreId);
				
				Element nombre = doc.createElement("nombre");
				nombre.appendChild(doc.createTextNode(c.getCountry()));
				primerNodoHijo.appendChild(nombre);
				
				Element ciudades = doc.createElement("cities");
				primerNodoHijo.appendChild(ciudades);
				for(City c1 : c.getListCity()) {
					Element ciudad = doc.createElement("city");
					ciudades.appendChild(ciudad);
					
					Element id = doc.createElement("id_city");
					id.appendChild(doc.createTextNode(c1.getCity_id()));
					ciudad.appendChild(id);
					
					Element nombreCity = doc.createElement("nombreCity");
					nombreCity.appendChild(doc.createTextNode(c1.getCity()));
					ciudad.appendChild(nombreCity);
					
					
					Element addresses = doc.createElement("addresses");
					ciudad.appendChild(addresses);
					for(Address a : c1.getListAddress()) {
						Element address = doc.createElement("address");
						
						Element idAddress = doc.createElement("address_id");
						idAddress.appendChild(doc.createTextNode(a.getAddress_id()));
						address.appendChild(idAddress);
						
						Element addressName = doc.createElement("address_name");
						addressName.appendChild(doc.createTextNode(a.getAddress()));
						address.appendChild(addressName);
						
						addresses.appendChild(address);
					}
					
				}
			}
			
			Transformer optimus = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("./ficheros/jgjgjgcj.xml"));
			
			optimus.setOutputProperty(OutputKeys.INDENT, "yes");
			optimus.transform(source, result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
