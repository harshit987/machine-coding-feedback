public class User {
    String id;
    int number;
    String name;
    String emailId;
    Balance balance;

    public User(String id, String name, String emailId, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.emailId  = emailId;
        this.number = phoneNumber;
        balance = new Balance();
    }

    public void showBalance() {
        for (User user: balance.amountDue.keySet()) {
            if (balance.amountDue.get(user) > 0 )
                System.out.println(user.id + " owes " + this.id + " " + balance.amountDue.get(user));
            else
                System.out.println(this.id + " owes " + user.id + " " + -1*balance.amountDue.get(user));
        }
    }
}
