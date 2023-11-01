import Classes.Cinema;
import Classes.Hall;
import Classes.Session;
import Classes.UserHistory;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Cinema cinema1 = new Cinema("Люмен", "Московский пр-кт, д 257", "Паркинг есть");
        Cinema cinema2 = new Cinema("Синема", "Гвардейский пр-кт, д 3, ТРЦ «Европа», 3-й этаж", "Нет паркинга");

        Session seans11 = new Session(1,"12:30", "Мстители", "3 часа");
        Session seans12 = new Session(2,"15:00", "Стражи Галактики", "2 часа 37 минут");

        Session seans21 = new Session(1,"10:00", "Барби", "1 час 54 минут");
        Session seans22 = new Session(2,"13:00", "Оппенгеймер", "3 часа");

        cinema1.addSession(seans11);
        cinema1.addSession(seans12);

        cinema2.addSession(seans21);
        cinema2.addSession(seans22);

        System.out.println("Доступные кинотеатры Калининграда:");
        System.out.println(cinema1.getName() + ": " + cinema1.getAdres() + ", " + cinema1.getParking());
        System.out.println(cinema2.getName() + ": " + cinema2.getAdres() + ", " + cinema2.getParking());

        Hall hall11 = new Hall(1, 10, 10);
        Hall hall12 = new Hall(2, 11, 11);

        Hall hall21 = new Hall(1, 10, 10);
        Hall hall22 = new Hall(2, 11, 11);

        UserHistory userHistory = new UserHistory();

        System.out.println("Выберите кинотеатр:");
        String vvodCinema = in.next();

        if (vvodCinema.equals(cinema1.getName())) {
            userHistory.viewSessions(cinema1);

            System.out.println("Выберите cеанс:");
            String vvodHall = in.next();

            if (vvodHall.equals("1")) {
                System.out.println("Выберите места:");
                userHistory.buyTicket(hall11);

            } else if (vvodHall.equals("2")) {
                System.out.println("Выберите места:");
                userHistory.buyTicket(hall12);

            } else {
                System.out.println("Неправильный выбор cенса");
            }

        } else if (vvodCinema.equals(cinema2.getName())) {
            userHistory.viewSessions(cinema2);

            System.out.println("Выберите cеанс:");
            String vvodHall = in.next();

            if (vvodHall.equals("1")) {
                System.out.println("Выберите места:");
                userHistory.buyTicket(hall11);

            } else if (vvodHall.equals("2")) {
                System.out.println("Выберите места:");
                userHistory.buyTicket(hall12);

            } else {
                System.out.println("Неправильный выбор cенса");
            }

        } else {
            System.out.println("Неправильный выбор кинотеатра");
        }

    }
}
