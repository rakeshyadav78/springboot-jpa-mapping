package com.rakesh.jpamap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.jpamap.service.AccountService;

@RestController
@RequestMapping(value = "/account/")
public class AccountController {
	@Autowired
	private AccountService accountService;
}
