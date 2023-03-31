package hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            //Create the session factory object from config.xml.
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}

