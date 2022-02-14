package API;

import static spark.Spark.*;


public class Main {
    public static void main(String[] args) {
        VerifyIban Verification = new VerifyIban();

        // Enable the service
        get("/verifyIban",
                ((request, response) -> Verification.Verify(request.queryParams("iban"), request.queryParams("country"))));
    }
}

