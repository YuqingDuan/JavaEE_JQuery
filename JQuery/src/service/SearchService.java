package service;

import domain.KwBean;

import java.sql.SQLException;
import java.util.List;

public interface SearchService {
    List<KwBean> searchKw(String kw) throws SQLException;
}
