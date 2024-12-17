import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        Scanner scanner = new Scanner(System.in);

        try {
            // Ladataan JSON-tiedosto verkosta
            URL url = new URL("https://aivopieru.net/greetings.json");
            URLConnection connection = url.openConnection();
            InputStreamReader reader = new InputStreamReader(connection.getInputStream());

            // Parsitaan JSON
            Object obj = parser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;

            // Näytetään kielivalinnat numeroituna
            System.out.println("Valitse kieli:");
            int i = 1;
            for (Object key : jsonObject.keySet()) {
                System.out.println(i + ". " + key);
                i++;
            }

            // Käyttäjän valinta
            int choice = scanner.nextInt();

            // Näytetään valittu tervehdyksen kieli
            if (choice > 0 && choice <= jsonObject.size()) {
                String selectedLanguage = (String) jsonObject.keySet().toArray()[choice - 1];
                System.out.println(selectedLanguage + ": " + jsonObject.get(selectedLanguage));
            } else {
                System.out.println("Virheellinen valinta.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
