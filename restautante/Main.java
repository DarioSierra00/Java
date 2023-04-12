package com.edu.restautante;

import java.util.Arrays;
import java.util.Scanner;

import com.edu.restautante.model.Plato;

public class Main {

	static Plato[] platillos = new Plato[10];
	static int index=0;
	
	
	public static final String MENU="------------------------------------------- \n"
								  + "1. Dar de alta un plato \n"
								  + "2. Modificar el precio de un plato \n"
								  + "3. Asignar un vino a un plato \n"
								  + "4. Mostrar información de un plato \n"
								  + "5. Mostrar información de todos los platos \n"
								  + "6. Salir \n"
								  + "-------------------------------------------";
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		
		for(int i = 0; i<platillos.length; i++) {
			platillos[i] = new Plato("prueba", 15);
		}
		
		while (opcion!=6) {
			System.out.println(MENU);
			System.out.println("Introduzca la opcion que mas le interese: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion==1) {
				System.out.println("Introduce el nombre del plato: ");
				String nombrePlato = sc.nextLine();
				System.out.println("Introduce el precio del plato: ");
				int precioPlato = Integer.valueOf(sc.nextLine());
				
				boolean esta = false;
				for(int i = 0; i <platillos.length&&!esta; i++) {
					esta = platillos[i].getNombre().equalsIgnoreCase(nombrePlato);
				}
				if(!esta) {
					platillos[index] = new Plato(nombrePlato, precioPlato);
					index++;
				}else {
					System.out.println("El plato ya existe");
				}
			
			}else if(opcion==2) {
				System.out.println("Dime el nombre del plato: ");
				String nombrePlato = sc.nextLine();
				boolean esta = false;
				for(int i = 0; i <platillos.length&&!esta; i++) {
					esta = platillos[i].getNombre().equalsIgnoreCase(nombrePlato);
				}
				if(!esta) {
					System.out.println("El plato no existe");
				}
			}else if(opcion==3) {
				
			}else if(opcion==4) {
				System.out.println("Dime el nombre del plato: ");
				String nombrePlato = sc.nextLine();
				int posicion= 0;
				boolean esta = false;
				for(int i = 0; i <platillos.length&&!esta; i++) {
					esta = platillos[i].getNombre().equalsIgnoreCase(nombrePlato);
					if(esta) {
						posicion=i;
					}
				}
				if(esta) {
					System.out.println(platillos[posicion]);
				}else if(!esta) {
					System.out.println("El plato no existe");
				}
			}else if(opcion==5) {
				System.out.println(Arrays.toString(platillos));
			}
		}
	}
}
