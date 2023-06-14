package helper;

import org.hibernate.Session;
import util.HibernateUtil;

public class DataBaseHelper {

    private static Session session;

    private DataBaseHelper(){}

    public static Session getInstance() {
        if (session == null) {
            session = HibernateUtil.getSessionFactory().openSession();
        }
        return session;
    }
}