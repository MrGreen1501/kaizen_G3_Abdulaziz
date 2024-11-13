package Qwerty;


import java.time.LocalDate;

public class Mein {
    public static void main(String[] args) {
        Person person = Person.builder()
                .Id(12)
                .Birthday(LocalDate.of(2001, 1, 1))
                .build();
        System.out.println(person);

    }
}
