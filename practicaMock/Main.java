package com.edu.practicaMock;

import com.edu.practicaMock.MemoryStorage.MemoryStorage;
import com.edu.practicaMock.MemoryStorage.MemoryStorageException;
import com.edu.practicaMock.publicacion.Publicacion;
import com.edu.practicaMock.publicacion.PublicacionException;
import com.edu.practicaMock.publicacion.Recomendacion;
import com.edu.practicaMock.publicacion.Tweet;
import com.edu.practicaMock.publicacion.Valoraciones;
import com.edu.practicaMock.usuario.Usuario;

public class Main {

	public static void main(String[] args) throws MemoryStorageException, PublicacionException {

		Usuario u1 = new Usuario("jesus","currito123");
        Publicacion p1 = new Tweet("De locos",u1);
        p1.valorar("SUPERBUENA");
        System.out.println(p1);
        System.out.println("---Creacion Tweet---");

        System.out.println("---Comprobacion de contraseña---");
        System.out.println(u1.checkPass("currito123"));
        System.out.println("---Comprobacion de contraseña---");

        System.out.println("---Creacion Recomendacion---");
        String textoReco = "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
        Publicacion p2 = new Recomendacion(textoReco,u1,5);
        p2.valorar("BUENA");
        System.out.println(p2);
        System.out.println("---Creacion Recomendacion---");

        System.out.println("---Creacion MemoryStorage---");
        MemoryStorage m = new MemoryStorage();
        m.addUsuario("jesus", "currito123");
        m.addUsuario("jesus12", "currito12334");
        m.addUsuario("jesus14", "currito123346");
        m.addPublicacion("De locos", "jesus");
        m.addPublicacion(textoReco, "jesus12", 4);
        m.addPublicacion("Lo mejor de lo mejor", "jesus14", "de lo mejor");
        System.out.println(m.mostrarPost());
        System.out.println(m.mostrarRecomendacion());
        System.out.println(m.mostrarTweets());
        System.out.println("---Creacion MemoryStorage---");
        
	}

}
