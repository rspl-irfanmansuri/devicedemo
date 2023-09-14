package com.springmicroservicedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmicroservicedemo.model.dto.WarrantyDto;
import com.springmicroservicedemo.service.WarrantyService;

@RestController
public class WarrantyController {

	private WarrantyService warrantyService;

	@Autowired
	public WarrantyController(WarrantyService warrantyService) {
		this.warrantyService = warrantyService;
	}

	@PostMapping(value = "/addWarranty")
	public ResponseEntity<WarrantyDto> addWarranty(@RequestBody WarrantyDto requestDto) throws Exception {
		WarrantyDto responseDto = warrantyService.addWarranty(requestDto);
		return new ResponseEntity<WarrantyDto>(responseDto, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/warranty/delete/{id}")
	public ResponseEntity<WarrantyDto> deleteById(@PathVariable("id") Integer id) throws Exception {
		return new ResponseEntity<WarrantyDto>(warrantyService.delete(id), HttpStatus.OK);
	}
}
