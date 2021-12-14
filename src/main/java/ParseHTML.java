
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;


public class ParseHTML {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.parse(new File("D:\\test6.html"), "UTF-8");
        String fullName = doc.select("p.full_name").text();
        System.out.println(fullName);

        if (fullName.length() == 0) {
            System.out.println("Упс! Кажется, что-то слишком сложное :(");
            return;
        }
        String[] arrayOfString = fullName.split(" ");
        int l = arrayOfString.length;
        switch (l) {
            case 3:
                System.out.println("Ура! Мы нашли фамилию: " + arrayOfString[0] + ", имя: " + arrayOfString[1] + ", отчество: " + arrayOfString[2] + "!");
                break;
            case 2:
                System.out.println("Ура! Мы нашли фамилию: " + arrayOfString[0] + ", имя: " + arrayOfString[1] + "!");
                break;
            case 1:
                System.out.println("Мы нашли имя: " + arrayOfString[0] + "!");
                break;
            default:
                System.out.println("Упс! Кажется, что-то слишком сложное :(");

        }

    }
}
