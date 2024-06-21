package com.propertyfilterer.propertyfilterer.repository;

import com.propertyfilterer.propertyfilterer.model.PropInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropInfoRepository extends JpaRepository<PropInfo, Long> {
}
