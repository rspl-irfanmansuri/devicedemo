package com.springmicroservicedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmicroservicedemo.model.dto.DevicesDto;
import com.springmicroservicedemo.service.DeviceService;

/**
 * Author: Irfan Mansuri
 * description: Entry point of access Device operation
 * version: 1.0
 */
@RestController
public class DeviceController {

	private DeviceService deviceService;

	@Autowired
	public DeviceController(DeviceService deviceService) {
		this.deviceService = deviceService;
	}

	@PostMapping(value = "/createOrUpdate")
	public ResponseEntity<DevicesDto> createOrUpdateDevice(@RequestBody DevicesDto dto) throws Exception {
		return new ResponseEntity<>(deviceService.createOrUpdateDevice(dto), HttpStatus.CREATED);
	}

	@GetMapping(value = "/fetch")
	public ResponseEntity<?> getDevices() throws Exception {
		return new ResponseEntity<>(deviceService.getAllDevice(), HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteDevece(@PathVariable("id") Integer id) throws Exception {
		return new ResponseEntity<>(deviceService.deleteById(id), HttpStatus.OK);
	}
}
