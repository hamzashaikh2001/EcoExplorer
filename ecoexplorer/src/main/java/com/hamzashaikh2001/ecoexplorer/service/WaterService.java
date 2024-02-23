package com.hamzashaikh2001.ecoexplorer.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzashaikh2001.ecoexplorer.api.model.WaterData;
import com.hamzashaikh2001.ecoexplorer.repository.WaterRepository;

import jakarta.annotation.PostConstruct;

@Service
public class WaterService {
	private final WaterRepository waterRepository;
	
	@Autowired
	public WaterService(WaterRepository waterRepository) {
		this.waterRepository = waterRepository;
	}
	
	@PostConstruct
    public void loadCsvData() {
		String csvFilePath = "/data/WaterData.csv";
		try (InputStream inputStream = getClass().getResourceAsStream(csvFilePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				WaterData waterData = new WaterData(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
				this.waterRepository.save(waterData);
			}
		}
		catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public Iterable<WaterData> getAllWaterData() {
		return this.waterRepository.findAll();
	}
	
	public List<WaterData> getWaterDataByZipCode(String zipCode) {
		List<WaterData> result;
		if (zipCode.length() <= 5) {
			result = this.waterRepository.findByShortenedZipCode(zipCode);
		}
		else {
			result = this.waterRepository.findByZipCode(zipCode);
		}
		return result;
    }

	public WaterData getWaterDataByPWSID(String pwsID) {
		Optional<WaterData> waterData = this.waterRepository.findById(pwsID);
		if(waterData.isPresent()) {
			return (WaterData) waterData.get();
		}
		return null;
	}
}
