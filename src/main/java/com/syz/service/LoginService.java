package com.syz.service;

import com.syz.service.msg.LS001Req;
import com.syz.service.msg.LS001Resp;

/**
 * 登陆接口
 * 
 * @ClassName: LoginService
 * @Description: TODO
 * @author: sunyz
 * @date: 2016年12月26日 下午6:57:35
 */
public interface LoginService {
	/**
	 * @Description: 用户登陆
	 */
	LS001Resp ls001(LS001Req req);

}