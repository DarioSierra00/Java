package com.edu.ficheros.feria.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.gson.Gson;

public class Feria {
	
	private List<Caseta> casetas;

	public Feria(String path) {
		super();
		this.casetas = cargarCaseta(path);
		
	}
	
	private List<Caseta> cargarCaseta(String path){
		List<Caseta> cargandoCasetas = new ArrayList<>();
		File fichero = new File(path);
		
		try {
			
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document documento = builder.parse(fichero);
			documento.getDocumentElement().normalize();
			
			NodeList listaNodosCasetas = documento.getElementsByTagName("DatosLeidos");
			
			for(int i = 0; i < listaNodosCasetas.getLength(); i++) {
				Element node = (Element)listaNodosCasetas.item(i);
				
				String titulo = node.getElementsByTagName("TITULO").item(0).getTextContent();
				String calle = node.getElementsByTagName("CALLE").item(0).getTextContent();
				String numero = node.getElementsByTagName("NUMERO").item(0).getTextContent();
				String modulos = node.getElementsByTagName("MODULOS").item(0).getTextContent();
				String clase = node.getElementsByTagName("CLASE").item(0).getTextContent();
				String entidad = node.getElementsByTagName("ENTIDAD").item(0)!=null? node.getElementsByTagName("ENTIDAD").item(0).getTextContent():" ";				
				String id = node.getElementsByTagName("ID").item(0).getTextContent();
				String id_calle = node.getElementsByTagName("ID_CALLE").item(0).getTextContent();
				
				Caseta cas = new Caseta(titulo,calle,numero,modulos,clase,entidad,id,id_calle);
				
				cargandoCasetas.add(cas);
		}
		
	}catch (ParserConfigurationException | SAXException | IOException e) {
		e.printStackTrace();
	}
	return cargandoCasetas;
}
	public String mostrarCasetasPorCalle(String calle) {
		StringBuilder sb = new StringBuilder();
		for(Caseta c : this.casetas) {
			if(c.getCalle().equals(calle.toUpperCase())) {
				sb.append(c).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public String mostrarCasetasFamiliar() {
		StringBuilder sb = new StringBuilder();
		for(Caseta c : this.casetas) {
			if(c.getClase().equals("FAMILIAR")) {
				sb.append(c).append(System.lineSeparator());
			}
		}return sb.toString();
	}
	
	public String mostrarCasetasDistrito() {
		StringBuilder sb = new StringBuilder();
		for(Caseta c : this.casetas) {
			if(c.getClase().equals("DISTRITO")) {
				sb.append(c).append(System.lineSeparator());
			}
		}return sb.toString();
	}
	
	public String mostrarCasetasDistintas() {
		StringBuilder sb = new StringBuilder();
		for(Caseta c : this.casetas) {
			if(!c.getClase().equals("DISTRITO") && c.getClase().equals("FAMILIAR")) {
				sb.append(c).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public Map<String, Integer> mostrarCasetasFamiliarMap() {
        Map<String, Integer> mapaCalles = new HashMap<>();
        for(Caseta c : this.casetas) {
            if(c.getClase().equals("FAMILIAR")) {
                if(!mapaCalles.containsKey(c.getCalle())){
                    mapaCalles.put(c.getCalle(), 0);
                }
                mapaCalles.replace(c.getCalle(),mapaCalles.get(c.getCalle()) , mapaCalles.get(c.getCalle())+1);
            }
        }
        return mapaCalles;
    }
	public Map mostrarCasetasDistritoMap() {
		Map<String, Integer> mapaCalles = new HashMap<>();
        for(Caseta c : this.casetas) {
            if(c.getClase().equals("DISTRITO")) {
                if(!mapaCalles.containsKey(c.getCalle())){
                    mapaCalles.put(c.getCalle(), 0);
                }
                mapaCalles.replace(c.getCalle(),mapaCalles.get(c.getCalle()) , mapaCalles.get(c.getCalle())+1);
            }
        }
        return mapaCalles;
}
	
	public void eliminarCaseta(String calle,String numero) throws Exception {
        Iterator<Caseta> it = this.casetas.iterator();
        boolean borrado=false;
        Caseta caseta=null;
        int modulo=0;

        while(it.hasNext() && !borrado) {
            caseta=it.next();
            if(caseta.getCalle().equals(calle) && caseta.getNumero().equals(numero)) {
                it.remove();
                modulo=Integer.valueOf(caseta.getModulo());
                borrado=true;
            } else if (Integer.valueOf(caseta.getModulo())>Integer.valueOf(numero) && caseta.getCalle().equals(calle)) {
                caseta.restarNumero(modulo);
            }
        }
        if(!borrado) {
            throw new Exception("No se ha podido borrar la caseta.");
        }
    }
	
	public void exportarJson() throws IOException {
		File exportado = new File("./ficheros/casetasferia.json");
		exportado.createNewFile();
		Gson gson = new Gson();
		String datos = gson.toJson(casetas);
		FileWriter fw = new FileWriter(exportado);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append(datos);
		bw.close();
		fw.close();
	}
}

