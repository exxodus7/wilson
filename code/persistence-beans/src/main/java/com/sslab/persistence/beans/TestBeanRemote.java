/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sslab.persistence.beans;

import javax.ejb.Remote;

/**
 *
 * @author lauren
 */
@Remote
public interface TestBeanRemote {
    
    void logTestMessage();
}
