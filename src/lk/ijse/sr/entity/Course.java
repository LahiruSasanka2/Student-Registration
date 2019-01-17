package lk.ijse.sr.entity;

public class Course extends SuperEntity{

    private String cid;
    private String name;
    private String duration;
    private double price;
    private String discountAmount;
    private String subject;

    public Course() {
    }

    public Course(String cid, String name, String duration, double price, String discountAmount, String subject) {
        this.cid = cid;
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.discountAmount = discountAmount;
        this.subject = subject;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
