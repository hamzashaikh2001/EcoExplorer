package com.hamzashaikh2001.ecoexplorer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.hamzashaikh2001.ecoexplorer.api.controller.RegionController;
import com.hamzashaikh2001.ecoexplorer.api.controller.WaterController;
import com.hamzashaikh2001.ecoexplorer.api.controller.ZipController;

@SpringBootTest
class EcoexplorerApplicationTests {

	@Autowired
    private ApplicationContext applicationContext;
	private RegionController regionController;
	private WaterController waterController;
	private ZipController zipController;
	
	@Test
	void contextLoads() {
	}

	@BeforeEach
	void controllerSetUp() {
		regionController = applicationContext.getBean(RegionController.class);
		waterController = applicationContext.getBean(WaterController.class);
		zipController = applicationContext.getBean(ZipController.class);
	}
	
	@Test
	void testRegionDataOne() {
		Assertions.assertNotNull(regionController.getRegionData("77099"));
	}
	
	@Test
	void testRegionDataTwo() {
		Assertions.assertNotNull(regionController.getRegionData("93011"));
	}
	
	@Test
	void testRegionDataThree() {
		Assertions.assertNotNull(regionController.getRegionData("23001"));
	}
	
	@Test
	void testWaterDataOne() {
		Assertions.assertNotNull(waterController.getWaterDataByZipCode("77099"));
	}

	@Test
	void testWaterDataTwo() {
		Assertions.assertNotNull(waterController.getWaterDataByZipCode("93011"));
	}

	@Test
	void testWaterDataThree() {
		Assertions.assertNotNull(waterController.getWaterDataByZipCode("23001"));
	}
	
	@Test
	void testZipDataOne() {
		Assertions.assertNotNull(zipController.getZip("77099"));
	}
	
	@Test
	void testZipDataTwo() {
		Assertions.assertNotNull(zipController.getZip("93011"));
	}
	
	@Test
	void testZipDataThree() {
		Assertions.assertNotNull(zipController.getZip("23001"));
	}
}
