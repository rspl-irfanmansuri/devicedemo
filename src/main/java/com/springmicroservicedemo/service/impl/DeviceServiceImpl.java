package com.springmicroservicedemo.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmicroservicedemo.dao.DeviceRepository;
import com.springmicroservicedemo.mapping.ConverterUtil;
import com.springmicroservicedemo.model.DeviceType;
import com.springmicroservicedemo.model.Devices;
import com.springmicroservicedemo.model.dto.DevicesDto;
import com.springmicroservicedemo.service.DeviceService;

/**
 * Author: Irfan Mansuri
 * description: Business logic
 * version: 1.0
 */

@Service
public class DeviceServiceImpl implements DeviceService {

	private DeviceRepository deviceRepository;

	private ConverterUtil converterUtil;

	@Autowired
	public DeviceServiceImpl(DeviceRepository deviceRepository, ConverterUtil converterUtil) {
		this.deviceRepository = deviceRepository;
		this.converterUtil = converterUtil;
	}

	@Override
	@Transactional
	public DevicesDto createOrUpdateDevice(DevicesDto dto) throws Exception {
		Optional<Devices> devices = java.util.Optional.empty();
		Devices dbDevice;
		if (dto.getId() != null && dto.getId() > 0) {
			devices = deviceRepository.findById(dto.getId());
		} else if (dto.getDeviceType() == DeviceType.PHONE) {
			devices = deviceRepository.findByImei1OrImei2(dto.getImei1(), dto.getImei2());
		} else if (dto.getDeviceType() == DeviceType.IPAD) {
			devices = deviceRepository.findByMacID(dto.getMacID());
		} else {
			throw new Exception("Device not support");
		}
		Devices device = converterUtil.toEntity(dto);

		if (devices.isPresent()) {
			dbDevice = devices.get();
			device.setId(dbDevice.getId());
		}
		Devices storedData = deviceRepository.save(device);

		return converterUtil.toDto(storedData);
	}

	@Override
	public List<DevicesDto> getAllDevice() {
		List<Devices> devices = deviceRepository.findAll();
		if (!devices.isEmpty() && devices.size() > 0) {
			return converterUtil.toListDto(devices);
		}
		return Collections.emptyList();
	}

	@Override
	public DevicesDto deleteById(Integer id) throws Exception {
		Optional<Devices> device = deviceRepository.findById(id);
		if(device.isPresent()) {
			deviceRepository.deleteById(id);
			return converterUtil.toDto(device.get());
		}
		throw new Exception("Device not found");
	}

}
