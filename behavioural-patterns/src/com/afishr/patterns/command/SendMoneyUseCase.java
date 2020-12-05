package com.afishr.patterns.command;

public class SendMoneyUseCase {
 public void submit(SendMoneyCommand command) {
    command.execute();
  }
}
