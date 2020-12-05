package com.afishr.patterns.command;

import com.afishr.domain.AccountEntity;
import com.afishr.domain.MoneyEntity;

public class SendMoneyCommand implements ICommand {
  AccountEntity sourceAccount;
  AccountEntity targetAccount;
  MoneyEntity money;

  public SendMoneyCommand(AccountEntity sourceAccount, AccountEntity targetAccount, MoneyEntity money) {
    this.sourceAccount = sourceAccount;
    this.targetAccount = targetAccount;
    this.money = money;
  }

  @Override
  public void execute() {
    sourceAccount.withdraw(money, targetAccount.getId());
    targetAccount.deposit(money, sourceAccount.getId());
  }
}
