package org.splitwise.splitwise.impl;

import org.splitwise.splitwise.api.Expenses;
import org.splitwise.splitwise.model.ExpenseRequest;
import org.springframework.stereotype.Controller;

import javax.ws.rs.core.Response;

@Controller
public class ExpensesImpl implements Expenses {

    @Override
    public Response addExpense(ExpenseRequest request) {
        return null;
    }
}
