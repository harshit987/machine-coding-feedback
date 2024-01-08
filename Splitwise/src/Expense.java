import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Expense {
    User payee;
    double totalAmount;
    Map<User, Double> usersDue = new HashMap<>();
    public User getPayee() {
        return payee;
    }

    Map<User, Double> getSplits() {
        return usersDue;
    }

    @Override
    public String toString() {
        String s = "payee " + payee.id + " borrowers: ";
        for(User user : usersDue.keySet()) {
            s += user.id + " " + usersDue.get(user) + ", ";
        }
        s += "\n";
        return s;
    }
}
