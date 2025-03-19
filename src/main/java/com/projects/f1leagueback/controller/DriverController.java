package com.projects.f1leagueback.controller;

import com.projects.f1leagueback.model.Driver;
import com.projects.f1leagueback.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
@CrossOrigin
public class DriverController {

    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping
    public Driver createDriver(@RequestBody Driver driver) {
        return driverService.driverCreation(driver);

    }
}
