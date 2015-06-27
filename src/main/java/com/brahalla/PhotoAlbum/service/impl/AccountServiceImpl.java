package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.AccountRepository;
import com.brahalla.PhotoAlbum.domain.entity.Account;
import com.brahalla.PhotoAlbum.domain.factory.AccountFactory;
import com.brahalla.PhotoAlbum.model.json.AccountInfo;
import com.brahalla.PhotoAlbum.service.AccountService;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

  @Override
	@Transactional
  public Account createAccount(AccountInfo accountInfo) {
		Account account = AccountFactory.createAccount(accountInfo);
    return this.accountRepository.save(account);
  }

  @Override
  public Account getAccountById(Long id) {
    return this.accountRepository.findOne(id);
  }

  @Override
  public List<Account> getAccountList() {
    return (List<Account>) this.accountRepository.findAll();
  }

	@Override
	@Transactional
	public Account updateAccount(Long id, AccountInfo accountInfo) {
		Account account = this.accountRepository.findOne(id);
		BeanUtils.copyProperties(accountInfo, account);
		return this.accountRepository.save(account);
	}

  @Override
	@Transactional
  public Account deleteAccount(Long id) {
    this.accountRepository.delete(id);
		return new Account();
  }

}
