package com.demo.crackitvalueannotationdemo.service;

import com.demo.crackitvalueannotationdemo.entity.CrackIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrackITService {

    @Autowired
    private CrackITRepository crackITRepository;
    public CrackIT saveCrackIT(CrackIT crackIT) {
        return crackITRepository.save(crackIT);
    }

    public CrackIT findById(Integer id) {
        return crackITRepository.findById(id).orElse(null);
    }
}
