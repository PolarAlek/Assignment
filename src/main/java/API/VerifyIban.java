package API;

import API.Storage;

import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class VerifyIban {
    public String Verify(String IbanNumber, String Country) {

        // Verify that Iban Number and Country have been provided as input
        if (IbanNumber == null) {
            return "Missing IbanNumber";
        };
        if (Country == null) {
            return "Missing Country";
        };

        // Retrieve the Iban details
        Storage str = new Storage();
        HashMap<String, String> CountryDetails = str.GetIbanData(Country);

        // If no details fetched means the entity is not supported
        if (CountryDetails == null) {
            return "Country is not supported";
        };

        // Extract the parameters
        String CountryCode = (String) CountryDetails.get("Code");
        Integer CountryLength;
        CountryLength = (Integer) parseInt(CountryDetails.get("Length"));

        // Test the conditions separately so error reporting can be improved if necessary
        if (IbanNumber.length() != CountryLength) {
            return "Iban Number is invalid";
        }
        if (!IbanNumber.startsWith(CountryCode)) {
            return "Iban Number is invalid";
        };

        // Confirm the Iban is valid
        return "Iban Number is valid";
    }
}
