package service;

import domain.CityBean;

import java.sql.SQLException;
import java.util.List;

public interface CityService {
    List<CityBean> findCityByProId(int pid) throws SQLException;
}
