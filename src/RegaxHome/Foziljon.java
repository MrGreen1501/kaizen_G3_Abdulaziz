package RegaxHome;

public class Foziljon {
    public static void main(String[] args) {
        String matn  = "email123@mail.ru";
        String regex = "[a-zA-Z]{3,}[0-9]{0,9}@mail\\.ru";
        boolean mail = matn.matches(regex);
        System.out.println(mail);

    }
}
