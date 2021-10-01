import entity.Country;
import entity.Sport;
import entity.Team;
import entity.Tournament;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//
//        // создание вида спорта
        Sport sport1 = Sport.builder().name("Футбол").build();
        Sport sport2 = Sport.builder().name("Баскетбол").build();
        Sport sport3 = Sport.builder().name("Волебол").build();
        Sport sport4 = Sport.builder().name("Хокей").build();
//        // занос спорта в БД
        saveEntity(sport1);
        saveEntity(sport2);
        saveEntity(sport3);
        saveEntity(sport4);
//        // создание стран
        Country country1 = Country.builder().name("Кыргызстан").build();
        Country country2 = Country.builder().name("Россия").build();
        Country country3 = Country.builder().name("США").build();
        Country country4 = Country.builder().name("Китай").build();
//        // занос стран в БД
        saveEntity(country1);
        saveEntity(country2);
        saveEntity(country3);
        saveEntity(country4);
//

//        // создание команд
        Team team1 = Team.builder()
                .name("Дордой")
                .country(country1)
                .logo("Находится по адрису1")
                .site("Находитсяс по адрису 1")
                .sport(sport1)
                .build();

        Team team2 = Team.builder()
                .name("Спартак")
                .country(country2)
                .logo("Находится по адрису 2")
                .site("Находитсяс по адрису 2")
                .sport(sport2)
                .build();

        Team team3 = Team.builder()
                .name("CrowStreets")
                .country(country3)
                .logo("Находится по адрису 3")
                .site("Находитсяс по адрису 3")
                .sport(sport3)
                .build();

        Team team4 = Team.builder()
                .name("ДзенЛяпин")
                .country(country4)
                .logo("Находится по адресу3")
                .site("Находится по адресу 3")
                .sport(sport4)
                .build();
//        //занос команд в БД
        saveEntity(team1);
        saveEntity(team2);
        saveEntity(team3);
        saveEntity(team4);

        //        // создание турниров
        Tournament tournament1 = Tournament.builder()
                .name("Чемпионат по Футболу")
                .country(country4)
                .sport(sport1)
                .teams(team1)
                .build();

        Tournament tournament2 = Tournament.builder()
                .name("Чемпионат по Валейболу")
                .country(country3)
                .sport(sport3)
                .teams(team3)
                .build();

        Tournament tournament3 = Tournament.builder()
                .name("Чемпионат по Баскетболу")
                .country(country2)
                .sport(sport2)
                .teams(team2)
                .build();

        Tournament tournament4 = Tournament.builder()
                .name("Чемпионат по Хокей")
                .country(country1)
                .sport(sport4)
                .teams(team4)
                .build();
//        // занос турниров в БД
        saveEntity(tournament1);
        saveEntity(tournament2);
        saveEntity(tournament3);
        saveEntity(tournament4);


        List<Team> toyr =  getAllTeamsName();
        System.out.println(toyr);


    }

    public static <T> T saveEntity(T entity){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Успешное сохронение ");
        return entity;
    }

    public static List<Team> getAllTeamsInTournament(String tournamentName){
        // Запрос на все команды выступающие в чемпионате
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        List<Team> teams = hibernateSession
                .createQuery("select distinct tour.teams from Tournament tour where tour.name = :tournamentName", Team.class)
                .setParameter("tournamentName", tournamentName)
                .list();
        hibernateSession.close();
        System.out.println("Команды выступающие на чемпионате");
        return teams;
    }


    public static List<Tournament> getInTournamentByName(String searchString) {
        // Запрос чемпионата по имени
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        List<Tournament> tournaments = hibernateSession
                .createQuery("FROM Tournament tour where tour.name = :tourName", Tournament.class)
                .setParameter("tourName", searchString)
                .setMaxResults(1)
                .list();
        hibernateSession.close();
        System.out.println("Вывод турнира по запросу имени (точное значение!!!)");
        return tournaments;
        // и тут я понял что поебался с тем что послал запров поралельно стер всю таблицу
        // потому что в параметрах помника стоит крит это все бля на 15 попытке
    }

    public static List<Team> getAllTeamsName(){
        // Запрос на все команды выступающие в чемпионате
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        List<Team> teams = hibernateSession
                .createQuery("from Team t order by t.name, t.site desc, t.id  asc", Team.class)
                .setMaxResults(2)
                .list();
        hibernateSession.close();
        return teams;

        /**
         * Только ИМЯ и АДРЕС_САЙТА  Команды, отсортировать по ID и ограничить выборку до 5
         *
         * я не понял как делается эта часть если можно скинь образец HQL запроса плиз
         */
    }



}
