
public class CalculatorExhange {

    private float currencyExchange;
    private String name;
    private float amount;
    private float resultConversion;



    public CalculatorExhange(float amount,float currencyExchange, String name) {
        this.amount = amount;
        this.currencyExchange = currencyExchange;
        this.name = name;
        resultConversion = currencyExchange * amount;
    }

    public float getResultConvertion() {
        return resultConversion;
    }

    public float getCurrencyExchange() {
        return currencyExchange;
    }

    public String getName() {
        return name;
    }
}



