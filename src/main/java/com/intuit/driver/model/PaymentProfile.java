package com.intuit.driver.model;

import java.util.List;

public class PaymentProfile {
    String panId;
    List<Account> accounts;

    public PaymentProfile() {
    }

    public String getPanId() {
        return panId;
    }

    public void setPanId(String panId) {
        this.panId = panId;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
