package src.ChallengeTen;

public abstract class Phone {
    
    public String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void call(Phone phone) {
        System.out.println("Calling " + phone.getPhoneNumber() + '\n');
    }

    public abstract String getInfo();
}
