package yuan.qi.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import yuan.qi.domain.Account;

import java.util.List;

@Repository
public interface AccountDao {
//    查询所有账户
    @Select("select * from account")
    public List<Account> findAll();

//   保存账户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void savaAccount(Account account);
}
