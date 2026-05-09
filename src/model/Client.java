package model;

public class Client {

    private int clientId;
    private String clientName;
    private String companyName;
    private String phone;
    private String email;
    private String address;

    public Client() {
    }

    public Client(int clientId, String clientName, String companyName,
                  String phone, String email, String address) {

        this.clientId = clientId;
        this.clientName = clientName;
        this.companyName = companyName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}