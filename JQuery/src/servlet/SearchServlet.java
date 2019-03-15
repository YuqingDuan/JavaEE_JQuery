package servlet;

import dao.SearchDao;
import dao.impl.SearchDaoImpl;
import domain.KwBean;
import service.SearchService;
import service.impl.SearchServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String kw = request.getParameter("kw");
        System.out.println("kw=" + kw);

        SearchService searchService = new SearchServiceImpl();
        try {
            List<KwBean> kwBeans = searchService.searchKw(kw);

            for (KwBean kwBean : kwBeans) {
                System.out.println("kwBean:" + kwBean);
            }

            request.setAttribute("list", kwBeans);
            // response.getWriter().write("...");
            request.getRequestDispatcher("list.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
