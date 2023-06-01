package util;

import org.hibernate.Session;

public class HibernateUtilFactory {

    private static Session session;

    public static Session getInstance() {
        if (session == null) {
            session = HibernateUtil.getSessionFactory().openSession();
        }
        return session;
    }
}
