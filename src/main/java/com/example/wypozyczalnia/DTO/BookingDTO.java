package com.example.wypozyczalnia.DTO;


public class BookingDTO {
    private Long branch_id;
    private String town;
    private String fromDate;
    private String toDate;
    private Long selectedCarId;

    public BookingDTO() {
        System.out.println("branchDto object created");
    }

    public Long getSelectedCarId() {
        return selectedCarId;
    }

    public void setSelectedCarId(Long selectedCarId) {
        this.selectedCarId = selectedCarId;
    }

    public Long getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(Long branch_id) {
        System.out.println("DTO branch_id = " +branch_id);
        this.branch_id = branch_id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        System.out.println("DTO town = " +town);
        this.town = town;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
}
