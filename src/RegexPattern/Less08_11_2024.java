package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less08_11_2024 {
    public static void main(String[] args) {
        String  matn = "ema12a@gmail.com";
        String regex = "[a-zA-Z]{3,10}[0-9]{0,3}@gmail\\.com";          //"[a-z| ]{1,}";        //"(salom){1,6}";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(matn);
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}
