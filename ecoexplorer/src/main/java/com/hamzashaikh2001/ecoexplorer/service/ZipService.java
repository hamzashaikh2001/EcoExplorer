package com.hamzashaikh2001.ecoexplorer.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hamzashaikh2001.ecoexplorer.api.model.Zip;

@Service
public class ZipService {
	
	private final Map<String, Zip> zipList;

	public ZipService() {
		this.zipList = new HashMap<>();
		zipList.put("11111", new Zip("Example1"));
		zipList.put("11112", new Zip("Example2"));
	}

	public Optional<Zip> getZip(String zipCode) {
		return Optional.ofNullable(zipList.get(zipCode));
	}
}
