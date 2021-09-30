import entity.Courses;
import entity.Group;
import entity.Mentor;
import entity.Student;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      Group group = new Group();
      saveEntity(group);

    }

    public static <T> T saveEntity(T entity){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();

        System.out.println("Успешное сохронение " + entity.toString());
        return entity;
    }
}
