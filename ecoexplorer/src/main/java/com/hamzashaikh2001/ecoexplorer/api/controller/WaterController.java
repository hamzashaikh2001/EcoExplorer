package com.hamzashaikh2001.ecoexplorer.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hamzashaikh2001.ecoexplorer.api.model.WaterData;
import com.hamzashaikh2001.ecoexplorer.service.WaterService;

@RestController
public class WaterController {
	private final WaterService waterService;
	
	@Autowired
	public WaterController(WaterService waterService) {
		this.waterService = waterService;
	}
	
	@GetMapping("/api/waterdata")
	public Iterable<WaterData> getAllWaterData() {
		return this.waterService.getAllWaterData();
	}
	
	@GetMapping("/api/waterdata/zips/{zipCode}")
	public List<WaterData> getWaterDataByZipCode(@PathVariable String zipCode) {
		return this.waterService.getWaterDataByZipCode(zipCode);
    }
	
	@GetMapping("/api/waterdata/pwsids/{pwsID}")
	public WaterData getWaterDataByPWSID(@PathVariable String pwsID) {
		return this.waterService.getWaterDataByPWSID(pwsID);
	}
}
