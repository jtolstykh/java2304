public class Alimal {
    String name;
    int age;
    String kind;

    void print (){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Вид: " + kind);
    }

    void makeSound (){
        if (kind.equals("cat")){
            System.out.println("Мяу");
        } else if (kind.equals("dog")){
            System.out.println("Гав");
        } else {
            System.out.println("Звук");
        }
    }





}
