import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class customerRecordsManager {


    private static String readUrl(String urlString) throws Exception {

        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder buffer = new StringBuilder();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1) {
                buffer.append(chars, 0, read);
            }
            return buffer.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }


    }

    public static void main(String[] args) throws Exception {

        customerRecordsManager manager = new customerRecordsManager();
        String url = manager.readUrl("https://www.w3schools.com/angular/customers.php");

        Gson gson = new Gson();
        customerRecords Record = gson.fromJson(url, customerRecords.class);

        // System.out.println(gson.toJson(Record));

        System.out.println("-----------------  Customer Info ------------------");
        for (int i = 0; i < Record.getRecords().size(); i++) {
            System.out.print("Customer " + i + " ==> ");
            System.out.print(Record.getRecords().get(i));

        }



    }
}
