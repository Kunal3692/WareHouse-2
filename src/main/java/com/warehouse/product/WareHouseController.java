package com.warehouse.product;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WareHouseController {

@Autowired
WarehouseRepository whrep;

@RequestMapping("/warehouse/find/{product_code}")
@GET
public List<WarehouseService> findByCode(@PathVariable int product_code) {

	  return whrep.findByProduct_code(product_code);

	 }

@RequestMapping("/warehouse/find/{product_colour}")
@GET
public Collection<WarehouseService>findByColour(@PathVariable String product_colour){

	return whrep.findAllById(product_colour);
}
@RequestMapping("/warehouse/find/{slot_number}")
@GET
public Collection<WarehouseService>findBySlot(@PathVariable int slot_number){

	return whrep.findBySlot(slot_number);
}

@RequestMapping("/warehouse")
@GET
public Collection<WarehouseService>findAll(){
	
return whrep.findAll();
	
}
@RequestMapping("/store")
@POST
public Collection<WarehouseService>SaveAll(){
	
return whrep.save(whrep);
	
}
}