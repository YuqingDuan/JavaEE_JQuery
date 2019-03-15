package service.impl;

import dao.SearchDao;
import dao.impl.SearchDaoImpl;
import domain.KwBean;
import service.SearchService;

import java.sql.SQLException;
import java.util.List;

public class SearchServiceImpl implements SearchService {
    @Override
    public List<KwBean> searchKw(String kw) throws SQLException {
        SearchDao searchDao = new SearchDaoImpl();
        return searchDao.searchKw(kw);
    }
}
