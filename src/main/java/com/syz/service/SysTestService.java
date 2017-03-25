package com.syz.service;

import com.syz.service.msg.ST001Req;
import com.syz.service.msg.ST001Resp;
import com.syz.service.msg.ST002Req;
import com.syz.service.msg.ST002Resp;
import com.syz.service.msg.ST003Req;
import com.syz.service.msg.ST003Resp;

public interface SysTestService {
	/**
	 * @Description: 增加
	 */
	ST001Resp st001(ST001Req req);

	/**
	 * @Description: 查询
	 */
	ST002Resp st002(ST002Req req);

	/**
	 * @Description: 分页查询
	 */
	ST003Resp st003(ST003Req req);
}
