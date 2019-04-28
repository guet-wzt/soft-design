package servlet;

import bean.UserEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import javax.transaction.UserTransaction;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "LoginJudgeServlet",urlPatterns = {"/LoginJudge"})
public class LoginJudgeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setHeader("content-type", "text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("name="+username);
        System.out.println("password="+password);
        PrintWriter out = response.getWriter();
            if (username==null||password==null){
                JOptionPane.showMessageDialog(null, "请重新登录", "信息错误",JOptionPane.PLAIN_MESSAGE);
                RequestDispatcher rd1 = request.getRequestDispatcher("login_again");
                rd1.forward(request,response);
            }else {
                try (Session session = new SessionContext().openSession()) {
                    Query<UserEntity> query;
                    query=session.createQuery("FROM UserEntity where name=?1 and password=?2", UserEntity.class);
                    query.setParameter(1, username);
                    query.setParameter(2, password);
                    List<UserEntity> user = query.getResultList();
                    if (user.size()==0||user.isEmpty()) {
                        System.out.println("ok1");
                        JOptionPane.showMessageDialog(null, "请重新登录", "信息错误",JOptionPane.PLAIN_MESSAGE);
                        response.sendRedirect("/index.jsp");
                    }else{
                        System.out.println("ok2");
                        UserEntity ux = user.get(0);
                        String name = ux.getName();
                        String pas = ux.getPassword();
                        if (name != null && pas != null && username.equals(name) && password.equals(pas)) {
                            System.out.println("ok3");
                            JOptionPane.showMessageDialog(null, "welcome "+name, "登陆成功 ", JOptionPane.PLAIN_MESSAGE);
                            response.sendRedirect("/index.jsp");
                        } else {
                            System.out.println("ok4");
                            JOptionPane.showMessageDialog(null, "请重新登录", "信息错误",JOptionPane.PLAIN_MESSAGE);
                            response.sendRedirect("/login.jsp");
                        }
                    }
                } catch (Exception e) {
                    out.println(e.toString());
                } finally {
            }

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
