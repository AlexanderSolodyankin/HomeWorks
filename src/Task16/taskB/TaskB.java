package Task16.taskB;

import java.util.Random;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        String bagControl;// создал кастыль так как почему то ввод проскакивает и не могу понять почему так происходит
        // создание класса курс
        Courses cours = new Courses();
        System.out.print("Введите название курса: ");
        cours.setNameCours(sc.nextLine());
        // Запись даты создания курса
        System.out.println("Введите год создания курса");
        int year = sc.nextInt();
        System.out.println("Ведите месяц создания курса");
        int mounth = sc.nextInt();
        System.out.println("Введите день создания курса");
        int day = sc.nextInt();
        // Проверка на высокосный год для правельного определения ввода даты
        boolean leapYear = getLeapYears(year);
        // Запись даты в стринговое значение для дальнейшего вывода
        String date = getDate(leapYear, year, day, mounth);
        // Ввод даты в класс
        cours.setDateCreat(date);
        // создание номера курса
        cours.setIdCourse(ran.nextInt(99999 - 10000 + 1) + 10000);

        // Ввод имени и фамилию Декана!!
        System.out.println("Введите имя Декана: ");
        String nameDecan;
        bagControl = sc.nextLine(); // кастыль как фича от бага
        nameDecan = sc.nextLine();
        cours.setNameDecan(nameDecan);
