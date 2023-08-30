package com.example.application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "battery")
public class Battery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="name")
    private String name;
  //  @Column(columnDefinition = "encrypted_string")
    @Column(name="postcode")
    private String postcode;
   // @Column(columnDefinition = "encrypted_string")
    @Column(name="watt_capacity")
    private double wattCapacity;
	public Battery(Long id, String name, String postcode, double wattCapacity) {
		super();
		this.id = id;
		this.name = name;
		this.postcode = postcode;
		this.wattCapacity = wattCapacity;
	}
	public Battery() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public double getWattCapacity() {
		return wattCapacity;
	}
	public void setWattCapacity(double wattCapacity) {
		this.wattCapacity = wattCapacity;
	}
    
   
}

