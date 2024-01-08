import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitwiseService {
    Map<String, User> users = new HashMap<>();
    List<Expense> expenses = new ArrayList<>();
    void addUser(User user) {
        users.put(user.id, user);
    }

    void addExpense(Expense expense) {
        expenses.add(expense);
        User payee = expense.payee;
        Map<User, Double> amountDueMap = expense.getSplits();
        for (Map.Entry entry: amountDueMap.entrySet()) {
            User borrower = (User) entry.getKey();
            if(borrower.equals(payee))
                continue;
            Double borrowedAmount = (double) entry.getValue();
            payee.balance.update(borrower, borrowedAmount);
            borrower.balance.update(payee, -borrowedAmount);
        }
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    List<Expense> getExpensesByUser(String userId) {
        User user = users.get(userId);
        List<Expense> expenseList = new ArrayList<>();
        for(Expense expense: expenses) {
            if(expense.payee == user || expense.usersDue.keySet().contains(user)) {
                expenseList.add(expense);
            }
        }
        return expenseList;
    }
}
