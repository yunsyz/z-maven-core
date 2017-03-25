package com.syz.service.impl;

import org.springframework.stereotype.Service;

import com.syz.service.LoginService;
import com.syz.service.msg.LS001Req;
import com.syz.service.msg.LS001Resp;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public LS001Resp ls001(LS001Req req) {
		System.out.println("=2=2=2=2=2=2==");
		LS001Resp resp = new LS001Resp();
		try {
			resp.setRetCode("200");
			resp.setRetMsg("操作成功");
			throw new RuntimeException("测试运行错误");
		} catch (Exception e) {
			resp.setErrMsg(e.getMessage());
			e.printStackTrace();
		}
		return resp;
	}

}