package com.edu.listas.ejercicio3;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) throws HistorialException {
		
		PaginaWeb pw = new PaginaWeb("currito.com", LocalDateTime.now());
		Historial h = new Historial();
		
		try {
			//añadimos al historial la pagina pw
			h.addPaginaHistorial(pw);
			
			//mostramos historial completo
			System.out.println(h.mostrarHistorialCompleto());
			//borramos visitas con la url
			h.borrarVisitasPagina("currito.com");
			//la volvemos a añadir
			h.addPaginaHistorial(pw);
			//la comprobamos con el dia de hoy
			System.out.println(h.mostrarHistorialDia(13));
			
			//Probamos la excepcion
			PaginaWeb pw1 = new PaginaWeb("currito.com", LocalDateTime.of(2023, 04, 12, 12, 12));

			h.addPaginaHistorial(pw1);
			
			System.out.println(h.mostrarHistorialCompleto());
		} catch (Exception e) {
		}
		
		
		
	}

}
