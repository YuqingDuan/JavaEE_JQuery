package dao;

import domain.CityBean;

import java.sql.SQLException;
import java.util.List;

public interface CityDao {
    List<CityBean> findCityByProId(int pid) throws SQLException;
}
