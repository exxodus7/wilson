/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sslab;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import org.apache.log4j.Logger;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class NewSessionBean {
    
    Logger logger = Logger.getLogger(this.getClass().getName());

    public void businessMethod() {
        logger.info("Logging things!");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
