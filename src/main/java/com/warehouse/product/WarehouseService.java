package com.warehouse.product;

import javax.persistence.Entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Entity
@Table
public class WarehouseService {
    
	@PrimaryKey
	@Column(value="product_code")
	private int product_code;
	@Column(value="product_colour")
	private String product_colour;
	@Column(value="slot_number")
	private int slot_number;
	
	
	public WarehouseService(int product_code, String product_colour, int slot_number) {
		super();
		this.product_code = product_code;
		this.product_colour = product_colour;
		this.slot_number = slot_number;
	}
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public String getProduct_colour() {
		return product_colour;
	}
	public void setProduct_colour(String product_colour) {
		this.product_colour = product_colour;
	}
	public int getSlot_number() {
		return slot_number;
	}
	public void setSlot_number(int slot_number) {
		this.slot_number = slot_number;
	}
	@Override
	public String toString() {
		return "WarehouseService [product_code=" + product_code + ", product_colour=" + product_colour
				+ ", slot_number=" + slot_number + "]";
	}
	
	
	
	
}
