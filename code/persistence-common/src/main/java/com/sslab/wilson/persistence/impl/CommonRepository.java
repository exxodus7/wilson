package com.sslab.wilson.persistence.impl;

import com.sslab.wilson.object.ICommonObject;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Implements common query functionality for the Mongo database.
 */
public interface CommonRepository extends MongoRepository<ICommonObject, String> {
    
    public List<ICommonObject> findByLabel(String label);
}
