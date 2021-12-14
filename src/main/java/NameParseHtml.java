import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
public class NameParseHtml {


    public static void main( String[] args ) throws IOException{
        Document doc = (Document) Jsoup.connect("https://ru.wikipedia.org/wiki/Чапаев,_Василий_Иванович").get();
        String title = doc.title();
        System.out.println("Title : " + title);
    }
}
