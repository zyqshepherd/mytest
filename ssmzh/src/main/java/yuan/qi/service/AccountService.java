package yuan.qi.service;

import yuan.qi.domain.Account;

import java.util.List;

public interface AccountService {
    //    查询所有账户
    public List<Account> findAll();
    //   保存账户信息
    public void savaAccount(Account account);
}
