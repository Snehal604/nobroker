package com.nobroker.nobroker.controller;

import com.nobroker.nobroker.payload.OwnerPlanDto;
import com.nobroker.nobroker.service.OwnerPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ownerPlan")
public class OwnerPlanController {
   @Autowired
    private OwnerPlanService ownerPlanService;

//    @Autowired
//    public OwnerPlanController(OwnerPlanService ownerPlanService) {
//        this.ownerPlanService = ownerPlanService;
//    }
    @PostMapping
    public ResponseEntity<OwnerPlanDto> createOwnerPlan(@RequestBody OwnerPlanDto ownerPlanDto){
        OwnerPlanDto dto= ownerPlanService.createOwnerPlans(ownerPlanDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);

    }
    @GetMapping
    public List<OwnerPlanDto> getAllOwnerPlans(){

        return ownerPlanService.getAllOwnerPlans();
    }
}
