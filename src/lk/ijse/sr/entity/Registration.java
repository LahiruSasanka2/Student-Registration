package lk.ijse.sr.entity;

public class Registration extends SuperEntity{

    private String sid;
    private String bid;
    private String pid;
    private String date;
    private String time;

    public Registration() {
    }

    public Registration(String sid, String bid, String pid, String date, String time) {
        this.sid = sid;
        this.bid = bid;
        this.pid = pid;
        this.date = date;
        this.time = time;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
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
}
