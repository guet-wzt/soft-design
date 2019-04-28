package path;

import bean.ViewspotEntity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SearchPath {

    public List<String> getFileContext(String path) throws Exception {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> list = new ArrayList<String>();
        String str = null;
        while ((str = bufferedReader.readLine()) != null) {
            if (str.length() > 0) {
                list.add(str);
            }
        }
        return list;
    }
    public List<String> getfristpic(List<ViewspotEntity> viewspotEntity) {
        List<String> pic = new ArrayList<String>();
        String nopic = new String();

        nopic = "/resources/imagespic.png";
        for (int i = 0; i < viewspotEntity.size(); i++) {
            String txt = viewspotEntity.get(i).getPhoto();
            try {
                System.out.println(txt);
                String phto = new SearchPath().getFileContext(txt).get(0);
                System.out.println(phto);
                if (phto != null) {
                    pic.add(phto);
                }
            } catch (Exception e) {
                pic.add(nopic);
                System.out.println("没有图片");
                continue;
            } finally {
            }
        }
        return pic;
    }
    public List<String> getallpic(String path) {
            List<String> pic = new ArrayList<String>();
            String nopic = new String();
            nopic = "/resources/imagespic.png";
            try {
                pic = new SearchPath().getFileContext(path);
            } catch (Exception e) {
                System.out.println("没有图片！");
                pic.add(nopic);
            } finally {
            }
            return pic;
    }
}
