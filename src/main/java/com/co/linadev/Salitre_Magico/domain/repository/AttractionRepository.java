package com.co.linadev.Salitre_Magico.domain.repository;

import com.co.linadev.Salitre_Magico.domain.collections.Attraction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AttractionRepository extends MongoRepository<Attraction, String> {
}
