package com.afishr;

import com.afishr.domain.AccountEntity;
import com.afishr.domain.ActivityEntity;
import com.afishr.domain.ActivityWindowEntity;
import com.afishr.domain.MoneyEntity;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    AccountEntity alex = new AccountEntity(
      "alex",
      MoneyEntity.of(100),
      new ActivityWindowEntity(new ArrayList<>())
    );

    AccountEntity alice = new AccountEntity(
      "alice",
      MoneyEntity.of(50),
      new ActivityWindowEntity(new ArrayList<>())
    );

    System.out.println("Before accounts state: ");
    logAccountState(alex);
    logAccountState(alice);

    transferMoney(alex, alice, 50d);

    System.out.println("After accounts state: ");
    logAccountState(alex);
    logAccountState(alice);
  }

  public static void logAccountState(AccountEntity account) {
    System.out.print(account.getId() + ": ");
    System.out.println(account.calculateBalance().getAmount());
  }

  public static void transferMoney(AccountEntity sourceAccount, AccountEntity targetAccount, Double amount) {
    sourceAccount.withdraw(MoneyEntity.of(amount), targetAccount.getId());
    targetAccount.deposit(MoneyEntity.of(amount), sourceAccount.getId());
  }

}

