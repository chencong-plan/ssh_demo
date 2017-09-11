package cc.ccoder.model.dao.impl;

import cc.ccoder.model.dao.AccountDao;
import cc.ccoder.model.entity.Account;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class AccountDaoImpl implements AccountDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public List<Account> getAccountLists() {
        Query query = this.getSession().createQuery("from Account ");
        List<Account> accounts = query.list();
        return accounts;
    }
}
