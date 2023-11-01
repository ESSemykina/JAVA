package Classes;

import Classes.Cinema;
import Classes.Hall;
import Classes.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//возможность посмотреть сеансы и приобрести билет
public class UserHistory {
    public void viewSessions(Cinema cinema) {
        List<Session> sessions = cinema.getSessions();

        System.out.println("Доступные сеансы:");
        for (Session session : sessions) {
            System.out.println(session.getNumber() + ": " + session.getStart() + " - " + session.getFilm() + " (" + session.getDuration() + ")");
        }
    }

    public static void buyTicket(Hall hall) {

        int rows = hall.getRow();
        int seats = hall.getSeat();
        boolean[][] isOccupied = new boolean[rows][seats];
        List<String> selectedPlaces = new ArrayList<>();

        System.out.println("Схема зала");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                System.out.print(isOccupied[i][j] ? " X " : " 0 ");
                System.out.print("|");
            }
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        boolean buyMore = true;

        while (buyMore) {
            System.out.println("Выберите ряд и место через пробел");
            int selectedRow = in.nextInt();
            int selectedSeat = in.nextInt();

            if (selectedRow >= 1 && selectedRow <= rows && selectedSeat >= 1 && selectedSeat <= seats) {
                if (!isOccupied[selectedRow - 1][selectedSeat - 1]) {
                    isOccupied[selectedRow - 1][selectedSeat - 1] = true;

                    selectedPlaces.add("Ряд:" + selectedRow + " Место:" + selectedSeat);
                    System.out.println("Билет успешно приобретен!");

                    System.out.println("Приобрести еще билеты?(Да или Нет)");
                    String choice = in.next();
                    buyMore = choice.equalsIgnoreCase("да");
                } else {
                    System.out.println("Место занято. Выберите другое.");
                }
            } else {
                System.out.println("Неверный номер ряда или места");
            }
        }

        System.out.println("Схема зала с купленными местами");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                System.out.print(isOccupied[i][j] ? " X " : " 0 ");
                System.out.print("|");
            }
            System.out.println();
        }

        System.out.println("Ваши выбранные места:");
        for (String seat : selectedPlaces) {
            System.out.println(seat);
        }
    }
}

