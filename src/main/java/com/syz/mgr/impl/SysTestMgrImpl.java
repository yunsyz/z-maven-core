package com.syz.mgr.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.syz.base.BaseMgr;
import com.syz.mgr.SysTestMgr;
import com.syz.mybatis.crud.Page;
import com.syz.service.bean.SysTest;

@Component
public class SysTestMgrImpl extends BaseMgr implements SysTestMgr {

	@Override
	public void saveSysTest(Map<String, Object> daoArgs) {
		this.dao.insert("sysTestMapper.saveSysTest", daoArgs);
	}

	@Override
	public List<SysTest> querySysTest(Map<String, Object> daoArgs) {
		List<SysTest> list = this.dao.query("sysTestMapper.querySysTest", daoArgs);
		return list;
	}

	@Override
	public Page<SysTest> queryPageSysTest(Map<String, Object> daoArgs) {
		Page<SysTest> page = this.dao.query("sysTestMapper.querySysTest", daoArgs,
				Integer.valueOf(daoArgs.get("pageSize").toString()), Integer.valueOf(daoArgs.get("pageNo").toString()));
		return page;
	}

}
