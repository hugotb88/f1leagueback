package com.projects.f1leagueback.service;

import com.projects.f1leagueback.model.Driver;
import com.projects.f1leagueback.repository.DriverRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DriverService {
    Logger logger = LoggerFactory.getLogger(DriverService.class);

    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    // Driver Creation
    public Driver driverCreation (Driver driver) {
        logger.info("Driver Service creation");

        // ID Creation
        UUID driverUUID = UUID.randomUUID();
        logger.info("Driver UUID: " + driverUUID);

        driver.setId(driverUUID);
        return driverRepository.save(driver);
    }

    // Driver Deletion
    public void driverDeletion (Driver driver) {
        logger.info("Deleting Driver");
        driverRepository.deleteById(driver.getId());
    }
}
