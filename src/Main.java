import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //23.04
        //sout
        System.out.println("Hello world!");
        System.out.println("\"Привет\"");
        System.out.println(2 + 5);

        //Арифметические действия
        //целые числа
        System.out.println(2 + 5);
        System.out.println(2 - 5);
        System.out.println(2 * 5);
        System.out.println(2 / 5);
        System.out.println(2 % 5);

        //дробные числа
        System.out.println(2.0 + 5.0);
        System.out.println(2.0 - 5.0);
        System.out.println(2.0 * 5.0);
        System.out.println(2.0 / 5.0);
        System.out.println(2.0 % 5.0);

        //Строки - текстовый тип данных
        System.out.println("Левая часть строки " + "Правая часть строки");

        //Порядок операций
        System.out.println(2 + 3 * 5);
        System.out.println((2 + 3) * 5);

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
        System.out.println(5.0 / 2.1);
        System.out.printf("%.4f", 5.0 / 2.1); //souf ограничение знаков после запятой

        //Символы
        //char, 1 - 4 байт
        char c = 'n';

        //Логический тип данных
        boolean boolTrue = true;
        boolean boolFalse = false;

        //Преобразование типов
        // 1. Восходящее - тип меньшей длины преобразуем в тип большей длины
        byte smallVar = 12;
        int bigVar = smallVar;
        // 2. Нисходящее - тип большей длины преобразуем в тип меньшей длины
        int bigInt = 127;
        byte smallByte =  (byte) bigInt;

        //Операции сравнения
        //проверка на равенство
        System.out.println(5 == 5); //true
        System.out.println(5 == 6); //false
        //проверка на неравества
        System.out.println(5 != 5); //false

        boolean is5equels5 = 5 == 5;
        System.out.println(is5equels5);

        //Условные операторы- возможность исполнить блок кода по определенному условию
        if (5 > 0) {
            System.out.println("Первое условие было истинным");
        }

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
        System.out.println(!true);

         // Или - результат истина, если хотя бы один истина
        System.out.println(false || true);
        // И - результат истинный, если оба истина
        System.out.println(true && true);

        //Ввод из консоли
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое число");
        int input = sc.nextInt();
        System.out.println(input);

        System.out.println("Введите сумму на счёт");
        double balance = sc.nextDouble();
        System.out.println("Введите процент");
        double percent = sc.nextDouble();
        System.out.println("Через год у вас будет " + balance * (1 + percent / 100));


        //Cтроковый тип данных
        String str = "Привет!";
        System.out.println(str.length());
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

        int[] array;
         //1.Создание массива по длине массива
        //У каждого примитивного типа есть значение по умолчанию: byte, short, int, long -> 0; float, double -> 0.0, boolean -> foals
        array = new int[5];

         //2.Создание массива на основе значений
        double[] doubleArray = new double[]{1.1, 2.2, 3.3};

        //Получить количество элементов .length
        System.out.println("doubleArray: " + doubleArray.length);

        //Вывести содержимое массива
        System.out.println(doubleArray);
        System.out.println("Массив doubleArray: " + Arrays.toString(doubleArray));

        //Взаимодействие элементов по его индексу
        System.out.println("Второй элемент в doubleArray: " + doubleArray[1]);

        doubleArray[0] = 100;







    }
}