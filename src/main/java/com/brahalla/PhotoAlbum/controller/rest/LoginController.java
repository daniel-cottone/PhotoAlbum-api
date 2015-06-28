package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.domain.entity.Account;
import com.brahalla.PhotoAlbum.model.json.AccountInfo;
import com.brahalla.PhotoAlbum.model.json.LoginResponse;
import com.brahalla.PhotoAlbum.service.AccountService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class AccountController {

	@Autowired
	AccountService accountService;

	/* Attempt to authenticate with API
	 * REQUEST: POST /api/accounts
	 */
  @RequestMapping(method = RequestMethod.POST)
  public LoginResponse loginRequest(@RequestBody AccountInfo accountInfo) {
    return new LoginResponse("dis is token");
  }

}
