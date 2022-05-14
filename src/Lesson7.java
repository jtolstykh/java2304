import java.util.Scanner;

public class Lesson7 {
    static String readName() throws NameToolLongException {

           Scanner scanner = new Scanner(System.in);
           String str = scanner.nextLine();

        if (str.length() > 10){

            throw new NameToolLongException();

        } else {
            return str;
        }
    }

    public static void main(String[] args) {

            try {
                String name = readName();
                System.out.println("Привет " + name);
            }
            catch (NameToolLongException e){
                System.out.println(e.getMessage());
            }
        }
    }

