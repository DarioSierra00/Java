package com.edu.empresaIT.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Candidate {
	
	private LocalDate dateOfBirth;
	private LocalDateTime startDate;
	private String dni;
	private String name;
	private String surname;
	private ContractType ct;
	private boolean inProject;
	
	public Candidate() {
		super();
		this.startDate= LocalDateTime.now();
	}
	
	public Candidate(String dni, String name, String surname, LocalDate dateOfBirth, ContractType ct) {
		super();
		setDni(dni);
		setName(name);
		setSurname(surname);
		setDateOfBirth(dateOfBirth);
		this.ct = ct;
		this.startDate = LocalDateTime.now();
	}
	
	public abstract double computeGrossSalary();

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ContractType getCt() {
		return ct;
	}

	public void setCt(ContractType ct) {
		this.ct = ct;
	}
	
	public boolean isInPorject() {
		return this.inProject;
	}

	public void setInProject(boolean inProject) {
		this.inProject = inProject;
	}
	
	public int compareTo(Candidate c) {
		return this.dni.compareTo(c.dni);
		
	}
	
}
