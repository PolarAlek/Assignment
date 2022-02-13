import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

import static spark.Spark.get;

public class UTest {
    @Test
    public void Positive() throws InterruptedException {
        VerifyIban Verification = new VerifyIban();
        get("/verifyIban",
                ((request, response) -> Verification.Verify(request.queryParams("iban"), request.queryParams("country"))));
        StringBuilder response = new StringBuilder();
        String theUrl = "http://localhost:4567/verifyIban?iban=MK1234320987645tr36&country=North%20Macedonia";
        Thread.sleep(3000);
        try {
            URL url = new URL(theUrl);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
           String line;
            while ((line = bufferedReader.readLine()) != null) {
                response.append(line + "\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
        Assertions.assertEquals("Iban Number is valid\n", response.toString());
    }

    @Test
    public void MissingCountry() throws InterruptedException {
        VerifyIban Verification = new VerifyIban();
        get("/verifyIban",
                ((request, response) -> Verification.Verify(request.queryParams("iban"), request.queryParams("country"))));
        StringBuilder response = new StringBuilder();
        String theUrl = "http://localhost:4567/verifyIban?iban=MK1234320987645tr36";
        Thread.sleep(3000);
        try {
            URL url = new URL(theUrl);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                response.append(line + "\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("Missing Country\n", response.toString());
    }

    @Test
    public void UnsupportedCountry() throws InterruptedException {
        VerifyIban Verification = new VerifyIban();
        get("/verifyIban",
                ((request, response) -> Verification.Verify(request.queryParams("iban"), request.queryParams("country"))));
        StringBuilder response = new StringBuilder();
        String theUrl = "http://localhost:4567/verifyIban?iban=MK1234320987645tr36&country=Artic";
        Thread.sleep(3000);
        try {
            URL url = new URL(theUrl);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                response.append(line + "\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("Country is not supported\n", response.toString());
    }

    @Test
    public void Invalid() throws InterruptedException {
        VerifyIban Verification = new VerifyIban();
        get("/verifyIban",
                ((request, response) -> Verification.Verify(request.queryParams("iban"), request.queryParams("country"))));
        StringBuilder response = new StringBuilder();
        String theUrl = "http://localhost:4567/verifyIban?iban=MK1234320987645r36&country=North%20Macedonia";
        Thread.sleep(3000);
        try {
            URL url = new URL(theUrl);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                response.append(line + "\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("Iban Number is invalid\n", response.toString());
    }
}
