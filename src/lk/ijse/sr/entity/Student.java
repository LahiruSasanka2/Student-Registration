package lk.ijse.sr.entity;

public class Student extends SuperEntity{

    private String sid;
    private String name;
    private String tell;
    private String city;
    private String nic;

    public Student() {
    }

    public Student(String sid, String name, String tell, String city, String nic) {
        this.sid = sid;
        this.name = name;
        this.tell = tell;
        this.city = city;
        this.nic = nic;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}
