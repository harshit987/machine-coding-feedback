import java.util.List;

public class EqualSplitExpense extends Expense {
    EqualSplitExpense(User payee, double totalAmount, List<User> usersInvolved) {
        int n = 1 + usersInvolved.size();
        this.payee = payee;
        double split = totalAmount/n;
        for(User user: usersInvolved) {
            usersDue.put(user, split);
        }
    }
}
