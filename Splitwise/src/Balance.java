import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Balance {
    Map<User, Double> amountDue;

    Balance() {
        amountDue = new HashMap<>();
    }

    void update(User user, double changeByAmount) {
        amountDue.put(user, amountDue.getOrDefault(user, 0.0d) + changeByAmount);
    }
}
