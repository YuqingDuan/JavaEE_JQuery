package service.impl;

import dao.CityDao;
import dao.impl.CityDaoImpl;
import domain.CityBean;
import service.CityService;

import java.sql.SQLException;
import java.util.List;

public class CityServiceImpl implements CityService {
    @Override
    public List<CityBean> findCityByProId(int pid) throws SQLException {
        CityDao cityDao = new CityDaoImpl();
        return cityDao.findCityByProId(pid);
    }
}
