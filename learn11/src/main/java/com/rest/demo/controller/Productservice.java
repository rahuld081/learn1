package com.rest.demo.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.demo.Products;
@RestController
public class Productservice {
	public static Map <String ,Products> productRepo = new HashMap<>();
	static {
		Products honey =new Products();
		honey.setId("1");
		honey.setName("Honey");
		productRepo.put(honey.getId(),honey);
		
		
		Products almonds = new Products();
		almonds.setId("2");
		almonds.setName("Almonds");
		productRepo.put(almonds.getId(),almonds);
		}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE )
	public ResponseEntity<Object> delete(@PathVariable("id") String id){
	productRepo.remove(id);
	return new ResponseEntity<>("Product Successfully Deleted",HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products/{id}" , method = RequestMethod.PUT )
	public ResponseEntity<Object> update(@PathVariable("id") String id, @RequestBody Products Products){
		productRepo.remove(id);
		Products.setId(id);
		productRepo.put(id,Products);
		return new ResponseEntity<>("Product Successfully Updated",HttpStatus.OK);	
     }
	@RequestMapping(value = "/products" , method = RequestMethod.POST)
	public ResponseEntity<Object> AddProducts(@RequestBody Products product){
		productRepo.put(product.getId(), product);
		return new ResponseEntity<>("Product Added Successfully",HttpStatus.OK);	
	}
	@RequestMapping( value = "/products")
	public ResponseEntity <Object> getProducts(){
		return new ResponseEntity<>(productRepo.values(),HttpStatus.OK);
	}
}
