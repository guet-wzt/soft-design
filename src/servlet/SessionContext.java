package servlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionContext {
    public  SessionFactory factory = new Configuration().configure().buildSessionFactory();
    public  Session openSession() {
        return factory.openSession();
    }
}
