package comm2;

public class Call {
	private String phoneNumber;
    private int duration;
 
    public Call(String phoneNumber, int duration) {
        this.phoneNumber = phoneNumber;
        this.duration = duration;
    }
 
    @Override
    public String toString() {
        return "Called: " + phoneNumber + ", Duration: " + duration + " sec";
    }
 
 
}
