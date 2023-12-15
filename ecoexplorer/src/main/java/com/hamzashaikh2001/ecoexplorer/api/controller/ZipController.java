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

	private ZipService zipService;
	
	@Autowired
	public ZipController(ZipService zipService) {
		this.zipService = zipService;
	}
	
	@GetMapping("/api/zip/{zipCode}")
	public Zip getZip(@PathVariable String zipCode) {
		Optional<Zip> zip = zipService.getZip(zipCode);
		if(zip.isPresent()) {
			return (Zip) zip.get();
		}
		return null;
	}
}
