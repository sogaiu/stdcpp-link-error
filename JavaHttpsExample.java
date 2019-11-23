// modified: https://alvinalexander.com/blog/post/java/simple-https-example
import java.net.URL;
import java.io.*;
import javax.net.ssl.HttpsURLConnection;

public class JavaHttpsExample
{
    public static void main(String[] args) throws Exception {
        String httpsURL = "https://www.clojure.org/";
        URL myUrl = new URL(httpsURL);
        HttpsURLConnection conn = (HttpsURLConnection)myUrl.openConnection();
        InputStream is = conn.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String inputLine;
        while ((inputLine = br.readLine()) != null) {
            System.out.println(inputLine);
        }
        br.close();
    }
}
