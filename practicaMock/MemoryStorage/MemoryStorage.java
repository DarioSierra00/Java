package com.edu.practicaMock.MemoryStorage;



import java.util.Arrays;

import com.edu.practicaMock.publicacion.Post;
import com.edu.practicaMock.publicacion.Publicacion;
import com.edu.practicaMock.publicacion.PublicacionException;
import com.edu.practicaMock.publicacion.Recomendacion;
import com.edu.practicaMock.publicacion.Tweet;
import com.edu.practicaMock.usuario.Usuario;

public class MemoryStorage {
	private static final int NUM_MAXIMO_USUARIOS=15;
	private static final int NUM_MAXIMO_PUBLICACIONES=50;
	private int numUsuariosActuales;
	private int numPublicacionesActuales;
	
	Usuario[] usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
	Publicacion[] publicaciones = new Publicacion[NUM_MAXIMO_PUBLICACIONES];
	
	public MemoryStorage() {
		
	}
	
	private int posicionUsuario(String login) {
		int posicion = -1;
		for(int i = 0; i<usuarios.length && posicion==-1; i++) {
			if(usuarios[i]!=null && usuarios[i].getLogin().equals(login)) {
				posicion = i;
			}
		}return posicion;
	}
	
	public void addUsuario(String login, String pass) throws MemoryStorageException {
		if(NUM_MAXIMO_USUARIOS==numUsuariosActuales) {
			throw new MemoryStorageException("No hay hueco para más usuarios");
		}
		else {
			this.usuarios[numUsuariosActuales++%NUM_MAXIMO_USUARIOS] = new Usuario(login, pass);
		}
	}
	
	public void addPublicacion(String texto, String login) throws MemoryStorageException, PublicacionException {
		int pos = posicionUsuario(login);
		
		if(NUM_MAXIMO_PUBLICACIONES==numPublicacionesActuales) {
			throw new MemoryStorageException("No hay espacio para mas publicaciones");
		}
		else {
			if(pos!=-1) {
				this.publicaciones[numPublicacionesActuales++%NUM_MAXIMO_PUBLICACIONES] = new Tweet(texto, this.usuarios[pos]);
			}
		}
	}
	
	public void addPublicacion(String texto, String login, String tema) throws MemoryStorageException, PublicacionException {
		int pos = posicionUsuario(login);
		
		if(NUM_MAXIMO_PUBLICACIONES==numPublicacionesActuales) {
			throw new MemoryStorageException("No hay espacio para mas publicaciones");
		}
		else {
			if(pos!=-1) {
				this.publicaciones[numPublicacionesActuales++%NUM_MAXIMO_PUBLICACIONES] = new Post(texto, this.usuarios[pos], tema);
			}
		}
	}
	
	public void addPublicacion(String texto, String login, int numeroEstrellas) throws MemoryStorageException, PublicacionException {
		int pos = posicionUsuario(login);
		
		if(NUM_MAXIMO_PUBLICACIONES==numPublicacionesActuales) {
			throw new MemoryStorageException("No hay espacio para mas publicaciones");
		}
		else {
			if(pos!=-1) {
				this.publicaciones[numPublicacionesActuales++%NUM_MAXIMO_PUBLICACIONES] = new Recomendacion(texto, this.usuarios[pos], numeroEstrellas);
			}
		}
	}
	
	public String mostrarListaPublicaciones() {
		StringBuilder sb = new StringBuilder();
		
		for(Publicacion p: publicaciones) {
			if(p!=null) {
				sb.append(p).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public String mostrarTweets() {
		StringBuilder sb = new StringBuilder();
		
		for(Publicacion p: publicaciones) {
			if(p!=null && p instanceof Tweet) {
				sb.append(p).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public String mostrarPost() {
		StringBuilder sb = new StringBuilder();
		
		for(Publicacion p: publicaciones) {
			if(p!=null && p instanceof Post) {
				sb.append(p).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public String mostrarRecomendacion() {
		StringBuilder sb = new StringBuilder();
		for(Publicacion p: publicaciones) {
			if(p!=null && p instanceof Recomendacion) {
				sb.append(p).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	

	}

