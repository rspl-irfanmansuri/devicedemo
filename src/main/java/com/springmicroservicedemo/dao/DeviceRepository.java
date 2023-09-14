package com.springmicroservicedemo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmicroservicedemo.model.Devices;

@Repository
public interface DeviceRepository extends JpaRepository<Devices, Integer> {

	public Optional<Devices> findByImei1OrImei2(String imei1, String imei2);

	public Optional<Devices> findByMacID(String macID);

}
