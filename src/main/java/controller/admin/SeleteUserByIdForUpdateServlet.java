package controller.admin;

import dao.UserDao;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="SeleteUserByIdForUpdateServlet",urlPatterns = "/seleteUserByIdForUpdate")
public class SeleteUserByIdForUpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("userid");
        UserDao userDao = new UserDao();
        User user = userDao.selectUserInfoById(id);
        req.setAttribute("u",user);
        req.getRequestDispatcher("/resources/admin/userupdate.jsp").forward(req,resp);


    }
}
