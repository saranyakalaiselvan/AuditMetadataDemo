package com.demo.crackitvalueannotationdemo.service;

import com.demo.crackitvalueannotationdemo.entity.CrackIT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrackITRepository extends JpaRepository<CrackIT, Integer> {
}
