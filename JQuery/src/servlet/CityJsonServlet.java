package servlet;

import com.thoughtworks.xstream.XStream;
import domain.CityBean;
import net.sf.json.JSONArray;
import service.CityService;
import service.impl.CityServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class CityJsonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取参数
        int pid = Integer.parseInt(request.getParameter("pid"));
        try {
            // 2.找出所有的城市
            CityService cityService = new CityServiceImpl();
            List<CityBean> cityBeanList = cityService.findCityByProId(pid);

            /*
             * 客户端和服务器端数据交互的两种模式Json和xml
             * */
            // 3.返回数据(json)。
            // 把list ---> json数据
            // JSONArray ---> 变成数组 ， 集合  []
            // JSONObject ---> 变成简单的数据  { name : zhangsan , age:18}

            JSONArray jsonArray = JSONArray.fromObject(cityBeanList);
            String json = jsonArray.toString();
            System.out.println("json = " + json);

            // 返回数据text/html
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(json);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
