package models;

//data for implementation of the login feature
public class LoginModel {
    private String document;
    private String password;

    public LoginModel(String document, String password) {
        this.document = document;
        this.password = password;
    }

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
