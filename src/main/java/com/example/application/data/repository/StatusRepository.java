package com.example.application.data.repository;

import com.example.application.data.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Admin, Long> {

}
