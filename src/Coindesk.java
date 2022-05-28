import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Coindesk {
    public static void main(String[] args) {

        try {
           URL urlToCoindesk = new URL("https://api.coindesk.com/v1/bpi/currentprice.json");

            HttpURLConnection connection = (HttpURLConnection) urlToCoindesk.openConnection();
            connection.setRequestMethod("GET");

            int code = connection.getResponseCode();
            if (code == 200) {
                InputStream in = connection.getInputStream();
                byte[] bytesIn = new byte[connection.getContentLength()];
                in.read(bytesIn);
                String messageIn = new String(bytesIn, StandardCharsets.UTF_8);
                System.out.println(messageIn);
//                посимвольное считывание
//                InputStreamReader in = new InputStreamReader(connection.getInputStream());
//                int i = in.read();
//                while (i != -1){
//                    System.out.println((char)i);
//                    i = in.read();
//                }
                in.close();

            } else {
                System.out.printf("code of response: %d", code);
            }

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
