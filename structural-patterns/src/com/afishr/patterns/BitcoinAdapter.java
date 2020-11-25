package com.afishr.patterns;

import com.afishr.domain.BitcoinEntity;
import com.afishr.domain.MoneyEntity;

public class BitcoinAdapter extends MoneyEntity {
  BitcoinEntity bitcoin;

  public BitcoinAdapter(BitcoinEntity bitcoin) {
    super(bitcoin.calculateHashAmount());
  }

  @Override
  public double getAmount() {
    return bitcoin.calculateHashAmount();
  }
}
