package controller.admin;

import dao.UserDao;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "toUpdateUserInfoServlet",urlPatterns = "/userUpdateServlet")
public class toUpdateUserInfoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //接收参数
        String userid = req.getParameter("userid");
        String password = req.getParameter("password");
        String username = req.getParameter("username");
        //将参数封装
        User user = new User();
        user.setId(Integer.parseInt(userid));
        user.setUserName(username);
        user.setUserPassword(password);

        //传送封装完的数据
        UserDao userDao = new UserDao();
        int row = userDao.updateUserInfoById(user);
        if (row>0){
            //转发
            req.getRequestDispatcher("/resources/admin/default.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }

    }
}
