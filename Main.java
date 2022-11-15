package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner change = new Scanner(System.in);
        System.out.println("Выберите тип задачи\n1 - Тип 1\n3 - Тип 3\n5 - Тип 5 \n8 - Тип 8\n10 - Тип 10");
        switch (change.nextInt()){
            case 1:
                Settings.type1();
                break;
            case 3:
                Settings.type3();
                break;
            case 5:
                Settings.type5();
                break;
            case 8:
                Settings.type8();
                break;
            case 10:
                Settings.type10();
                break;
            default:
                System.out.println("Выбранно неверное действие!");
        }
    }
}
