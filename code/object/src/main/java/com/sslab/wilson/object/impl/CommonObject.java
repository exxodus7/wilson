package com.sslab.wilson.object.impl;

import com.sslab.wilson.object.ICommonObject;
import org.springframework.data.annotation.Id;

/**
 * Provides common functionality for all Wilson objects.
 */
// TODO: Verify parent class.
public class CommonObject implements ICommonObject {

    // Attribute keys
    @Id
    private String id;
    
    private String label;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String newId) {
        id = newId;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public void setLabel(String newLabel) {
        label = newLabel;
    }
}
