package com.edu.ficheros;

import java.io.File;
import java.time.LocalDateTime;

public class Fichero {
	
	private String nombre;
	private String path;
	private long size;
	private String extension;
	private String permisos;
	private boolean esDirectorio;
	private String ficherosHijo;
	private String directoriosHijos;
	private LocalDateTime fechaCreacion;
	private File file;
	
	public Fichero(String rutaAbsoluta) {
		this.file = new File(rutaAbsoluta);
		
		file = new File(rutaAbsoluta);
		this.ficherosHijo = "0";
		this.directoriosHijos = "0";

		if(this.file.exists()) {
			this.path = file.getPath();
			this.nombre = file.getName();
			this.size = file.getUsableSpace();
			this.permisos = this.file.canRead() ? "con permisos de escritura" : "";
			this.esDirectorio = file.isDirectory();
		}else {
			file.mkdir();
			this.path = file.getPath();
			this.nombre = file.getName();
			this.size = file.getUsableSpace();
			this.permisos = this.file.canRead() ? "con permisos de escritura" : "";
			this.esDirectorio = file.isDirectory();
		}

		if(this.file.listFiles() != null) {
			for(File hijos : this.file.listFiles()){
				if(hijos.isDirectory()) {
					this.directoriosHijos += hijos.toString() + " ";
				}else {
					this.ficherosHijo += hijos.toString() + " ";
				}
			}
		}
		
	}
	
	

	@Override
	public String toString() {
		return String.format("Ruta %s, nombre %s, tamaño %s, permisos %s, es directorio %s, "
				+ "directorios hijos %s, ficheros hijos %s "
				, this.path,this.nombre,this.size,this.permisos,this.esDirectorio,this.directoriosHijos,this.ficherosHijo);
	}
	
	
}
