package com.quicksilvarad.repository;

import com.quicksilvarad.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WikiDataRepository extends JpaRepository<WikimediaData,Long> {

}
