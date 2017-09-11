package cc.ccoder.model.service.impl;

import cc.ccoder.model.dao.AccountDao;
import cc.ccoder.model.entity.Account;
import cc.ccoder.model.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> getAccountLists() {
        return accountDao.getAccountLists();
    }
}
