package com.lg.motan.service;

import com.lg.pojo.Demo;
import com.lg.service.IuserService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;
@MotanService(module="server",group="server",export="motan:1001")
public class UserService implements IuserService{

	@Override
	public void add(Demo demo) {
		// TODO Auto-generated method stub
		
	}

}
