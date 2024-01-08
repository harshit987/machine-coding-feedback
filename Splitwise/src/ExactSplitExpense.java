import java.util.List;
import java.util.Map;

public class ExactSplitExpense extends Expense {
    ExactSplitExpense(User payee, double totalAmount, Map<User, Double> userDueMap) {
        this.usersDue = userDueMap;
        this.payee = payee;
        this.totalAmount = totalAmount;
    }
}
