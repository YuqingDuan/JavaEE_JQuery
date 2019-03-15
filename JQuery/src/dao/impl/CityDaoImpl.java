package dao.impl;

import dao.CityDao;
import domain.CityBean;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.JDBCUtil;

import java.sql.SQLException;
import java.util.List;

public class CityDaoImpl implements CityDao {
    @Override
    public List<CityBean> findCityByProId(int pid) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
        String sql = "select * from t_city where pid = ?";
        return runner.query(sql, new BeanListHandler<>(CityBean.class), pid);
    }
}
