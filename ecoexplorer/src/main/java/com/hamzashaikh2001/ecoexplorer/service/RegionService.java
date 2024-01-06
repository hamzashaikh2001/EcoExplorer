package com.hamzashaikh2001.ecoexplorer.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzashaikh2001.ecoexplorer.api.model.RegionData;
import com.hamzashaikh2001.ecoexplorer.repository.RegionRepository;

import jakarta.annotation.PostConstruct;

@Service
public class RegionService {
	private final RegionRepository regionRepository;
	
	@Autowired
	public RegionService(RegionRepository regionRepository) {
		this.regionRepository = regionRepository;
	}
	
	@PostConstruct
    public void loadCsvData() {
		String csvFilePath = "/data/RegionData.csv";
		try (InputStream inputStream = getClass().getResourceAsStream(csvFilePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				RegionData regionData = new RegionData(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11], values[12], values[13], values[14]);
				this.regionRepository.save(regionData);
			}
		}
		catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public Iterable<RegionData> getAllRegionData() {
		return this.regionRepository.findAll();
	}
	
	public RegionData getRegionData(String zipCode) {
		Optional<RegionData> regionData = this.regionRepository.findById(zipCode);
		if(regionData.isPresent()) {
			return (RegionData) regionData.get();
		}
		return null;
	}
}
