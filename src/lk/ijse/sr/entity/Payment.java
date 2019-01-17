package lk.ijse.sr.entity;

public class Payment extends SuperEntity{

    private String pid;
    private String date;
    private String time;
    private double price;
    private double payAmount;
    private double fullAmount;

    public Payment() {
    }

    public Payment(String pid, String date, String time, double price, double payAmount, double fullAmount) {
        this.pid = pid;
        this.date = date;
        this.time = time;
        this.price = price;
        this.payAmount = payAmount;
        this.fullAmount = fullAmount;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public double getFullAmount() {
        return fullAmount;
    }

    public void setFullAmount(double fullAmount) {
        this.fullAmount = fullAmount;
    }
}
