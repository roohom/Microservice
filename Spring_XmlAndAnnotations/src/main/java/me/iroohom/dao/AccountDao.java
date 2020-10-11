package me.iroohom.dao;


public interface AccountDao {


    public void out(String username,Double money);

    public void in(String username,Double money);

}
