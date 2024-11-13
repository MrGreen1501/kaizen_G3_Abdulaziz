package RegaxHome;

public class Task2 {
    public static void main(String[] args) {
        String  matn = "email12@mail.ru";
        String regexmail = "([a-zA-Z]{3,}[0-9]{0,9})@mail\\.ru";
        boolean matches = matn.matches(regexmail);
        System.out.println(matches);
    }
}
