package com.examly.springapp.repository;

import com.examly.springapp.model.Inspection;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface InspectionRepository extends JpaRepository<Inspection, UUID> {
    List<Inspection> findByApplicationId(UUID applicationId);
}
