import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://www.nytimes.com/2022/02/25/science/venus-photos-nasa.html";
        Document doc = Jsoup.connect(url).get();
        File outputFile = new File("C:\\Users\\yotam\\Desktop\\output.html");
        FileWriter writer = new FileWriter("output.html");
        writer.write(new String(doc.html().getBytes(StandardCharsets.UTF_16)));
        writer.close();

        // extract the text from the class "css-axufdj evys1bk0" of the <p> element
    }


}
