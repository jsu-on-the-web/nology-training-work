package src.ChallengeTen;

public class Landline extends Phone {
    public String phoneNumber;
    public String address;

    public Landline(String phoneNumber, String address) {
        setPhoneNumber(phoneNumber);
        setAddress(address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() < 0) {
            throw new IllegalArgumentException("Address cannot be empty");
        } else {
            this.address = address;
        }
    }

    @Override
    public String getInfo() {
        return "Landline number: " + getPhoneNumber() + "\nAddress: " + getAddress() + "\n";
    }
    
}
