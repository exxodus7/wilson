package com.sslab.common;

import org.springframework.data.anotation.Id;

/**
 * Provides common functionlity for all wilson objects.
 */
public class CommonObject {
    @Id
    private String id;
    
    public CommonObject() {}
}
