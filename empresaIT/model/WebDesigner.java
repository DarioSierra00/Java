package com.edu.empresaIT.model;

import java.time.LocalDate;

public class WebDesigner extends Candidate implements Frontend{

	public WebDesigner() {
	}

	public WebDesigner(String dni, String name, String surname, LocalDate dateOfBirth, ContractType ct) {
		super(dni, name, surname, dateOfBirth, ct);
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
	public double computeGrossSalary() {
		return 0;
	}

}
