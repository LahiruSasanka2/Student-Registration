package lk.ijse.sr.entity;

public class Batch extends SuperEntity {
    private String bid;
    private String cid;
    private String batchNumber;
    private String startDate;
    private String endDate;

    public Batch() {
    }

    public Batch(String bid, String cid, String batchNumber, String startDate, String endDate) {
        this.bid = bid;
        this.cid = cid;
        this.batchNumber = batchNumber;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
