package helper;

import org.hibernate.Session;
import util.HibernateUtil;

public class DataBaseHelper {

    private static Session session;

    public static Session getInstance() {
        if (session == null) {
            session = HibernateUtil.getSessionFactory().openSession();
        }
        return session;
    }
}
