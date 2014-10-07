package com.sslab.wilson.persistence.impl;

import com.sslab.wilson.object.ICommonObject;
import com.sslab.wilson.object.impl.CommonConfiguration;
import com.sslab.wilson.persistence.IQueryLocal;
import com.sslab.wilson.persistence.IQueryRemote;
import javax.ejb.Stateful;

/**
 * Implements common query functionality for the Mongo database.
 */
@Stateful
public class MongoQueryBean extends CommonConfiguration implements IQueryLocal, IQueryRemote {

    @Override
    public void find(ICommonObject object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
