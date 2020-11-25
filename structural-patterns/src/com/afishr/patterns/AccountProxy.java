package com.afishr.patterns;

import com.afishr.domain.AccountEntity;
import com.afishr.domain.ActivityWindowEntity;
import com.afishr.domain.MoneyEntity;

public class AccountProxy extends AccountEntity {
  public AccountEntity account;
  public AccountProxy(AccountEntity account, String id, MoneyEntity baseLineBalance, ActivityWindowEntity activityWindow) {
    super(id, baseLineBalance, activityWindow);
    this.account = account;
  }

  @Override
  public boolean withdraw(MoneyEntity money, String targetAccountId) {
    System.out.println("Making secret security checks here...");
    return withdraw(money, targetAccountId);
  }
}
