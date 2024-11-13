package Task;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class UseToProduct {
        public static void main(String[] args)  {
        Product product = Product.builder()
                .id(1)
                .name("ZikrRing")
                .description("Successfully life")
                .price(10.99)
                .expireDate(LocalDate.of(2024,11,8))
                .build();
        System.out.println(product);

//            Path path = Path.of("C:/Users/root/Downloads/Telegram Desktop/Fazliddin-Abduvohidov-Belalim-To-liq-X-faktor-2-mavsum.mp4");

        }


}
