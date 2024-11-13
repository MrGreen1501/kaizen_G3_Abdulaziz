package RegaxHome;

public class Task {
    public static void main(String[] args) {
        String  matn = "506996956";
        String regex = "^(\\+998)?(69|71|77|78|88|90|91|93|94|95|98|99|50)[0-9]{7}$";
        boolean matches = matn.matches(regex);
        System.out.println(matches);
    }
}
