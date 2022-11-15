package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Mods {
    //Решение задач типа 1 вида 1
    public static void type1_1() {//Решает задачи типа 1 на названия
        Scanner obj_count = new Scanner(System.in), obj = new Scanner(System.in), bits_count = new Scanner(System.in), bytes = new Scanner(System.in);

        System.out.println("Укажите количество названий:");

        short c = obj_count.nextShort(), bits, byte_count;
        String[] obj_array = new String[c];
        int[] sum_of_obj_in_array = new int[c];

        for (short i = 0; i < c; i++) {
            System.out.println("Напишите название с пробелом и запятой \nПример ' Река,'");
            obj_array[i] = obj.nextLine();
        }

        System.out.println("Укажите сколькими битами кодируется один символ:");
        bits = bits_count.nextShort();

        System.out.println("Укажите на сколько байт уменьшился объём текста:");
        byte_count = bytes.nextShort();

        for (int i = 0; i < obj_array.length; i++) {
            sum_of_obj_in_array[i] = (obj_array[i].length() * bits) / 8;
        }
        for (int i = 0; i < obj_array.length; i++) {
            if (sum_of_obj_in_array[i] == byte_count) {
                System.out.println(obj_array[i]);
            }
        }
    }

    //Решение задач типа 1 вида 2
    public static void type1_2() {//Решает задачи типа 1 на объём текста
        Scanner lists = new Scanner(System.in), strings = new Scanner(System.in), chars = new Scanner(System.in), bits = new Scanner(System.in);
        int list_count, string_count, char_count, bit_count;

        System.out.println("Введите количество страниц (если их нет введите 1)");
        list_count = lists.nextInt();

        System.out.println("Введите количество строк на странице");
        string_count = strings.nextInt();

        System.out.println("Введите количество символов в строке");
        char_count = chars.nextInt();

        System.out.println("Введите количество бит которыми кодируется один символ ");
        bit_count = bits.nextInt();

        System.out.println((list_count * string_count * char_count * bit_count) / 8 / 1024 + " Килобайт");

    }

    //Решение задач типа 1 вида 3
    public static void type1_3() {//Решает задачи типа 1 на скорось передачи данных
        Scanner time = new Scanner(System.in), volume = new Scanner(System.in);
        float time2, volume2;

        System.out.println("Введите объём файла килобайтах");
        volume2 = volume.nextFloat();

        System.out.println("Введите время за которое передаётся фаил в секундах");
        time2 = time.nextFloat();

        System.out.println(volume2 / time2 + "Килобит в секунду");
    }

    //Решение задач типа 2
    public static void type2_1() {//Покачто не решает задачи типа 2 (нужно возиться с регулярными выражениями)
        Scanner coded_chars = new Scanner(System.in), decode_char = new Scanner(System.in), coded = new Scanner(System.in), chars_amount = new Scanner(System.in), coded_amount = new Scanner(System.in);
        int amount, c_amount;

        System.out.println("Введите количество закодированных символов");
        amount = chars_amount.nextInt();

        System.out.println("Введите количество закдированных строк");
        c_amount = coded_amount.nextInt();

        String[] c_chars = new String[amount], d_chars = new String[amount], code = new String[c_amount];

        for (int i = 0; i <= amount; i++) {
            System.out.println("Введите символ");
            c_chars[i] = coded_chars.nextLine();
            System.out.println("Введите код символа");
            d_chars[i] = decode_char.nextLine();
        }

    }

    //Решение задач типа 3
    public static void type3_1() {//Решает задачи типа 3
        Scanner chet = new Scanner(System.in), usl_men = new Scanner(System.in), usl_bol = new Scanner(System.in), x = new Scanner(System.in);
        int min, max;
        String ch, what;

        System.out.println("Введите минимальное значение x");
        min = usl_men.nextInt();

        System.out.println("Введите максимальное значение x");
        max = usl_bol.nextInt();

        System.out.println("Введите какое число нужно найти (если минимальное то введите - если максимальное то +)");

        switch (x.nextLine()) {
            case "+":
                System.out.println("Является ли x чётным числом (если да то введите + если нет то -)");
                switch (chet.nextLine()) {

                    case "+":
                        for (int i = max; i > min; i--) {
                            if (i % 2 == 0) {
                                System.out.println(i);
                                break;
                            }
                        }
                        break;

                    case "-":
                        for (int i = max; i > min; i--) {
                            if (i % 2 != 0) {
                                System.out.println(i);
                                break;
                            }
                        }
                        break;
                    case "":
                        System.out.println(max);
                        break;
                }
                break;

            case "-":
                System.out.println("Является ли x чётным числом (если да то введите + если нет то -)");
                switch (chet.nextLine()) {
                    case "+":
                        for (int i = min; i < max; i++) {
                            if (i % 2 == 0) {
                                System.out.println(i);
                                break;
                            }
                        }
                        break;
                    case "-":
                        for (int i = min; i < max; i++) {
                            if (i % 2 != 0) {
                                System.out.println(i);
                                break;
                            }
                        }
                        break;
                    case "":
                        System.out.println(min);
                        break;
                }
                break;
            default:
                System.out.println("code -1");
        }
    }

    public static void type5_1() {//Решает задачи типа 5
        Scanner amount_commands = new Scanner(System.in), command_one = new Scanner(System.in), command_two = new Scanner(System.in), number = new Scanner(System.in), command = new Scanner(System.in), end_number = new Scanner(System.in);
        int one, num, end_num;
        int[] commands = new int[5];
        String two;

        System.out.println("Введите на сколько увеличивает первая комманда");
        one = command_one.nextInt();

        System.out.println("Введите заданное программе число");
        num = number.nextInt();

        System.out.println("Введите число к котору привела программа");
        end_num = end_number.nextInt();

        System.out.println("Введите заданные программе комманды по одной ");
        for (byte i = 0; i < 5; i++)
            commands[i] = command.nextInt();

        System.out.println("Введите что делает вторая комманда если умножает на b то ввдедите * если делит на b то введите /");
        switch (command_two.nextLine()) {
            case "*":
                if (commands[0] == 1 & commands[1] == 1 & commands[2] == 1 & commands[3] == 2 & commands[4] == 1) {
                    int b = (num + one + one + one) / end_num - one;
                    System.out.println(b);
                }
                if (commands[0] == 2 & commands[1] == 1 & commands[2] == 1 & commands[3] == 1 & commands[4] == 1) {
                    int b = num / (end_num - one - one - one - one);
                    System.out.println(b);
                }
                if (commands[0] == 1 & commands[1] == 2 & commands[2] == 1 & commands[3] == 1 & commands[4] == 1) {
                    int b = (num + one) / (end_num - one - one - one);
                    System.out.println(b);
                }
                if (commands[0] == 1 & commands[1] == 1 & commands[2] == 2 & commands[3] == 1 & commands[4] == 1) {
                    int b = (num + one + one) / (end_num - one - one);
                    System.out.println(b);
                }
                if (commands[0] == 1 & commands[1] == 1 & commands[2] == 1 & commands[3] == 1 & commands[4] == 2) {
                    int b = (num + one + one + one + one) / end_num;
                    System.out.println(b);
                }
                break;
            //Переделать через цикл for
            case "/":
                if (commands[0] == 1 & commands[1] == 1 & commands[2] == 1 & commands[3] == 2 & commands[4] == 1) {
                    for (int i = 2; i < 1000; i++) {
                        if ((num + one + one + one) / i == end_num - one) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
                if (commands[0] == 2 & commands[1] == 1 & commands[2] == 1 & commands[3] == 1 & commands[4] == 1) {
                    for (int i = 2; i < 1000; i++) {
                        if (num / i == end_num - one - one - one - one) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
                if (commands[0] == 1 & commands[1] == 2 & commands[2] == 1 & commands[3] == 1 & commands[4] == 1) {
                    for (int i = 2; i < 1000; i++) {
                        if ((num + one) / i == end_num - one - one - one) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
                if (commands[0] == 1 & commands[1] == 1 & commands[2] == 2 & commands[3] == 1 & commands[4] == 1) {
                    for (int i = 2; i < 100000; i++) {
                        if ((num + one + one) / i == end_num - one - one) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
                if (commands[0] == 1 & commands[1] == 1 & commands[2] == 1 & commands[3] == 1 & commands[4] == 2) {
                    for (int i = 2; i < 1000; i++) {
                        if ((num + one + one + one + one) / i == end_num) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public static void type8_two_rounds() {//Решает задачи типа 8 с двумя кругами эйлера (три круга скоро сделаю)
        Scanner first = new Scanner(System.in), second = new Scanner(System.in), first_amount = new Scanner(System.in), second_amount = new Scanner(System.in), what = new Scanner(System.in);
        int first_round, second_round, first_round_amount, second_round_amount;
        String first_r_amount, second_r_amount;
        //Для кейсов
        Scanner a = new Scanner(System.in), b = new Scanner(System.in), a_or_b = new Scanner(System.in), a_and_b = new Scanner(System.in);
        int A, B, A_or_B, A_and_B;

        System.out.println("Введите название первого запроса");
        first_r_amount = first.nextLine();

        System.out.println("Введите название второго запроса");
        second_r_amount = second.nextLine();

        System.out.println("Введите что нужно найти");
        System.out.println("1 -Количество запросов " + first_r_amount);
        System.out.println("2 - Количество запросов " + second_r_amount);
        System.out.println("3 - Количество запросов " + first_r_amount + " | " + second_r_amount);
        System.out.println(" 4 - Количество запросов " + first_r_amount + "&" + second_r_amount);
        switch (what.nextInt()) {
            case 1:
                System.out.println("Введите количество запросов " + second_r_amount);
                B = b.nextInt();

                System.out.println("Введите количество запросов " + first_r_amount + " & " + second_r_amount);
                A_and_B = a_and_b.nextInt();

                System.out.println("Введите количество запросов " + first_r_amount + " | " + second_r_amount);
                A_or_B = a_or_b.nextInt();

                System.out.println(A_or_B - B + A_and_B);
                break;
            case 2:
                System.out.println("Введите количество запросов " + first_r_amount);
                A = a.nextInt();

                System.out.println("Введите количество запросов " + first_r_amount + " & " + second_r_amount);
                A_and_B = a_and_b.nextInt();

                System.out.println("Введите количество запросов " + first_r_amount + " | " + second_r_amount);
                A_or_B = a_or_b.nextInt();

                System.out.println(A_or_B - A + A_and_B);
                break;
            case 3:
                System.out.println("Введите количество запросов " + first_r_amount);
                A = a.nextInt();

                System.out.println("Введите количество запросов " + second_r_amount);
                B = b.nextInt();

                System.out.println("Введите кличество запросов " + first_r_amount + " & " + second_r_amount);
                A_and_B = a_and_b.nextInt();

                System.out.println(A + B - A_and_B);
                break;
            case 4:
                System.out.println("Введите количество запросов " + first_r_amount);
                A = a.nextInt();

                System.out.println("Введите количество запросов " + second_r_amount);
                B = b.nextInt();

                System.out.println("Введите количество запросов " + first_r_amount + " | " + second_r_amount);
                A_or_B = a_or_b.nextInt();

                System.out.println(A + B - A_or_B);
        }
    }

    public static void type10_1() {//Сравнивает числа
        Scanner num1 = new Scanner(System.in), num2 = new Scanner(System.in), num3 = new Scanner(System.in), system = new Scanner(System.in), sysytem = new Scanner(System.in);
        long number1, number2, number3;
        int number1_, number2_, number3_, sys;
        String[] array;

        System.out.println("Введите систему счисления первого числа");
        number1_ = Integer.parseInt(num1.nextLine());

        System.out.println("Введите первое число");
        number1 = Long.parseLong(num1.nextLine(), number1_);

        System.out.println("Введите систему счисления второго числа");
        number2_ = Integer.parseInt(num2.nextLine());

        System.out.println("Введите второе число");
        number2 = Long.parseLong(num2.nextLine(), number2_);

        System.out.println("Введите систему счисления третьего числа");
        number3_ = Integer.parseInt(num3.nextLine());

        System.out.println("Введите третье число");
        number3 = Long.parseLong(num3.nextLine(), number3_);

        System.out.println("Введите какое число нужно найти если максилальное то введите + если минимальное то введите -");
        switch (system.nextLine()) {
            case "-":
                System.out.println("Введите систему счисления для сравнения");
                sys = Integer.parseInt(sysytem.nextLine());
                array = new String[]{Long.toString(number1, sys),Long.toString(number2, sys),Long.toString(number3, sys)};
                System.out.println(min_for_type10(array));
                break;
            case "+":
                System.out.println("Введите систему счисления для сравнения");
                sys = Integer.parseInt(sysytem.nextLine());
                array = new String[]{Long.toString(number1, sys),Long.toString(number2, sys),Long.toString(number3, sys)};
                System.out.println(max_for_type10(array));
                break;
        }
    }

    public static void type10_2() {//Находит минимальное количество единиц в двоичной записи числа
        Scanner num1 = new Scanner(System.in), num2 = new Scanner(System.in), num3 = new Scanner(System.in);
        int[] chars_array = new int[]{0,0,0};
        long number1, number2, number3;
        String[] array;

        System.out.println("Введите первое число");
        number1 = Long.parseLong(num1.nextLine());

        System.out.println("Введите второе число");
        number2 = Long.parseLong(num1.nextLine());

        System.out.println("Введите третье число");
        number3 = Long.parseLong(num1.nextLine());

        array = new String[]{Long.toString(number1, 2 ), Long.toString(number2, 2), Long.toString(number3, 2)};

        for (int i = 0; i < array[0].length(); i++) {
            if (array[0].charAt(i) == '1' ){
                chars_array[0] += 1;
            }
        }
        for (int i = 0; i < array[1].length(); i++) {
            if (array[1].charAt(i) == '1' ){
                chars_array[1] += 1;
            }
        }
        for (int i = 0; i < array[2].length(); i++) {
            if (array[2].charAt(i) == '1' ){
                chars_array[2] += 1;
            }
        }
        int min_chars = chars_array[0];
        for (int i = 0; i < chars_array.length; i++) {
            if (chars_array[i] < min_chars){
                min_chars = chars_array[i];
            }
        }
        System.out.println(min_chars);
    }
public static  void type10_3(){//Принимает три числа переводит их в восьмеричную систему счисления после чего выводит минимальную суму цифр числа
    Scanner number1 = new Scanner(System.in), number2 = new Scanner(System.in), number3 = new Scanner(System.in);
    int num1 , num2 ,num3, min;
    int[] arr1  , arr2 , arr3, sum = new int[] {0,0,0};
    String[] array;

    System.out.println("Введите первое число");
    num1 = Integer.parseInt(number1.nextLine(), 10);

    System.out.println("Введите второе число");
    num2 = Integer.parseInt(number2.nextLine(), 10);

    System.out.println("Введите третье число");
    num3 = Integer.parseInt(number3.nextLine(), 10);
    array = new String[]{Integer.toString(num1, 8 ), Integer.toString(num2, 8), Integer.toString(num3, 8)};
    arr1 = new int[array[0].length()];
    arr2 = new int[array[1].length()];
    arr3 = new int[array[2].length()];

    for (int i = 0; i < array[0].length(); i++) {
        arr1[i] = array[0].charAt(i);
    }
    for (int i = 0; i < array[1].length(); i++) {
        arr2[i] = array[1].charAt(i);
    }
    for (int i = 0; i < array[2].length(); i++) {
        arr3[i] = array[2].charAt(i);
    }
    for (int i = 0; i < arr1.length; i++) {
        sum[0] = sum[0] + arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
        sum[1] = sum[1] + arr2[i];
    }
    for (int i = 0; i < arr3.length; i++) {
        sum[2] = sum[2] + arr3[i];
    }
    min = sum[0];
    for (int i = 0; i < 3; i++) {
        if (min < sum[i]){
            min =  sum[i];
        }
    }
    System.out.println(min);
}
//##Другие функции##//
    private static int min_for_type10(String[] array){
        int[] new_array = new int[3];
        for (int i = 0; i < 3; i++) {
            try{
                new_array[i] = Integer.parseInt(array[i]);
            }
            catch (NumberFormatException nfe ){
                System.out.println("NumberFormatException!");
            }
        }
        int min = new_array[0];
        for(int i = 0; i < new_array.length; i++){
            if (new_array[i] < min){
                min  = new_array[i];
            }
        }
        return min;
    }

    private static int max_for_type10(String[] array){
        int[] new_array = new int[3];
        for (int i = 0; i < 3; i++) {
            try{
                new_array[i] = Integer.parseInt(array[i]);
            }
            catch (NumberFormatException nfe ){
                System.out.println("NumberFormatException!");
            }
        }
        int max = new_array[0];
        for(int i = 0; i < new_array.length; i++){
            if (new_array[i] > max){
                max = new_array[i];
            }
        }
        return max;
    }
}