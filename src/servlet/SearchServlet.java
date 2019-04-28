package servlet;

import bean.ViewspotEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import path.SearchPath;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

@WebServlet(name = "SearchServlet",urlPatterns ={"/SearchInput"})
public class SearchServlet extends HttpServlet {
    private EntityManager em;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType("text/html;charset=UTF-8");
        String searchInput = request.getParameter("search");
        PrintWriter out = response.getWriter();
        try (Session session = new SessionContext().openSession()) {
            Query<ViewspotEntity> query;
            if (searchInput!=null&&!searchInput.isEmpty()) {
                query = session.createQuery(
                        "FROM ViewspotEntity WHERE city = ?1", ViewspotEntity.class);
                query.setParameter(1, searchInput);
                List<ViewspotEntity> viewspot = query.getResultList();
                if (viewspot.size()==0||viewspot==null||viewspot.isEmpty()){
                    System.out.println("ok1!");
                    out.print("alert("+searchInput+" 不存在！"+")");
                    response.sendRedirect("/index.jsp");
                }else{
                    System.out.println("ok2!");
                    SearchPath sp = new SearchPath();
                    List<String> phopath= sp.getfristpic(viewspot);
                    for (int i=0;i<phopath.size();i++){
                        phopath.set(i,phopath.get(i).replaceAll("d:",""));
                        System.out.println(phopath.get(i));
                    }
                    System.out.println("ok1!");
                    request.setAttribute("intrPath",viewspot);
                    System.out.println("ok2!");
                    request.setAttribute("phoPath",phopath);
                    System.out.println("ok3!");
                    request.getRequestDispatcher("/contentInfo.jsp").forward(request,response);
                }
            } else {
                out.print("alert('请重新输入！')");
                response.sendRedirect("/index.jsp");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