// Почему то пропускает строчку ввода имени не могу понять почему
        System.out.println();
        System.out.println("Введите фамилию Декана: ");
        String sername = sc.nextLine();
        cours.setSerNameDecan(sername);
        System.out.println();
        System.out.print("Введите отчество Декана: ");
        String patron = sc.nextLine();
        cours.setPatronDecan(patron);
        // Создание студентов
        System.out.print("Задайте количество студентов: ");
        // Ввод количества студентов
        int numStudents = sc.nextInt();
        // создание массива студентов
        Students[] oboltus = new Students[numStudents];
        // вод информации о студентах
        for (int i = 0; i < oboltus.length; i++) {
            oboltus[i] = new Students();
            System.out.println("Введите имя студента " + (i + 1) + "-го");
            String student = sc.nextLine();
            bagControl = sc.nextLine(); // не могу понять почему перескакивает на сканере по этому ввел таким образом
            oboltus[i].setName(student);
            System.out.println("Введите фамилию студента " + (i + 1) + "-го");
            oboltus[i].setSerName(sc.nextLine());
            System.out.println("Введите отчество студента " + (i + 1) + "-го");
            oboltus[i].setPatron(sc.nextLine());
            // выбор пола студента
            while (true) {
                System.out.println("Выберите пол студента: \n Ведите цифру один ( 1 ) если хотите выбрать мужской пол \n" +
                        "Ведите цифру два ( 2 ) если хотите выбрать женский пол \n");
                int gender = sc.nextInt();
                if (gender == 1) {
                    oboltus[i].setGender(true);
                    break;
                }
                if (gender == 2) {
                    oboltus[i].setGender(false);
                    break;
                } else {
                    System.out.println("Вы не выбрали пол студента!!");
                }
            }
            // вод возроста студента
            System.out.print("Введите год рождение студента: ");
            year = sc.nextInt();
            System.out.print("введите месяц рождения студента: ");
            mounth = sc.nextInt();
            System.out.print("Введите день рождения: ");
            day = sc.nextInt();
            // проверка на высокосный год
            leapYear = getLeapYears(year);
            // перенос значение возроста в строчное значение
            oboltus[i].setDateBerth(getDate(leapYear, year, day, mounth));
        }
        // создание класса группы
        Groups group = new Groups();
        group.setUnling(oboltus);

        System.out.print("Введите название курса: ");
        bagControl = sc.nextLine(); // кастыль (Причина пропускает строчку)!!!!!
        group.setCourses(sc.nextLine());
        System.out.println();

        System.out.println("Введите дату начала обучения");
        System.out.println("Введиет год обучения");
        year = sc.nextInt();
        System.out.println("Введите месяц начала обучения");
        mounth = sc.nextInt();
        System.out.println("Введите день ночала обучения");
        day = sc.nextInt();
        leapYear = getLeapYears(year);
        group.setDateStart(getDate(leapYear, year, day, mounth));

        System.out.println("Введите количество лет обучения");
        int age = sc.nextInt();
        if (age <= 0) {
            System.err.println("Время обучение измеряется в годах введите значение больше нуля");
            age = sc.nextInt();
        } else {
            age = age * 12;
        }
        group.setLearns(age);

        System.out.println("Вывод курса");
        System.out.println("Название курса: " + cours.getNameCours());
        System.out.println("Дата создание курса: " + cours.getDateCreat());
        System.out.println("Номер курса: " + cours.getIdCourse());
        System.out.println("Имя Декана: " + cours.getNameDecan());
        System.out.println("Фамилия Декана: " + cours.getSerNameDecan());
        System.out.println("Отчество Декана: " + cours.getPatronDecan());
        System.out.println();
        System.out.println("Вывод группы");
        System.out.println("Количество студентов в группе: " + group.getUnling().length);
        System.out.println("Наименование группы: " + group.getCourses());
        System.out.println("Дата начала обучения: " + group.getDateStart());
        System.out.println("Срок обучения: " + group.getLearns());
        System.out.println();
        System.out.println("Список студентов");
        System.out.println();
        for (int i = 0; i < group.getUnling().length; i++) {
            System.out.println("Вывод студента номер: " + (i + 1));
            System.out.println("Имя студента: " + (i + 1) + " " + oboltus[i].getName());
            System.out.println("Фамилия студента: " + (i + 1) + " " + oboltus[i].getSerName());
            System.out.println("Отчество студента: " + (i + 1) + " " + oboltus[i].getPatron());
            System.out.println("Пол студента: " + (i + 1) + " " + oboltus[i].getGender());
            System.out.println("Дата рождения студента: " + (i + 1) + " " + oboltus[i].getDateBerth());
            System.out.println();
        }



    }

    static boolean getLeapYears(int num) { // вычесление высокосного года
        if (num <= 0) {
            System.err.println("ВВЕДЕННО НЕГАТИВНОЕ ЗНАЧЕНИЕ !!!! ОШИБКА");
        }
        if (num % 4 != 0) {
//            System.out.println("Год обычный");
            return false;
        } else {
            if (num % 100 != 0) {
//                System.out.println("Год высокосный");
                return true;
            } else {
                if (num % 400 == 0) {
//                    System.out.println("Высокосный год");
                    return true;
                } else {
//                    System.out.println("Год обынчый");
                    return false;
                }
            }
        }
    }

    static String getDate(boolean leapYears, int year, int day, int mounth) {
        String date = "";
        if (leapYears) {
            if (mounth == 2 && day <= 29) {
                date = date + day + ". " + mounth + ". " + year;
                return date;
            }
            if ((mounth == 4 || mounth == 6 || mounth == 9 || mounth == 11) && day <= 30) {
                date = date + day + ". " + mounth + ". " + year;
                return date;
            }
            if (mounth <= 12 && day <= 31) {
                date = date + day + ". " + mounth + ". " + year;
                return date;
            } else {
                System.err.println("Неправельно введена дата");
            }
        }
        else {
            if (mounth == 2 && day <= 29) {
                date = date + day + ". " + mounth + ". " + year;
                return date;
            }
            if ((mounth == 4 || mounth == 6 || mounth == 9 || mounth == 11) && day <= 30) {
                date = date + day + ". " + mounth + ". " + year;
                return date;
            }
            if (mounth <= 12 && day <= 31) {
                date = date + day + ". " + mounth + ". " + year;
                return date;
            } else {
                System.err.println("Неправельно введена дата");
            }
        }
        return date;
    }


}
