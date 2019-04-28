package servlet;

import bean.ViewspotEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import path.SearchPath;

import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

@WebServlet(name = "ItemSightServlet",urlPatterns = {"/sightSpot"})
public class ItemSightServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        Integer Id = Integer.parseInt(id);
        PrintWriter out = response.getWriter();
        try(Session session = new SessionContext().openSession()){
            Query<ViewspotEntity> query;
            query = session.createQuery(
                    "FROM ViewspotEntity WHERE id = ?1", ViewspotEntity.class);
            query.setParameter(1, Id);
            System.out.println("this is ok! id="+Id);
            List<ViewspotEntity> ve = query.getResultList();

            if(ve.size()==0||ve==null||ve.isEmpty()){
                System.out.println("bad!");
                out.print("alert('不存在！')");
            }else{
                System.out.println("fine!");
                String intro = ve.get(0).getIntro();
                String photo = ve.get(0).getPhoto();
                System.out.println("intro="+intro);
                System.out.println("photo="+photo);
                SearchPath spath = new SearchPath();
                List<String> context=(List<String>)spath.getFileContext(intro);
                List<String> picture = (List<String>)spath.getallpic(photo);
                for (int i=0;i<picture.size();i++) {
                    picture.set(i, picture.get(i).replaceAll("d:", ""));
                    System.out.println(picture.get(i));
                }
                request.setAttribute("context",context);
                request.setAttribute("picture",picture);
                request.getRequestDispatcher("/searchContent.jsp").forward(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }
    }
}
