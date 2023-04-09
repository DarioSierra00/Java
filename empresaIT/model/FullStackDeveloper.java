package com.edu.empresaIT.model;

import java.time.LocalDate;

public class FullStackDeveloper extends Candidate implements Backend,Frontend{

	public FullStackDeveloper() {
		super();
	}

	
	public FullStackDeveloper(String dni, String name, String surname, LocalDate dateOfBirth, ContractType ct) {
		super(dni, name, surname, dateOfBirth, ct);
	}

	public double createWebAPIAndDBConnectionCost() {
		return WEB_API_DB_COST;
	}
	
	@Override
	public double computeGrossSalary() {
		return 0;
	}


	@Override
	public double computeFEMaintenanceCost() {
		return FE_MAINTENANCE_COST;
	}


	@Override
	public double computeWebDesignCost() {
		return WEB_INTERFACE_DESIGN_COST;
	}


	@Override
	public double maintenanceCost() {
		return BE_MAINTENANCE_COST;
	}
	

}
