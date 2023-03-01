package com.edu.producto;

import java.util.Scanner;

import com.edu.producto.model.Producto;



public class Main {

	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Producto p = new Producto("283hf36dg", "Producto de limpieza", 20.5);
		System.out.println(p.getConsulta());


			
			
				System.out.println(p.getConsulta());
		
				System.out.println("Introduce un nuevo codigo para el producto: ");
				p.setCodigo(sc.nextLine());
				System.out.println("Introduce una nueva descripcion: ");
				p.setDescripcion(sc.nextLine());
				System.out.println("Introduce un nuevo precio: ");
				//p.setPrecioSinIva(sc.next());

				
			}
		}
	
	


