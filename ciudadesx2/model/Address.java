package com.edu.ciudadesx2.model;

import java.util.Objects;

public class Address {

	private String address_id;
	private String address;

	public Address(String address_id, String address) {
		super();
		this.address_id = address_id;
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, address_id);
	}

	@Override
	public boolean equals(Object obj) {
		return this == obj || obj != null && 
				obj instanceof Address && 
				this.hashCode() == obj.hashCode();
	}

	public String getAddress_id() {
		return address_id;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return String.format("Address id: %s, address: %s ", this.address_id,this.address);
	}
}
