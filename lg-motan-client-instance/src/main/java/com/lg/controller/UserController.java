package com.lg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lg.service.IuserService;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;

@RestController
public class UserController {
@MotanReferer(module="server",group="server")
private IuserService iuserService;

@GetMapping("/")
public String adduser() {
	iuserService.add(null);
	return null;

}
}
