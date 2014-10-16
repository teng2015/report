package com.gfan.report.frame.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gfan.report.frame.dao.RepDictDAO;
import com.gfan.report.frame.dao.UiFwFunctionDAO;
import com.gfan.report.frame.dao.UiFwFunctionWidgetDAO;
import com.gfan.report.frame.dao.UiFwModuleDAO;
import com.gfan.report.frame.dao.UiFwUserDAO;
import com.gfan.report.frame.module.RepDict;
import com.gfan.report.frame.module.RepDictExample;
import com.gfan.report.frame.module.UiFwFunction;
import com.gfan.report.frame.module.UiFwFunctionWidget;
import com.gfan.report.frame.module.UiFwFunctionWidgetExample;
import com.gfan.report.frame.module.UiFwModule;
import com.gfan.report.frame.module.UiFwUser;
import com.gfan.report.frame.module.UiFwUserExample;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UiFwUserDAO uiFwUserDAO;
	
	@Resource
	private UiFwModuleDAO uiFwModuleDAO;
	
	@Resource
	private UiFwFunctionDAO uiFwFunctionDAO;
	
	@Resource
	private UiFwFunctionWidgetDAO uiFwFunctionWidgetDAO;
	
	@Resource
	private RepDictDAO repDictDAO;
	@Override
	public UiFwUser getUser(String loginId) {
		UiFwUserExample example = new UiFwUserExample();
		example.createCriteria().andLoginIdEqualTo(loginId);
		List<UiFwUser> users = uiFwUserDAO.selectByExample(example);
		return users.get(0);
	}

	@Override
	public List<UiFwModule> getUserModule(Integer userId) {
		List<UiFwModule> modules = uiFwModuleDAO.selectByUserId(userId);
		List<UiFwFunction> functions = uiFwFunctionDAO.selectByUserId(userId);
		for(UiFwFunction function : functions){
			for(UiFwModule module : modules){
				if(function.getModuleId().equals(module.getId())){
					List<UiFwFunction> list = module.getFunctions();
					if(list==null){
						list = new ArrayList<UiFwFunction>();
						module.setFunctions(list);
					}
					list.add(function);
				}
			}
		}
		return modules;
	}

	@Override
	public UiFwFunctionWidget getWidget(Integer functionId) {
		UiFwFunctionWidgetExample example = new UiFwFunctionWidgetExample();
		example.createCriteria().andFunctionIdEqualTo(functionId);
		List<UiFwFunctionWidget> list = uiFwFunctionWidgetDAO.selectByExample(example);
		return list.get(0);
	}

	@Override
	public List<RepDict> getDicts(String dictName) {
		RepDictExample example = new RepDictExample();
		example.createCriteria().andDictTypeEqualTo(dictName);
		return repDictDAO.selectByExample(example);
	}

}
