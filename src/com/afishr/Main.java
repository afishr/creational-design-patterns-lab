package com.afishr;

import com.afishr.entities.AccountEntity;
import com.afishr.entities.MoneyEntity;
import com.afishr.patterns.AccountEntityFactory;
import com.afishr.patterns.AccountsStore;

public class Main {

	public static void main(String[] args) {
		/* Simple Factory design pattern */
		AccountEntity a = AccountEntityFactory.makeAccountEntity("alex", 100d);

		/* Singleton design pattern */
		AccountsStore store = AccountsStore.getInstance();
		store.add(a);

		/* Prototype design pattern*/
		store.add(a.copy("julia"));

		/* ... */

		AccountEntity alex = store.getAccountById("alex");
		AccountEntity julia = store.getAccountById("julia");


		alex.withdraw(MoneyEntity.of(50), julia.getId());
		julia.deposit(MoneyEntity.of(50), alex.getId());

		System.out.println(alex.calculateBalance().getAmount());
		System.out.println(julia.calculateBalance().getAmount());


	}
}
