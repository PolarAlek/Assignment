import java.util.HashMap;
import java.util.Map;

public class Storage {
    // Use to store Iban details to validate by
    HashMap<String, HashMap<String, String>> IbanCodes =
            new HashMap<String, HashMap<String, String>>(){{
                put("Albania", new HashMap<String, String>(){{
                    put("Code", "AL");
                    put("Length", "28");
                }});
                put("Andorra", new HashMap<String, String>(){{
                    put("Code", "AD");
                    put("Length", "24");
                }});
                put("Austria", new HashMap<String, String>(){{
                    put("Code", "AT");
                    put("Length", "20");
                }});
                put("Azerbaijan", new HashMap<String, String>(){{
                    put("Code", "AZ");
                    put("Length", "28");
                }});
                put("Bahrain", new HashMap<String, String>(){{
                    put("Code", "BH");
                    put("Length", "22");
                }});
                put("Belarus", new HashMap<String, String>(){{
                    put("Code", "BY");
                    put("Length", "28");
                }});
                put("Belgium", new HashMap<String, String>(){{
                    put("Code", "BE");
                    put("Length", "16");
                }});
                put("Bosnia and Herzegovina", new HashMap<String, String>(){{
                    put("Code", "BA");
                    put("Length", "20");
                }});
                put("Brazil", new HashMap<String, String>(){{
                    put("Code", "BR");
                    put("Length", "29");
                }});
                put("Bulgaria", new HashMap<String, String>(){{
                    put("Code", "BG");
                    put("Length", "22");
                }});
                put("Costa Rica", new HashMap<String, String>(){{
                    put("Code", "CR");
                    put("Length", "22");
                }});
                put("Croatia", new HashMap<String, String>(){{
                    put("Code", "HR");
                    put("Length", "21");
                }});
                put("Cyprus", new HashMap<String, String>(){{
                    put("Code", "CY");
                    put("Length", "28");
                }});
                put("Czech Republic", new HashMap<String, String>(){{
                    put("Code", "CZ");
                    put("Length", "24");
                }});
                put("Denmark", new HashMap<String, String>(){{
                    put("Code", "DK");
                    put("Length", "18");
                }});
                put("Dominican Republic", new HashMap<String, String>(){{
                    put("Code", "DO");
                    put("Length", "28");
                }});
                put("Egypt", new HashMap<String, String>(){{
                    put("Code", "EG");
                    put("Length", "29");
                }});
                put("El Salvador", new HashMap<String, String>(){{
                    put("Code", "SV");
                    put("Length", "28");
                }});
                put("Estonia", new HashMap<String, String>(){{
                    put("Code", "EE");
                    put("Length", "20");
                }});
                put("Faroe Islands", new HashMap<String, String>(){{
                    put("Code", "FO");
                    put("Length", "18");
                }});
                put("Finland", new HashMap<String, String>(){{
                    put("Code", "FI");
                    put("Length", "18");
                }});
                put("France", new HashMap<String, String>(){{
                    put("Code", "FR");
                    put("Length", "27");
                }});
                put("Georgia", new HashMap<String, String>(){{
                    put("Code", "GE");
                    put("Length", "22");
                }});
                put("Germany", new HashMap<String, String>(){{
                    put("Code", "DE");
                    put("Length", "22");
                }});
                put("Gibraltar", new HashMap<String, String>(){{
                    put("Code", "GI");
                    put("Length", "23");
                }});
                put("Greece", new HashMap<String, String>(){{
                    put("Code", "GR");
                    put("Length", "27");
                }});
                put("Greenland", new HashMap<String, String>(){{
                    put("Code", "GL");
                    put("Length", "18");
                }});
                put("Guatemala", new HashMap<String, String>(){{
                    put("Code", "GT");
                    put("Length", "28");
                }});
                put("Holy See (the)", new HashMap<String, String>(){{
                    put("Code", "VA");
                    put("Length", "22");
                }});
                put("Hungary", new HashMap<String, String>(){{
                    put("Code", "HU");
                    put("Length", "28");
                }});
                put("Iceland", new HashMap<String, String>(){{
                    put("Code", "IS");
                    put("Length", "26");
                }});
                put("Iraq", new HashMap<String, String>(){{
                    put("Code", "IQ");
                    put("Length", "23");
                }});
                put("Ireland", new HashMap<String, String>(){{
                    put("Code", "IE");
                    put("Length", "22");
                }});
                put("Israel", new HashMap<String, String>(){{
                    put("Code", "IR");
                    put("Length", "23");
                }});
                put("Italy", new HashMap<String, String>(){{
                    put("Code", "IT");
                    put("Length", "27");
                }});
                put("Jordan", new HashMap<String, String>(){{
                    put("Code", "JO");
                    put("Length", "30");
                }});
                put("Kazakhstan", new HashMap<String, String>(){{
                    put("Code", "KZ");
                    put("Length", "20");
                }});
                put("Kosovo", new HashMap<String, String>(){{
                    put("Code", "XK");
                    put("Length", "20");
                }});
                put("Kuwait", new HashMap<String, String>(){{
                    put("Code", "KW");
                    put("Length", "30");
                }});
                put("Latvia", new HashMap<String, String>(){{
                    put("Code", "LV");
                    put("Length", "21");
                }});
                put("Lebanon", new HashMap<String, String>(){{
                    put("Code", "LB");
                    put("Length", "28");
                }});
                put("Libya", new HashMap<String, String>(){{
                    put("Code", "LY");
                    put("Length", "25");
                }});
                put("Liechtenstein", new HashMap<String, String>(){{
                    put("Code", "LI");
                    put("Length", "21");
                }});
                put("Lithuania", new HashMap<String, String>(){{
                    put("Code", "LT");
                    put("Length", "20");
                }});
                put("Luxembourg", new HashMap<String, String>(){{
                    put("Code", "LU");
                    put("Length", "20");
                }});
                put("Malta", new HashMap<String, String>(){{
                    put("Code", "MT");
                    put("Length", "31");
                }});
                put("Mauritania", new HashMap<String, String>(){{
                    put("Code", "MR");
                    put("Length", "27");
                }});
                put("Mauritius", new HashMap<String, String>(){{
                    put("Code", "MU");
                    put("Length", "30");
                }});
                put("Moldova", new HashMap<String, String>(){{
                    put("Code", "MD");
                    put("Length", "24");
                }});
                put("Monaco", new HashMap<String, String>(){{
                    put("Code", "MC");
                    put("Length", "27");
                }});
                put("Montenegro", new HashMap<String, String>(){{
                    put("Code", "ME");
                    put("Length", "22");
                }});
                put("Netherlands", new HashMap<String, String>(){{
                    put("Code", "NL");
                    put("Length", "18");
                }});
                put("North Macedonia", new HashMap<String, String>(){{
                    put("Code", "MK");
                    put("Length", "19");
                }});
                put("Norway", new HashMap<String, String>(){{
                    put("Code", "NO");
                    put("Length", "15");
                }});
                put("Pakistan", new HashMap<String, String>(){{
                    put("Code", "PK");
                    put("Length", "24");
                }});
                put("Palestine", new HashMap<String, String>(){{
                    put("Code", "PS");
                    put("Length", "29");
                }});
                put("Poland", new HashMap<String, String>(){{
                    put("Code", "PL");
                    put("Length", "28");
                }});
                put("Portugal", new HashMap<String, String>(){{
                    put("Code", "PT");
                    put("Length", "25");
                }});
                put("Qatar", new HashMap<String, String>(){{
                    put("Code", "QA");
                    put("Length", "29");
                }});
                put("Romania", new HashMap<String, String>(){{
                    put("Code", "RO");
                    put("Length", "24");
                }});
                put("Saint Lucia", new HashMap<String, String>(){{
                    put("Code", "LC");
                    put("Length", "32");
                }});
                put("San Marino", new HashMap<String, String>(){{
                    put("Code", "SM");
                    put("Length", "27");
                }});
                put("Sao Tome and Principe", new HashMap<String, String>(){{
                    put("Code", "ST");
                    put("Length", "25");
                }});
                put("Saudi Arabia", new HashMap<String, String>(){{
                    put("Code", "SA");
                    put("Length", "24");
                }});
                put("Serbia", new HashMap<String, String>(){{
                    put("Code", "RS");
                    put("Length", "22");
                }});
                put("Seychelles", new HashMap<String, String>(){{
                    put("Code", "SC");
                    put("Length", "31");
                }});
                put("Slovak Republic", new HashMap<String, String>(){{
                    put("Code", "SK");
                    put("Length", "24");
                }});
                put("Slovenia", new HashMap<String, String>(){{
                    put("Code", "SI");
                    put("Length", "19");
                }});
                put("Spain", new HashMap<String, String>(){{
                    put("Code", "ES");
                    put("Length", "24");
                }});
                put("Sudan", new HashMap<String, String>(){{
                    put("Code", "SD");
                    put("Length", "18");
                }});
                put("Sweden", new HashMap<String, String>(){{
                    put("Code", "SE");
                    put("Length", "24");
                }});
                put("Switzerland", new HashMap<String, String>(){{
                    put("Code", "CH");
                    put("Length", "21");
                }});
                put("Timor-Leste", new HashMap<String, String>(){{
                    put("Code", "TL");
                    put("Length", "23");
                }});
                put("Tunisia", new HashMap<String, String>(){{
                    put("Code", "TN");
                    put("Length", "24");
                }});
                put("Turkey", new HashMap<String, String>(){{
                    put("Code", "TR");
                    put("Length", "26");
                }});
                put("Ukraine", new HashMap<String, String>(){{
                    put("Code", "UA");
                    put("Length", "29");
                }});
                put("United Arab Emirates", new HashMap<String, String>(){{
                    put("Code", "AE");
                    put("Length", "23");
                }});
                put("United Kingdom", new HashMap<String, String>(){{
                    put("Code", "GB");
                    put("Length", "22");
                }});
                put("Virgin Islands, British", new HashMap<String, String>(){{
                    put("Code", "VG");
                    put("Length", "24");
                }});
            }};

    public HashMap<String, String> GetIbanData (String Country) {
        // Fetch Iban details for a specified country
        HashMap<String, String> result = (HashMap) IbanCodes.get(Country);
        return result;
    }

}
