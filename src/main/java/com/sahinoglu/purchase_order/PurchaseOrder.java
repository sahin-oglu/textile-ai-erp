package com.sahinoglu.purchase_order;

import com.sahinoglu.material.Material;
import com.sahinoglu.supplier.Supplier;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private Supplier supplier;
	
	private Material material;
	
//	private quantity;
//	private expectedDate;
//	private actualDate;
//	private status;
//	
//	
}
