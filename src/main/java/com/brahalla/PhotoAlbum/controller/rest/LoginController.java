package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.domain.entity.Account;
import com.brahalla.PhotoAlbum.model.json.AccountInfo;
import com.brahalla.PhotoAlbum.model.json.response.LoginResponse;
import com.brahalla.PhotoAlbum.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

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
