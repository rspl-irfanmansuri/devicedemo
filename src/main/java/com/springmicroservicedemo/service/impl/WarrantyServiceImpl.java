package com.springmicroservicedemo.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmicroservicedemo.dao.WarrantyRepository;
import com.springmicroservicedemo.mapping.ConverterUtil;
import com.springmicroservicedemo.model.Warranty;
import com.springmicroservicedemo.model.dto.WarrantyDto;
import com.springmicroservicedemo.service.WarrantyService;

@Service
@Transactional
public class WarrantyServiceImpl implements WarrantyService {

	private WarrantyRepository warrantyRepository;
	private ConverterUtil converterUtil;

	@Autowired
	public WarrantyServiceImpl( ConverterUtil converterUtil) {
		this.warrantyRepository = warrantyRepository;
		this.converterUtil = converterUtil;
	}

	@Override
	public WarrantyDto addWarranty(WarrantyDto requestDto) throws Exception {
		Warranty requestWarranty = converterUtil.toWarrantyEntity(requestDto);
//		if (requestWarranty.getWarntyId() != null && requestWarranty.getWarntyId() > 0) {
//			Optional<Warranty> dbData = warrantyRepository.findById(requestDto.getWarntyId());
//			if (dbData.isPresent()) {
//				requestWarranty.setWarntyId(dbData.get().getWarntyId());
//			}
//		}
		//return converterUtil.toWarrantyDto(warrantyRepository.save(requestWarranty));
		return null;
	}

	@Override
	public WarrantyDto delete(Integer id) throws Exception {
//		Optional<Warranty> dbData = warrantyRepository.findById(id);
//		if (dbData.isPresent()) {
//			warrantyRepository.deleteById(id);
//			return converterUtil.toWarrantyDto(dbData.get());
//		}
		throw new Exception("Data not found");
	}

}
