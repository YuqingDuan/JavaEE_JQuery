package dao.impl;

import dao.SearchDao;
import domain.KwBean;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.JDBCUtil;

import java.sql.SQLException;
import java.util.List;

public class SearchDaoImpl implements SearchDao {
    @Override
    public List<KwBean> searchKw(String kw) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
        String sql = "select * from search where kw like ? limit ?";
        return runner.query(sql, new BeanListHandler<>(KwBean.class), kw + "%", 5);
    }
}
