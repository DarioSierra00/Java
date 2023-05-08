package com.edu.ficheros.feria;

import java.io.IOException;
import java.util.Scanner;

import com.edu.ficheros.feria.model.Feria;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Feria f = new Feria("./ficheros/casetasferia.xml");
		String menu = "1. Mostrar todas las casetas existentes en una calle.\r\n"
                + "2. Mostrar todas las casetas de tipo familiar.\r\n"
                + "3. Mostrar todas las casetas de tipo Distrito\r\n"
                + "4. Mostrar todas las casetas que no sean ni familiares ni distritos.\r\n"
                + "5. Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo familiar\r\n"
                + "que existen.\r\n"
                + "6. Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo Distrito\r\n"
                + "que existen \r\n"
                + "7. Eliminar una caseta\r\n"
                + "8. Salir";
		
		int opcion = 0;
		
		try {
			f.exportarJson();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		while(opcion!=8) {
			System.out.println(menu);
			System.out.println("Elige una opcion");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion == 1) {
				System.out.println("introduce la calle de la feria");
				String calle = sc.nextLine();
				System.out.println(f.mostrarCasetasPorCalle(calle));
			}
			else if (opcion==2) {
				System.out.println(f.mostrarCasetasFamiliar());
			} else if (opcion==3) {
				System.out.println(f.mostrarCasetasDistrito());
			} else if (opcion==4) {
				System.out.println(f.mostrarCasetasDistintas());
			} else if (opcion==5) {
				System.out.println(f.mostrarCasetasFamiliarMap());
			}else if (opcion==6) {
				System.out.println(f.mostrarCasetasDistritoMap());
			}else if (opcion==7) {
				System.out.println("introduce la calle de la feria");
				String calle = sc.nextLine();
				System.out.println("introduce el numero de la caseta");
				String numero = sc.nextLine();
				try {
					f.eliminarCaseta(calle, numero);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
