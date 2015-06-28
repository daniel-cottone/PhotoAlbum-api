package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.domain.entity.Account;
import com.brahalla.PhotoAlbum.model.json.AccountInfo;
import com.brahalla.PhotoAlbum.service.AccountService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
public class AccountController {

	@Autowired
	AccountService accountService;

	/* CREATE - create an account
	 * REQUEST: POST /api/accounts
	 */
  @RequestMapping(method = RequestMethod.POST)
  public Account createAccount(@Valid @RequestBody AccountInfo accountInfo) {
    return this.accountService.createAccount(accountInfo);
  }

	/* READ - read an account
	 * REQUEST: GET /api/accounts/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.GET)
  public Account getAccountById(@PathVariable("id") Long id) {
    return this.accountService.getAccountById(id);
  }

	/* READ - read a list of accounts
	 * REQUEST: GET /api/accounts
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Account> getAccountList(Long albumId) {
		return this.accountService.getAccountList();
	}

	/* UPDATE - update an account
	 * REQUEST: PUT /api/accounts/{id}
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
  public Account updateAccount(@PathVariable("id") Long id, @Valid @RequestBody AccountInfo accountInfo) {
    return this.accountService.updateAccount(id, accountInfo);
  }

	/* DELETE - delete an account
	 * REQUEST: DELETE /api/accounts/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  public Account deleteAccount(@PathVariable("id") Long id) {
    return this.accountService.deleteAccount(id);
  }

}
