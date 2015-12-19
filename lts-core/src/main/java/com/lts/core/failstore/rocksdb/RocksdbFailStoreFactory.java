package com.lts.core.failstore.rocksdb;

import com.lts.core.failstore.AbstractFailStoreFactory;
import com.lts.core.failstore.FailStore;

import java.io.File;

/**
 * Robert HG (254963746@qq.com) on 5/27/15.
 */
public class RocksdbFailStoreFactory extends AbstractFailStoreFactory{

    @Override
    protected String getName() {
        return RocksdbFailStore.name;
    }

    @Override
    protected FailStore newInstance(File dbPath, boolean needLock) {
        return new RocksdbFailStore(dbPath, needLock);
    }
}
