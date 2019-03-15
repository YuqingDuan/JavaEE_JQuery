package dao;

import domain.KwBean;

import java.sql.SQLException;
import java.util.List;

public interface SearchDao {

    /**
     * 用于检测用户名是否存在
     *
     * @param kw
     * @return List<KwBean>
     * a
     * abc
     * admin
     * aaa
     */
    List<KwBean> searchKw(String kw) throws SQLException;
}
