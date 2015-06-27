package com.brahalla.PhotoAlbum.domain.factory;

import com.brahalla.PhotoAlbum.domain.entity.Account;
import com.brahalla.PhotoAlbum.model.json.AccountInfo;

public class AccountFactory {

  public static Account createAccount(AccountInfo accountInfo) {
    return new Account(
      accountInfo.getUsername(),
      accountInfo.getPassword()
    );
  }

}
