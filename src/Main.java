import java.util.Arrays;
import java.util.Scanner;

public class Main {

    String newColor;

     static void paint(String newColor, Figure figure){
         figure.color = newColor;
         System.out.println(figure.color);
    }

    public static void main(String[] args) {

        //23.04
        //sout
//        System.out.println("Hello world!");
//        System.out.println("\"Привет\"");
//        System.out.println(2 + 5);
//
//        //Арифметические действия
//        //целые числа
//        System.out.println(2 + 5);
//        System.out.println(2 - 5);
//        System.out.println(2 * 5);
//        System.out.println(2 / 5);
//        System.out.println(2 % 5);
//
//        //дробные числа
//        System.out.println(2.0 + 5.0);
//        System.out.println(2.0 - 5.0);
//        System.out.println(2.0 * 5.0);
//        System.out.println(2.0 / 5.0);
//        System.out.println(2.0 % 5.0);
//
//        //Строки - текстовый тип данных
//        System.out.println("Левая часть строки " + "Правая часть строки");
//
//        //Порядок операций
//        System.out.println(2 + 3 * 5);
//        System.out.println((2 + 3) * 5);

        //Стиль кода IDEA Ctrl + Alt + L

        //Переменные
        //Создание переменной
        //Тип_данных имя_переменной
        //Имя переменных начинаются с буквы, '_' или $ , после этого можно использовать еще цифры
        //Регистр в именах важен
        // '=' операция присваивания
        //аббревиатура начинаются с большой буквы и оканчиваются маленькими

        //Типы данных
        // 1. Примитивные типы данных (ключевые слова Java)
        // 2. Ссылочные типы данных (массивы, классы итд)

        //Примитивные типы данных
        //Целые числа

        // byte, 1 байт, -128...127
        // short, 2 байта, -32,7968..32,767
        // int, 4 байта, -2,147,483,648..2,147,483,647
        // long, 8 байт, -9,223,372,036,854,775,888..9,223,372,036,854,775,807

        //И float, и double подчиняются международному стандарту IEEE 754
//        System.out.println(5.0 / 2.1);
//        System.out.printf("%.4f", 5.0 / 2.1); //souf ограничение знаков после запятой
//
//        //Символы
//        //char, 1 - 4 байт
//        char c = 'n';
//
//        //Логический тип данных
//        boolean boolTrue = true;
//        boolean boolFalse = false;

        //Преобразование типов
        // 1. Восходящее - тип меньшей длины преобразуем в тип большей длины
//        byte smallVar = 12;
//        int bigVar = smallVar;
//        // 2. Нисходящее - тип большей длины преобразуем в тип меньшей длины
//        int bigInt = 127;
//        byte smallByte = (byte) bigInt;
//
//        //Операции сравнения
//        //проверка на равенство
//        System.out.println(5 == 5); //true
//        System.out.println(5 == 6); //false
//        //проверка на неравества
//        System.out.println(5 != 5); //false
//
//        boolean is5equels5 = 5 == 5;
//        System.out.println(is5equels5);
//
//        //Условные операторы- возможность исполнить блок кода по определенному условию
//        if (5 > 0) {
//            System.out.println("Первое условие было истинным");
//        }

//        double balance = 15540;
//        double percent = 20.9;
//        double newBalance = balance * (1 + percent / 100);
//        System.out.println(newBalance);
//
//        balance = balance * (1 + percent / 100);
//        System.out.println(balance);
//
//        if (balance > 100000) {
//            System.out.println("Много денег");
//        } else {
//            System.out.println("Мало денег");
//        }

        //Операции с логическими типами
        // Отрицание (not) - обратное значение
//        System.out.println(!true);
//
//        // Или - результат истина, если хотя бы один истина
//        System.out.println(false || true);
//        // И - результат истинный, если оба истина
//        System.out.println(true && true);

        //Ввод из консоли
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Введите целое число");
//        int input = sc.nextInt();
//        System.out.println(input);
//
//        System.out.println("Введите сумму на счёт");
//        double balance = sc.nextDouble();
//        System.out.println("Введите процент");
//        double percent = sc.nextDouble();
//        System.out.println("Через год у вас будет " + balance * (1 + percent / 100));


        //Cтроковый тип данных
//        String str = "Привет!";
//        System.out.println(str.length());
        // length - длина строки
        // charAt - получить символ по индексу (с 0)
        // equals - проверка на ранвенство строки
        // isEmpty - проверка на пустоту
        // indexOff - найти первый индекс символа или строчки внутри указанной
        // lastIndexOff - найти последний символ
        // contains - узнать, есть ли смволы или строка внутри указанной
        // equalsIgnoreCase- равенство игнорируя большие буквы
        // startsWith\endsWith  - строка начинается\заканчивается
        // replace - замена символов/строки
        //toLowerCase/toUpperCase - перевод в большие , в маленькие буквы.

        //24.04
        //оператор switch-case-break-default

        //массивы - возможность под одним именем хранить много значений одного и того же типа в определенном порядке
        //массивы являются статической структурой , которая не может изменяться по длине
        //индексы - порядковые номера массива
        //ти_значений[] имя_массива

//        int[] array;
//         //1.Создание массива по длине массива
//        //У каждого примитивного типа есть значение по умолчанию: byte, short, int, long -> 0; float, double -> 0.0, boolean -> foals
//        array = new int[5];

//         //2.Создание массива на основе значений
//        double[] doubleArray = new double[]{1.1, 2.2, 3.3};
//
//        //Получить количество элементов .length
//        System.out.println("doubleArray: " + doubleArray.length);
//
//        //Вывести содержимое массива
//        System.out.println(doubleArray);
//        System.out.println("Массив doubleArray: " + Arrays.toString(doubleArray));
//
//        //Взаимодействие элементов по его индексу
//        System.out.println("Второй элемент в doubleArray: " + doubleArray[1]);
//
//        doubleArray[0] = 100;

        //Циклы- возможность повторять один и тот же код

        //while

//        int q = 5;
//        while (q > 0){
//            System.out.println(q);
//            q = q -1;
//
//        }

        //do-while
//        q = 5;
//        do {
//            System.out.println(q);
//            q = q - 1;
//        } while (q > 0);
//
//        // цикл for
//        for (int i = 0; i <= 6; i = i -1){
//            System.out.println(i);
//        }

        //continue
        // break- позволяет выйти из цикла без условий

        //Работа с массивами через циклы
//        int[] numbers = new int[100];
//        System.out.println(Arrays.toString(numbers));
//        for (int index = 0; index < numbers.length; index++){
//            numbers[index] = index + 1;
//        }
//        System.out.println(Arrays.toString(numbers));


//        int[] numArray = new int[]{10, 12, 15, 52, 55, 98};
//        for(int index = 0; index < numArray.length; index++){
//            int element = numArray[index];
//            if (element % 2 != 0) {
//                numArray[index] = 0;
//            } else {
//            System.out.println(element);}
//        }

//        System.out.println(Arrays.toString(numArray));

//        Scanner sc = new Scanner(System.in);
//        double array[];
//        System.out.println("Введите число");
//        int num2 = sc.nextInt();
//        if (num2 > 0) {
//            array = new double[num2];
//            for (int index = 0; index < array.length; index++) {
//                double element = index * index + 0.5;
//                array[index] = element;
//
//            }
//            System.out.println(Arrays.toString(array));
//
//        }
//
//    }
//    }


//        double[] doubleArray = new double[]{10.021, -12.5454, 0};
//        for(int index = 0; index < doubleArray.length; index++){
//            double element = doubleArray[index];
//            if (element < 0){
//                System.out.println("Неположительный элемент: " + element);
//            } else if (element > 0) {
//                System.out.println("Положительный элемент: " + element);
//            } else {
//                System.out.println("Неположительный элемент: " + element);

            Figure square = new Figure(5, 6, "green");
            System.out.println(square.toString());
            System.out.println(square.distance());

            Circle circle = new Circle(8,9,"red",55);
            System.out.println(circle.toString());
            System.out.println(circle.area());
            System.out.println(circle.distance());


            Figure figure = new Figure(10, 2, "yellow");
            paint("white", figure);
            System.out.println(figure);




            }
        }






