package com.edu.mock24;

import com.edu.mock24.model.MemoryStorage;
import com.edu.mock24.model.Post;
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
        Publicacion p1 = new Post("lool", new Usuario("dario", "sierroo"), "locooooo");
        Usuario u = new Usuario("Lopeeh","gomez");
        MemoryStorage m = new MemoryStorage();
        m.addUsuario("Dario", "Sierra");
        m.addPublicacion("curritoo ñiii", "Sierra");
        m.addPublicacion("lool", "dario");
        System.out.println(p1);
        m.mostrarPosts();
        System.out.println(m.mostrarRecomendacion());

	}

}
