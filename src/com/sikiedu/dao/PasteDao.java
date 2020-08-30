package com.sikiedu.dao;

import com.sikiedu.domain.Paste;
import com.sikiedu.domain.User;
import com.yl.lain.utils.C3p0DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class PasteDao {
    public List<Paste> findAllPaste() throws SQLException {
        QueryRunner runner=new QueryRunner(C3p0DataSourceUtils.getDataSource());
        String sql="select * from paste";
         return runner.query(sql, new BeanListHandler<Paste>(Paste.class));

    }
}
