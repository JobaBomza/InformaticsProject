package Main;

import java.lang.*;
import java.util.*;

public class Settings {
    private static Scanner change_type = new Scanner(System.in);
    public static void type1(){
        System.out.println("Выбирете вид задания\n1 - Указать удалёное слово\n2- Найти вес текста\n3- Скорость передачи текста");
        switch (change_type.nextInt()){
            case 1:
                Mods.type1_1();
                break;
            case 2:
                Mods.type1_2();
                break;
            case 3:
                Mods.type1_3();
                break;
            default:
                System.out.println("Выбрано неверное действие!!");
                break;
        }
    }
    public static void type3(){
        Mods.type3_1();
    }
    public  static void type5(){
        Mods.type5_1();
    }
    public static void type8(){
        Mods.type8_two_rounds();
    }
    public static void type10(){
        System.out.println("Выберите вид задания\n1 - Нахождение минимального - максимального значения из трёх чисел в разных системах счисления \n2- Нахождения минимального количества единиц в двоичной записи числа\n3- Нахождение минимальной суммы цифр в восьмеричной записи числа");
        switch (change_type.nextInt()){
            case 1:
                Mods.type10_1();
                break;
            case 2:
                Mods.type10_2();
                break;
            case 3:
                Mods.type10_3();
                break;
            default:
                System.out.println("Выбранно неверное действие!");
        }
    }
}