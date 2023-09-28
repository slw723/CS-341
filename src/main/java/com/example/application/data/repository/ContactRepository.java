package com.example.application.data.repository;

import com.example.application.data.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ServiceProvider, Long> {

}
