package servlet;

import com.thoughtworks.xstream.XStream;
import domain.CityBean;
import service.CityService;
import service.impl.CityServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class CityServlet extends HttpServlet {
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
            // 3.返回数据(xml)。
            // XStream转化: XxxBean 对象成 xml
            XStream xStream = new XStream();

            // 设置别名
            xStream.alias("city", CityBean.class);

            // 想把id做成属性
            // xStream.useAttributeFor(CityBean.class, "id");

            // 转化一个xml字符串成对象
            // xStream.fromXML("...");

            // 转化一个对象成xml字符串
            String xml = xStream.toXML(cityBeanList);
            System.out.println(xml);

            // 返回数据text/xml
            response.setContentType("text/xml;charset=utf-8");
            response.getWriter().write(xml);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
