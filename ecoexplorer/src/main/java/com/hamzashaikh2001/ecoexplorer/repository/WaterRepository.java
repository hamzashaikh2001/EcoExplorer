package com.hamzashaikh2001.ecoexplorer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hamzashaikh2001.ecoexplorer.api.model.WaterData;

public interface WaterRepository extends CrudRepository<WaterData, String> {
	List<WaterData> findByZipCode(String zipCode);
	List<WaterData> findByShortenedZipCode(String shortenedZipCode);
}
