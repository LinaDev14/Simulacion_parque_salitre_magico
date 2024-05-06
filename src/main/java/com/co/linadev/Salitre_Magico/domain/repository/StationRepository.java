package com.co.linadev.Salitre_Magico.domain.repository;

import com.co.linadev.Salitre_Magico.domain.collections.Station;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StationRepository extends MongoRepository<Station, String> {

}
