package com.springmicroservicedemo.service;

import java.util.List;

import com.springmicroservicedemo.model.dto.DevicesDto;

public interface DeviceService {
	DevicesDto createOrUpdateDevice(DevicesDto dto) throws Exception;

	List<DevicesDto> getAllDevice();

	DevicesDto deleteById(Integer id) throws Exception;

}
