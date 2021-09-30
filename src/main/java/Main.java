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


        /**
         * Связи OneToOne это машина и водитель
         * Связь ManyToOne машина посажиры
         * Свзь OneToMany машыны и дорога
         * Связь ManyTo Many это машины и автосервисы
         *
         * @OneToManyToOneToManyToMany
         *  это анотации свзявающие таблицы и указывающие ид связи
         *
         *  Что такое Jpa - это технология обеспечивающая работа при обмене данными
         *  а имено обеспечивает удобную раоту с обьектами как данными
         *  что позволяет не писать много кода для переноса данных допустим  в БД
         *  а просто создать класс и внести его как тоблицу в БД
         *
         *  Что такое ORM и Hibernate
         *  Хибернейт это ОРМ система для джавы что позволяет вносить классы и обьекты в как и в таблицы в базы данных
         *
         */

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
