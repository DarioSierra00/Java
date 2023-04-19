package com.edu.listas.ejercicio7.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.edu.listas.ejercicio7.exception.CajaException;

public class Almacen {
	private List<Caja> cajas;
	
	
	
	public Almacen() {
		super();
		this.cajas = new ArrayList<>();
	}



	public void abrirCaja(int numCaja) throws CajaException {
		for(Caja c : this.cajas) {
			if(c.getNumeroCaja() == numCaja) {
				c.abrirCaja();
			}
		}
}
	
	public void cerrarCaja(int numCaja) throws CajaException {
		for(Caja c : this.cajas) {
			if(c.getNumeroCaja() == numCaja) {
				c.cerrarCaja();
			}
		}
	}
	
	public String addClienteCaja() throws AlmacenException {
		Cliente cli = new Cliente();
		Caja ca = new Caja();
		for (Caja c : this.cajas) {
			if(c.isEstado() && c.getClientesCaja() < ca.getClientesCaja()) {
				ca = c;
			}
			else if(c.isEstado() && c.getClientesCaja() == ca.getClientesCaja()) {
				if(c.getNumeroCaja() < ca.getNumeroCaja()) {
					ca = c;
				}
			}
		}
		cli.setNumCajaAsignada(ca.getNumeroCaja());
		ca.addCliente(cli);
		return String.format("Es usted el cliente número %s y debe ir a la caja número %s", cli.getNumeroCliente(), ca.getNumeroCaja());
		/*Cliente c = new Cliente();
		Caja cajaMenor = new Caja();
		for(Caja c1: this.cajas) {
			if(c1.isEstado() && c1.getClientesCaja() < cajaMenor.getClientesCaja()) {
				cajaMenor = c1;
			}else if(c1.isEstado() && c1.getNumeroCaja() < cajaMenor.getNumeroCaja()) {
				cajaMenor = c1;
			}
		}
		c.setNumCajaAsignada(cajaMenor.getNumeroCaja());
		cajaMenor.addCliente(c);
		return String.format("Es usted el cliente número %s, y de debe ir a la"
							+ "	caja número %s", c.getNumeroCliente(),cajaMenor.getNumeroCaja());*/
	}
	
	public String atenderCliente(int numCaja) throws AlmacenException {
		String resultado = "";
		for(Caja c : this.cajas) {
			if(c.getNumeroCaja() == numCaja) {
				if(c.isEstado() && c.getClientesCaja() > 0) {
					resultado = c.atenderCliente();
				}
			}
		}return resultado;
	}
	
	public void addCaja(Caja c) {
		this.cajas.add(c);
	}
}
