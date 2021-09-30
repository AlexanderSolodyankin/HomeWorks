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

        Courses courses1 = new Courses();
        Group group1 = new Group();
        Group group2 = new Group();
        Mentor mentor1 = new Mentor();
        Mentor mentor2 = new Mentor();
        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();

        studentList1.add(Student.builder().build());

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
