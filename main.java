import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;

public class main {

    private static int String;

    public static void main(String[] args) throws IOException, InterruptedException {

        String url = "https://v6.exchangerate-api.com/v6/a200d049985a4389994997eb/latest/USD";

        String rateInformation;

        float amount;

        String currencyName;

        Map<String, String> countryMap = new HashMap<String, String>();
        countryMap.put("UAE Dirham","AED");
        countryMap.put("Afghan Afghani","AFN");
        countryMap.put("Albanian Lek","ALL");
        countryMap.put("Armenian Dram","AMD");
        countryMap.put("Netherlands Antillian Guilder","ANG");
        countryMap.put("Angolan Kwanza","AOA");
        countryMap.put("Argentine Peso","ARS");
        countryMap.put("Australian Dollar","AUD");
        countryMap.put("Aruban Florin","AWG");
        countryMap.put("Azerbaijani Manat","AZN");
        countryMap.put("Bosnia and Herzegovina Mark","BAM");
        countryMap.put("Barbados Dollar","BBD");
        countryMap.put("Bangladeshi Taka","BDT");
        countryMap.put("Bulgarian Lev","BGN");
        countryMap.put("Bahraini Dinar","BHD");
        countryMap.put("Burundian Franc","BIF");
        countryMap.put("Bermudian Dollar","BMD");
        countryMap.put("Brunei Dollar","BND");
        countryMap.put("Bolivian Boliviano","BOB");
        countryMap.put("Brazilian Real","BRL");
        countryMap.put("Bahamian Dollar","BSD");
        countryMap.put("Bhutanese Ngultrum","BTN");
        countryMap.put("Botswana Pula","BWP");
        countryMap.put("Belarusian Ruble","BYN");
        countryMap.put("Belize Dollar","BZD");
        countryMap.put("Canadian Dollar","CAD");
        countryMap.put("Congolese Franc","CDF");
        countryMap.put("Swiss Franc","CHF");
        countryMap.put("Chilean Peso","CLP");
        countryMap.put("Chinese Renminbi","CNY");
        countryMap.put("Colombian Peso","COP");
        countryMap.put("Costa Rican Colon","CRC");
        countryMap.put("Cuban Peso","CUP");
        countryMap.put("Cape Verdean Escudo","CVE");
        countryMap.put("Czech Koruna","CZK");
        countryMap.put("Djiboutian Franc","DJF");
        countryMap.put("Danish Krone","DKK");
        countryMap.put("Dominican Peso","DOP");
        countryMap.put("Algerian Dinar","DZD");
        countryMap.put("Egyptian Pound","EGP");
        countryMap.put("Eritrean Nakfa","ERN");
        countryMap.put("Ethiopian Birr","ETB");
        countryMap.put("Euro","EUR");
        countryMap.put("Fiji Dollar","FJD");
        countryMap.put("Falkland Islands Pound","FKP");
        countryMap.put("Faroese Króna","FOK");
        countryMap.put("Pound Sterling","GBP");
        countryMap.put("Georgian Lari","GEL");
        countryMap.put("Guernsey Pound","GGP");
        countryMap.put("Ghanaian Cedi","GHS");
        countryMap.put("Gibraltar Pound","GIP");
        countryMap.put("Gambian Dalasi","GMD");
        countryMap.put("Guinean Franc","GNF");
        countryMap.put("Guatemalan Quetzal","GTQ");
        countryMap.put("Guyanese Dollar","GYD");
        countryMap.put("Hong Kong Dollar","HKD");
        countryMap.put("Honduran Lempira","HNL");
        countryMap.put("Croatian Kuna","HRK");
        countryMap.put("Haitian Gourde","HTG");
        countryMap.put("Hungarian Forint","HUF");
        countryMap.put("Indonesian Rupiah","IDR");
        countryMap.put("Israeli New Shekel","ILS");
        countryMap.put("Manx Pound","IMP");
        countryMap.put("Indian Rupee","INR");
        countryMap.put("Iraqi Dinar","IQD");
        countryMap.put("Iranian Rial","IRR");
        countryMap.put("Icelandic Króna","ISK");
        countryMap.put("Jersey Pound","JEP");
        countryMap.put("Jamaican Dollar","JMD");
        countryMap.put("Jordanian Dinar","JOD");
        countryMap.put("Japanese Yen","JPY");
        countryMap.put("Kenyan Shilling","KES");
        countryMap.put("Kyrgyzstani Som","KGS");
        countryMap.put("Cambodian Riel","KHR");
        countryMap.put("Kiribati Dollar","KID");
        countryMap.put("Comorian Franc","KMF");
        countryMap.put("South Korean Won","KRW");
        countryMap.put("Kuwaiti Dinar","KWD");
        countryMap.put("Cayman Islands Dollar","KYD");
        countryMap.put("Kazakhstani Tenge","KZT");
        countryMap.put("Lao Kip","LAK");
        countryMap.put("Lebanese Pound","LBP");
        countryMap.put("Sri Lanka Rupee","LKR");
        countryMap.put("Liberian Dollar","LRD");
        countryMap.put("Lesotho Loti","LSL");
        countryMap.put("Libyan Dinar","LYD");
        countryMap.put("Moroccan Dirham","MAD");
        countryMap.put("Moldovan Leu","MDL");
        countryMap.put("Malagasy Ariary","MGA");
        countryMap.put("Macedonian Denar","MKD");
        countryMap.put("Burmese Kyat","MMK");
        countryMap.put("Mongolian Tögrög","MNT");
        countryMap.put("Macanese Pataca","MOP");
        countryMap.put("Mauritanian Ouguiya","MRU");
        countryMap.put("Mauritian Rupee","MUR");
        countryMap.put("Maldivian Rufiyaa","MVR");
        countryMap.put("Malawian Kwacha","MWK");
        countryMap.put("Mexican Peso","MXN");
        countryMap.put("Malaysian Ringgit","MYR");
        countryMap.put("Mozambican Metical","MZN");
        countryMap.put("Namibian Dollar","NAD");
        countryMap.put("Nigerian Naira","NGN");
        countryMap.put("Nicaraguan Córdoba","NIO");
        countryMap.put("Norwegian Krone","NOK");
        countryMap.put("Nepalese Rupee","NPR");
        countryMap.put("New Zealand Dollar","NZD");
        countryMap.put("Omani Rial","OMR");
        countryMap.put("Panamanian Balboa","PAB");
        countryMap.put("Peruvian Sol","PEN");
        countryMap.put("Papua New Guinean Kina","PGK");
        countryMap.put("Philippine Peso","PHP");
        countryMap.put("Pakistani Rupee","PKR");
        countryMap.put("Polish Złoty","PLN");
        countryMap.put("Paraguayan Guaraní","PYG");
        countryMap.put("Qatari Riyal","QAR");
        countryMap.put("Romanian Leu","RON");
        countryMap.put("Serbian Dinar","RSD");
        countryMap.put("Russian Ruble","RUB");
        countryMap.put("Rwandan Franc","RWF");
        countryMap.put("Saudi Riyal","SAR");
        countryMap.put("Solomon Islands Dollar","SBD");
        countryMap.put("Seychellois Rupee","SCR");
        countryMap.put("Sudanese Pound","SDG");
        countryMap.put("Swedish Krona","SEK");
        countryMap.put("Singapore Dollar","SGD");
        countryMap.put("Saint Helena Pound","SHP");
        countryMap.put("Sierra Leonean Leone","SLE");
        countryMap.put("Somali Shilling","SOS");
        countryMap.put("Surinamese Dollar","SRD");
        countryMap.put("South Sudanese Pound","SSP");
        countryMap.put("São Tomé and Príncipe Dobra","STN");
        countryMap.put("Syrian Pound","SYP");
        countryMap.put("Eswatini Lilangeni","SZL");
        countryMap.put("Thai Baht","THB");
        countryMap.put("Tajikistani Somoni","TJS");
        countryMap.put("Turkmenistan Manat","TMT");
        countryMap.put("Tunisian Dinar","TND");
        countryMap.put("Tongan Paʻanga","TOP");
        countryMap.put("Turkish Lira","TRY");
        countryMap.put("Trinidad and Tobago Dollar","TTD");
        countryMap.put("Tuvaluan Dollar","TVD");
        countryMap.put("New Taiwan Dollar","TWD");
        countryMap.put("Tanzanian Shilling","TZS");
        countryMap.put("Ukrainian Hryvnia","UAH");
        countryMap.put("Ugandan Shilling","UGX");
        countryMap.put("United States Dollar","USD");
        countryMap.put("Uruguayan Peso","UYU");
        countryMap.put("Uzbekistani So'm","UZS");
        countryMap.put("Venezuelan Bolívar Soberano","VES");
        countryMap.put("Vietnamese Đồng","VND");
        countryMap.put("Vanuatu Vatu","VUV");
        countryMap.put("Samoan Tālā","WST");
        countryMap.put("Central African CFA Franc","XAF");
        countryMap.put("East Caribbean Dollar","XCD");
        countryMap.put("Special Drawing Rights","XDR");
        countryMap.put("West African CFA franc","XOF");
        countryMap.put("CFP Franc","XPF");
        countryMap.put("Yemeni Rial","YER");
        countryMap.put("South African Rand","ZAR");
        countryMap.put("Zambian Kwacha","ZMW");
        countryMap.put("Zimbabwean Dollar","ZWL");

        Scanner reader = new Scanner(System.in);

        System.out.println("Currency conversor");

        while (true) {

            try {

                System.out.println("\n Please choose a Currency name of the next list");

                var countryList = countryMap.keySet().stream().toList();

                for (java.lang.String s : countryList) {

                    System.out.println("Currency: " + s);

                }

                Scanner readerLine = new Scanner(System.in);

                System.out.println("\n Enter a Currency name: ");

                currencyName = readerLine.nextLine();

                System.out.println("Enter the amount of Dollars to be convert: ");

                amount = reader.nextFloat();

                Map<String, Float> mapCurrency = new HashMap<String, Float>();

                httpClient client = new httpClient(url);

                rateInformation = (java.lang.String) client.connection();

                httpRequest countries = new Gson().fromJson(rateInformation, httpRequest.class);

                mapCurrency = countries.conversion_rates();

                System.out.println("Waiting...\n");

                var calculatorExchange = new CalculatorExhange(amount, mapCurrency.get(countryMap.get(currencyName)), currencyName);

                System.out.println("Name: " + calculatorExchange.getName());

                System.out.println("Currency conversion (real time): " + calculatorExchange.getCurrencyExchange());

                System.out.println("Exchange Result: " + calculatorExchange.getResultConvertion());

                System.out.println("Enter ESC to exit: ");

                Scanner scOption = new Scanner(System.in);

                String exitOption = scOption.nextLine();

                String cleanExitOption = exitOption.toUpperCase();

                if (cleanExitOption.equals("ESC")) {
                    break;
                }

            } catch (Exception e){

                System.out.println("Verify the data provided");
            }

        }


    }



}
