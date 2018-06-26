package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Gold;

@Repository
public interface GoldRepository extends JpaRepository<Gold, Integer> {

}
