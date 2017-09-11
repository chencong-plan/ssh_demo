package cc.ccoder.controler;

import cc.ccoder.model.entity.Account;
import cc.ccoder.model.service.AccountService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.List;


public class AccountAction {
    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public String accountLists(){
        HttpSession session = ServletActionContext.getRequest().getSession();
        List<Account> accountList = accountService.getAccountLists();
        session.setAttribute("accountLists",accountList);
       return "success";
    }
}
