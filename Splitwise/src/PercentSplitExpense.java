import java.util.List;
import java.util.Map;

public class PercentSplitExpense extends Expense {
    PercentSplitExpense(User payee, double totalAmount, Map<User, Double> userPercentMap) {
        for(Map.Entry entry: userPercentMap.entrySet()) {
            usersDue.put((User) entry.getKey(), (Double) entry.getValue()/100.0 *totalAmount);
        }
        this.payee = payee;
        this.totalAmount = totalAmount;
    }
}
