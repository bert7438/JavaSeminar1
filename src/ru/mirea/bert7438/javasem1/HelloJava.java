package ru.mirea.bert7438.javasem1;

public class HelloJava {
    public static void main(String[] args) {
        Dog baron = new Dog("Baron", 5);
        System.out.println(baron);
        Dog dog = new Dog("Laika");
        System.out.println(dog);
        Dog secretdog = new Dog();
        System.out.println(secretdog);

        Ball vb = new Ball(7, "volleyball");
        System.out.println(vb);
        Ball someball = new Ball("basketball");
        System.out.println(someball);
        Ball secball = new Ball(2);
        System.out.println(secball);
        System.out.println(new Ball());

        Book voinamir = new Book("Voyna i Mir", "Lev Tolstoy", 9000, "historical");
        System.out.println(voinamir);
        Book sb = new Book("Some book to motivate", "Troy Bakham", 130);
        System.out.println(sb);
        System.out.println(new Book("Secret book", 42));
    }
}
