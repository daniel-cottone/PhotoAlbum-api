package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.domain.entity.Account;
import com.brahalla.PhotoAlbum.model.json.AccountInfo;
import com.brahalla.PhotoAlbum.model.json.response.LoginResponse;
import com.brahalla.PhotoAlbum.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("authenticate")
public class AuthenticateController {

	@Autowired
	AccountService accountService;

	@Autowired
	UserDetailsService userDetailsService;

	/* Attempt to authenticate with API
	 * REQUEST: POST /api/authenticate
	 */
  @RequestMapping(method = RequestMethod.POST)
  public LoginResponse authenticationRequest(@RequestBody AccountInfo accountInfo) {
		UserDetails userDetails = this.userDetailsService.loadUserByUsername(accountInfo.getUsername());
		System.out.println(userDetails);
		String credentials = accountInfo.getUsername() + ":" + accountInfo.getPassword();
		byte[] token = Base64.encode(credentials.getBytes());
    return new LoginResponse(new String(token));
  }

}
