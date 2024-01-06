package com.hamzashaikh2001.ecoexplorer.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hamzashaikh2001.ecoexplorer.api.model.Zip;
import com.hamzashaikh2001.ecoexplorer.service.ZipService;

@RestController
public class ZipController {

	private final ZipService zipService;
	
	@Autowired
	public ZipController(ZipService zipService) {
		this.zipService = zipService;
	}
	
	@GetMapping("/api/zips/{zipCode}")
	public Zip getZip(@PathVariable String zipCode) {
		Optional<Zip> zip = zipService.getZip(zipCode);
		if(zip.isPresent()) {
			return (Zip) zip.get();
		}
		// Needs to call on other services for their data
		return null;
	}
}
