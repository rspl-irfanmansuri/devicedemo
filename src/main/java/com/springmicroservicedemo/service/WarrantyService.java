package com.springmicroservicedemo.service;

import com.springmicroservicedemo.model.dto.WarrantyDto;

public interface WarrantyService {

	WarrantyDto addWarranty(WarrantyDto requestDto) throws Exception;

	WarrantyDto delete(Integer id) throws Exception;

}
