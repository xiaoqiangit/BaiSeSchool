package com.baise.school.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.baise.school.data.entity.NewsEntity;

import com.baise.school.db.NewsEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig newsEntityDaoConfig;

    private final NewsEntityDao newsEntityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        newsEntityDaoConfig = daoConfigMap.get(NewsEntityDao.class).clone();
        newsEntityDaoConfig.initIdentityScope(type);

        newsEntityDao = new NewsEntityDao(newsEntityDaoConfig, this);

        registerDao(NewsEntity.class, newsEntityDao);
    }
    
    public void clear() {
        newsEntityDaoConfig.clearIdentityScope();
    }

    public NewsEntityDao getNewsEntityDao() {
        return newsEntityDao;
    }

}
