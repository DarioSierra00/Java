package com.edu.empresaIT.model;

import java.time.LocalDate;

public class BackendProgrammer extends Candidate implements Backend{

	public BackendProgrammer() {
	}

	public BackendProgrammer(String dni, String name, String surname, LocalDate dateOfBirth, ContractType ct) {
		super(dni, name, surname, dateOfBirth, ct);
	}
	
	@Override
	public double createWebAPIAndDBConnectionCost() {
		return WEB_API_DB_COST;
	}

	@Override
	public double maintenanceCost() {
		return BE_MAINTENANCE_COST;
	}

	@Override
	public double computeGrossSalary() {
		return 0;
	}

}
