package com.edu.mock24;

import com.edu.mock24.model.MemoryStorage;
import com.edu.mock24.model.Publicacion;
import com.edu.mock24.model.Tweet;
import com.edu.mock24.model.Usuario;
import com.edu.mock24.model.enumerados.Valoraciones;
import com.edu.mock24.model.exception.MemoryStorageException;
import com.edu.mock24.model.exception.PublicacionException;


public class Main {

	public static void main(String[] args) throws MemoryStorageException, PublicacionException {
		System.out.println(Valoraciones.BUENA.getValoracion());
        Publicacion p = new Tweet("lol",new Usuario("dario","sierra"));
        p.valorar(Valoraciones.BUENA);
        System.out.println(p);
        Usuario u = new Usuario("Lopeeh","gomez");
        MemoryStorage m = new MemoryStorage();
        m.addUsuario("Dario", "Sierra");
        m.addPublicacion("curritoo ñiii", "Sierra");
        System.out.println(m.mostrarTweets());
        m.mostrarPosts();
        System.out.println(m.mostrarRecomendacion());

	}

}
