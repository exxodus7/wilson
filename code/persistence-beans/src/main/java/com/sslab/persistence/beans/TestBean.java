package com.sslab.persistence.beans;

import javax.ejb.Stateless;

/**
 *
 * @author lauren
 */
@Stateless
public class TestBean implements TestBeanRemote {
    
    @Override
    public void logTestMessage() {
        // Print stuff
    }
}
