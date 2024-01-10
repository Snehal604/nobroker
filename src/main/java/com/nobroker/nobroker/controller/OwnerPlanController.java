package com.nobroker.nobroker.controller;

import com.nobroker.nobroker.payload.OwnerPlanDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ownerPlan")
public class OwnerPlanController {
    @Autowired
    private OwnerPlanController ownerPlanService;
    @PostMapping
    public ResponseEntity<OwnerPlanDto> createOwnerPlan(OwnerPlanDto ownerPlanDto){
        OwnerPlanDto dto= ownerPlanService.createOwnerPlan(ownerPlanDto).getBody();
        return new ResponseEntity<>(dto, HttpStatus.CREATED);

    }
}
