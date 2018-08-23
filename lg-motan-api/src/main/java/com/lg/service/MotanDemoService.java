package com.lg.service;

import com.lg.pojo.Demo;
import com.weibo.api.motan.transport.async.MotanAsync;

@MotanAsync
public  interface MotanDemoService 
{
    
    String hello(String name);
    
    
    Demo test();
    
}
