package com.hamzashaikh2001.ecoexplorer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzashaikh2001.ecoexplorer.api.model.RegionData;
import com.hamzashaikh2001.ecoexplorer.api.model.WaterData;
import com.hamzashaikh2001.ecoexplorer.api.model.ZipData;

@Service
public class ZipService {
	
	private final RegionService regionService;
	private final WaterService waterService;

	@Autowired
	public ZipService(RegionService regionService, WaterService waterService) {
		this.regionService = regionService;
		this.waterService = waterService;
	}

	public ZipData getZipData(String zipCode) {
		RegionData regionData = this.regionService.getRegionData(zipCode);
		List<WaterData> waterData = this.waterService.getWaterDataByZipCode(zipCode);
		return new ZipData(regionData, waterData);
	}
}
