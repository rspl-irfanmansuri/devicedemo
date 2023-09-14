package com.springmicroservicedemo.mapping;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;

import com.springmicroservicedemo.model.Devices;
import com.springmicroservicedemo.model.Warranty;
import com.springmicroservicedemo.model.dto.DevicesDto;
import com.springmicroservicedemo.model.dto.WarrantyDto;

@Mapper(componentModel = "spring")
public interface ConverterUtil {
	Devices toEntity(DevicesDto devicesDto);

	DevicesDto toDto(Devices device);

	List<DevicesDto> toListDto(List<Devices> device);

	WarrantyDto toWarrantyDto(Warranty entity);

	Warranty toWarrantyEntity(WarrantyDto dto);
	
	Set<Warranty> toSetWarrantyEntity(Set<WarrantyDto> dto);

	List<WarrantyDto> toListWarrantyDto(List<WarrantyDto> warrantyDtoList);

}
