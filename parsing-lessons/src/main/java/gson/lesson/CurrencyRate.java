package gson.lesson;

import com.google.gson.annotations.SerializedName;

public class CurrencyRate {
    @SerializedName("ccy")
    private String from;
    @SerializedName("base_ccy")
    private String to;
    private String buy;
    private String sale;


    public CurrencyRate(){}

    public CurrencyRate(String from, String to, String buy, String sale) {
        this.from = from;
        this.to = to;
        this.buy = buy;
        this.sale = sale;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", buy='" + buy + '\'' +
                ", sale='" + sale + '\'' +
                '}';
    }
}
