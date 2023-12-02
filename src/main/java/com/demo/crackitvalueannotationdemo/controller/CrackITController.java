package com.demo.crackitvalueannotationdemo.controller;


import com.demo.crackitvalueannotationdemo.entity.CrackIT;
import com.demo.crackitvalueannotationdemo.service.CrackITService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/audit/demo")
public class CrackITController {

    @Autowired
    private CrackITService crackITService;

    @GetMapping(value = "/crackIT/{id}")
    public ResponseEntity<CrackIT> findCrackITById(@PathVariable Integer id) {
        return ResponseEntity.ok(crackITService.findById(id));
    }

    @PostMapping("/crackIT")
    public ResponseEntity<String> saveCrackIT( @RequestBody @Valid CrackIT crackIT) {
        crackITService.saveCrackIT(crackIT);
        return ResponseEntity.ok("Saved Successfully");
    }

    @PutMapping("/crackIT/{id}")
    public ResponseEntity<String> updateCrackIT( @RequestBody @Valid CrackIT crackIT) {
        crackITService.saveCrackIT(crackIT);
        return ResponseEntity.ok("Updated Successfully");
    }



}
