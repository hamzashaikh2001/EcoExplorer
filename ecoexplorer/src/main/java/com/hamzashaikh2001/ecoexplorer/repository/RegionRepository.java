package com.hamzashaikh2001.ecoexplorer.repository;

import org.springframework.data.repository.CrudRepository;

import com.hamzashaikh2001.ecoexplorer.api.model.RegionData;

public interface RegionRepository extends CrudRepository<RegionData, String> {}
