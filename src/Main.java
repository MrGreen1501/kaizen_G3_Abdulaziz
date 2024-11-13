

import java.nio.file.Files;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) throws Exception {

//        Path path =Path.of("D:/niotest");
//        try {
//            Path directory = Files.createDirectory(path);
//            System.out.println("papka yaratildi");
//            System.out.println(directory);
//        }catch (IOException e){
//            System.out.println("Papka bor");
//        }
//        try {
//            Path file = Files.createFile(path);
//            System.out.println("fayl yaratildi");
//            System.out.println(file);
//        }catch (IOException e){
//            System.out.println("bunday fayl yaratilgan");
//        }
//        try {
//            Files.writeString(path, "qayatadan urinib ko'ring!");
//            System.out.println("yozildi");
//        } catch (IOException e) {
//            System.out.println("xato");
//        }
//        Path path = Path.of("D:/niotest/data.txt");
//        Path path2 = Path.of("D:/aplll/data.txt");
//
//
//        List<String> strings = Files.readAllLines(path);
//        for (String string : strings) {
//            System.out.println(string);
//        }
//        System.out.println("---------------------------------------------");
//        String s = Files.readString(path);
//        System.out.println(s);
//        System.out.println("---------------------------------------------");
//
//        Files.copy(path, path2);

        Path path1 = Path.of("C:/Users/root/ukam/Fazliddin-Abduvohidov-Belalim-To-liq-X-faktor-2-mavsum.mp4");
        Path path = Path.of("D:/test/Fazliddin-Abduvohidov-Belalim-To-liq-X-faktor-2-mavsum.mp4");
        Files.copy(path1, path);


    }
}