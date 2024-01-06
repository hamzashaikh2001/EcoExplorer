package com.hamzashaikh2001.ecoexplorer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hamzashaikh2001.ecoexplorer.api.model.RegionData;
import com.hamzashaikh2001.ecoexplorer.service.RegionService;

@RestController
public class RegionController {
	private final RegionService regionService;
	
	@Autowired
	public RegionController(RegionService regionService) {
		this.regionService = regionService;
	}
	
	@GetMapping("/api/regiondata")
	public Iterable<RegionData> getAllRegionData() {
		return this.regionService.getAllRegionData();
	}
	
	@GetMapping("/api/regiondata/zips/{zipCode}")
	public RegionData getRegionData(@PathVariable String zipCode) {
		return this.regionService.getRegionData(zipCode);
	}
}
