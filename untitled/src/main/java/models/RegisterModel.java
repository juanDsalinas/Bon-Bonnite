package models;

public class RegisterModel {
    private String document;
    private String email;
    private String password;

    public RegisterModel(String document, String email, String password) {
        this.document = document;
        this.email = email;
        this.password = password;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
