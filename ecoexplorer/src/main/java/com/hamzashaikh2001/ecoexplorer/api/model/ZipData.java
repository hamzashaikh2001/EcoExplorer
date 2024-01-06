package com.hamzashaikh2001.ecoexplorer.api.model;

import java.util.List;

public class ZipData {
	
	private RegionData regionData;
	private List<WaterData> waterData;
	
	public ZipData(RegionData regionData, List<WaterData> waterData) {
		this.regionData = regionData;
		this.setWaterData(waterData);
	}

	public RegionData getRegionData() {
		return regionData;
	}

	public void setRegionData(RegionData regionData) {
		this.regionData = regionData;
	}

	public List<WaterData> getWaterData() {
		return waterData;
	}

	public void setWaterData(List<WaterData> waterData) {
		this.waterData = waterData;
	}
}
