package com.warehouse.product;

import java.util.Collection;
import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

public interface WarehouseRepository extends CassandraRepository<WarehouseService, Integer>{
	
	@Query("Select * from warehouse where product_code=?0")
	public List<WarehouseService> findByProduct_code(int product_code);

	@Query("Select * from warehouse where product_colour=?0")
	public Collection<WarehouseService> findAllById(String product_colour);

	@Query("Select * from warehouse where slot_number=?0")
	public Collection<WarehouseService> findBySlot(int slot_number);

//	@Query("INSERT INTO warehouse (product_code,product_colour,slot_number) VALUES ()", nativeQuery = true) 
	public Collection<WarehouseService> save(WarehouseRepository whrep);
// 
//	@AllowFiltering
//	public List<WarehouseService> findByProduct_colour(String product_colour);
}
