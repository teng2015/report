package com.gfan.report.frame.service;

import java.util.List;

import com.gfan.report.frame.module.RepDict;
import com.gfan.report.frame.module.UiFwFunctionWidget;
import com.gfan.report.frame.module.UiFwModule;
import com.gfan.report.frame.module.UiFwUser;

public interface UserService {
	
	UiFwUser getUser(String loginId);
	
	List<UiFwModule> getUserModule(Integer userId);
	
	UiFwFunctionWidget getWidget(Integer functionId);
	
	List<RepDict> getDicts(String dictName);
	
}
