package models;

public class PaymentDataModel {
    private String gender;
    private String documentype;
    private String country;
    private String department;
    private String city;

    public PaymentDataModel(String gender, String documentype, String country, String department, String city) {
        this.gender = gender;
        this.documentype = documentype;
        this.country = country;
        this.department = department;
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDocumentype() {
        return documentype;
    }

    public void setDocumentype(String documentype) {
        this.documentype = documentype;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
