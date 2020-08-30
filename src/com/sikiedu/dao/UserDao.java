package com.sikiedu.dao;

import com.mchange.v2.c3p0.jboss.C3P0PooledDataSource;
import com.sikiedu.domain.User;
import com.yl.lain.utils.C3p0DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao {

    public User findUser(User user) throws SQLException {
        QueryRunner runner=new QueryRunner(C3p0DataSourceUtils.getDataSource());
        String sql="select * from user where username = ? and password = ?";
        return  runner.query(sql,new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());





    }









}
