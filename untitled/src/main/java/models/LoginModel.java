package models;

public class LoginModel {
    // mapeo de los datos del datatable
    private String document;
    private String password;

    // constructor
    public LoginModel(String document, String password) {
        this.document = document;
        this.password = password;
    }


    // getters and setters para acceder a los datos del datatable
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
