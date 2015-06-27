package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.domain.entity.Account;
import com.brahalla.PhotoAlbum.model.json.AccountInfo;

import java.util.List;

public interface AccountService {

  public Account createAccount(AccountInfo accountInfo);

  public Account getAccountById(Long id);

  public List<Account> getAccountList();

  public Account updateAccount(Long id, AccountInfo accountInfo);

  public Account deleteAccount(Long id);

}
