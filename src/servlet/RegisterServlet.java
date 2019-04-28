package servlet;

import bean.UserEntity;
import org.hibernate.Session;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "RegisterServlet",urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
    @PersistenceContext
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        try(Session session = new SessionContext().openSession()) {
            if(password==null||repassword==null||!password.equals(repassword)){
                RequestDispatcher rd = request.getRequestDispatcher("RegisterFial");
                rd.forward(request,response);
            }else{
                UserEntity userEntity = new UserEntity(name,password);
                session.createSQLQuery("insert into user values ('"+name+"','"+password+"')").addEntity(UserEntity.class);
                session.getTransaction().commit();
                response.sendRedirect("/index.jsp");
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }finally {
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
