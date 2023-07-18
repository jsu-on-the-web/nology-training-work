package src.ChallengeTen;

public class Mobile extends Phone {
    public String phoneNumber;

    public Mobile(String phoneNumber) {
        setPhoneNumber(phoneNumber);
    }


    @Override 
    public String getInfo() {
        return "Mobile phone number: " + getPhoneNumber() + "\n";
    }

    public void text(Mobile mobile, String message) {
        System.out.printf("Texting %s with the message \"%s\" %n", mobile.getPhoneNumber(), message);
    }
}
