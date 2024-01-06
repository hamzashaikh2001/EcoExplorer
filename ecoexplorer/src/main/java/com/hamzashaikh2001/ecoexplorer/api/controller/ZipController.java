package com.hamzashaikh2001.ecoexplorer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hamzashaikh2001.ecoexplorer.api.model.ZipData;
import com.hamzashaikh2001.ecoexplorer.service.ZipService;

@RestController
public class ZipController {

	private final ZipService zipService;
	
	@Autowired
	public ZipController(ZipService zipService) {
		this.zipService = zipService;
	}
	
	@GetMapping("/api/zips/{zipCode}")
	public ZipData getZip(@PathVariable String zipCode) {
		return this.zipService.getZipData(zipCode);
	}
}
