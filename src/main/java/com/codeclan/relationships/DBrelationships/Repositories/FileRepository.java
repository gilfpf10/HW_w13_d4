package com.codeclan.relationships.DBrelationships.Repositories;

import com.codeclan.relationships.DBrelationships.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
