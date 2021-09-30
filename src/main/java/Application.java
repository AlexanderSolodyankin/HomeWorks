import entity.Country;
import entity.Department;
import entity.Employee;
import entity.EmployeeAddress;
import org.hibernate.Session;
import util.HibernateUtil;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Country country = Country.builder().name("KG").build();
        Country country2 = Country.builder().name("RU").build();
        saveEntity(country);
        saveEntity(country2);
        //Создаём отделы, необходимые для создания сотрдунков
        Department javaBackendDepartment = Department.builder().name("Java").build();
        Department frontendDepartment = Department.builder().name("Frontend").build();
        Department mobileDepartment = Department.builder().name("Mobile").build();
        saveEntity(javaBackendDepartment);
        saveEntity(frontendDepartment);
        saveEntity(mobileDepartment);

        //Создаём адреса, необходимые для создания сотрдунков
        EmployeeAddress employeeAddress = EmployeeAddress.builder().district("6 мкр").houseNumber(8).flatNumber(20).build();
        EmployeeAddress employeeAddress1 = EmployeeAddress.builder().district("8 мкр").houseNumber(2).flatNumber(14).build();
        EmployeeAddress employeeAddress2 = EmployeeAddress.builder().district("Кок-Жар").houseNumber(17).build();
        EmployeeAddress employeeAddress3 = EmployeeAddress.builder().district("Чон-Арык").houseNumber(25).build();
        saveEntity(employeeAddress);
        saveEntity(employeeAddress1);
        saveEntity(employeeAddress2);
        saveEntity(employeeAddress3);

        //указываем имя, возраст, Адрес и Отдел
        Employee employee = Employee.builder()
                .fullName("Петрович Петр")
                .age(50)
                .employeeAddress(employeeAddress)
                .department(javaBackendDepartment)
                .country(country)
                .salary(200)
                .build();
        Employee employee1 = Employee.builder()
                .fullName("Македонский Александр")
                .age(22)
                .employeeAddress(employeeAddress1)
                .department(javaBackendDepartment)
                .country(country2)
                .salary(500)
                .build();
        Employee employee2 = Employee.builder()
                .fullName("Аширов Адилет")
                .age(15)
                .employeeAddress(employeeAddress2)
                .department(mobileDepartment)
                .country(country)
                .salary(400)
                .build();
        Employee employee3 = Employee.builder()
                .fullName("Македонский Александр")
                .age(50)
                .employeeAddress(employeeAddress3)
                .department(javaBackendDepartment)
                .country(country)
                .salary(200)
                .build();
        saveEntity(employee);
        saveEntity(employee1);
        saveEntity(employee2);
        saveEntity(employee3);

        System.out.println(getEmployees());

        System.out.println("**************");
        Department javaDepartmentFromDB = getDepartmentById(1L); //получили Java Department из базы
        System.out.println(javaBackendDepartment);
        System.out.println(javaDepartmentFromDB.getEmployees()); //вывели сотрудников отдела
        System.out.println(getEmployees());

        System.out.println("**********");
//        List<Employee> employeeList = getAllBySearchStringAndAge(10, "ле");
//        List<Employee> employeeList = getAllEmployeesByCountryNameAndDepartmentName("KG", "Java");
//        System.out.println(employeeList);
//        List<Department> departments = getAllDepartmentsWhereEmployeeInKg();
//        System.out.println(departments);
        System.out.println(getTopThreeSalaryEmployees());
    }

    public static List<Employee> getTopThreeSalaryEmployees() {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        List<Employee> employees = hibernateSession.createQuery("from Employee e order by e.salary desc", Employee.class).setMaxResults(3).list();
        hibernateSession.close();
        return employees;
    }

    public static List<Department> getAllDepartmentsWhereEmployeeInKg() {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        List<Department> departments = hibernateSession.createQuery("select distinct e.department from Employee e where e.country.name = 'KG'", Department.class).list();
        hibernateSession.close();
        return departments;
    }

    public static List<Employee> getAllEmployeesByCountryNameAndDepartmentName(String countryName, String departmentName) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        List<Employee> employees = hibernateSession.createQuery("from Employee e where e.country.name = :countryName and e.department.name = :departmentName", Employee.class)
                .setParameter("countryName", countryName).setParameter("departmentName", departmentName).list();
        hibernateSession.close();
        return employees;
    }

    public static List<Employee> getAllBySearchStringAndAge(Integer age, String searchString) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        List<Employee> employees = hibernateSession.createQuery("FROM Employee where age > :age and upper(fullName) like upper(:searchString)", Employee.class)
                .setParameter("age", age)
                .setParameter("searchString", "%" + searchString + "%").list();
        hibernateSession.close();
        return employees;
    }

    public static List<Employee> getEmployeesByName(String searchFullName) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();

        List<Employee> employees = hibernateSession.createQuery("FROM Employee where fullName = :fullNameParameter", Employee.class)
                .setParameter("fullNameParameter", searchFullName).list();
        hibernateSession.close();
        return employees;
    }

    public static List<Employee> getAllByName(String fullName) {
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        List<Employee> employees = session.createQuery("FROM Employee where fullName = :param", Employee.class).setParameter("param", fullName).list();
        session.close();
        return employees;
    }

    public static <T> T saveEntity(T entity) {
        entity.getClass();
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.saveOrUpdate(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        return entity;
    }

    public static List<Employee> getEmployees() {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        List<Employee> employees = hibernateSession.createQuery("FROM Employee", Employee.class).list();
        hibernateSession.close();
        return employees;
    }

    public static Department getDepartmentById(Long id) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Department departmentFromDB = hibernateSession.get(Department.class, id);
        hibernateSession.close();
        return departmentFromDB;
    }

    public static Employee updateEmployee(Employee employee) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        Employee employeeFromDB = hibernateSession.load(Employee.class, employee.getId()); //
        employeeFromDB.setFullName(employee.getFullName());
        employeeFromDB.setAge(employee.getAge());
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        return employeeFromDB;
    }

    public static Employee getEmployeeById(Long id) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Employee employeeFromDB = hibernateSession.get(Employee.class, id);
        hibernateSession.close();
        return employeeFromDB;
    }

    public static Employee deleteEmployeeById(Long id) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        Employee employeeFromDB = getEmployeeById(id);
        hibernateSession.delete(employeeFromDB);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        return employeeFromDB;
    }

    public static void deleteAllEmployees() {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.createQuery("DELETE FROM Employee").executeUpdate();
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
    }

}
