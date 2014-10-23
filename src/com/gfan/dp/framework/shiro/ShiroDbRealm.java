/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.gfan.dp.framework.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.AllowAllCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import com.gfan.user.Exception.LogicException;
import com.gfan.user.model.User;
import com.gfan.user.service.WebUserService;
import com.gfan.user.sso.shiro.ShiroGfanCookieToken;

public class ShiroDbRealm extends AuthorizingRealm {

  public ShiroDbRealm() {
    setCredentialsMatcher(new AllowAllCredentialsMatcher());
    setAuthenticationTokenClass(ShiroGfanCookieToken.class);
  }

  WebUserService webUserService;

  public void setWebUserService(WebUserService webUserService) {
    this.webUserService = webUserService;
  }

  public WebUserService getWebUserService() {
    return webUserService;
  }

  /**
   * 认证回调函数,登录时调用.
   */
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)throws AuthenticationException {
    ShiroGfanCookieToken token = (ShiroGfanCookieToken) authcToken;
    String tokenString = token.getToken();
    User user = null;
    try {
      user = webUserService.verify("coop", tokenString);
    } catch (LogicException e) {
      throw new AuthenticationException(e);
    }
    if (user == null) {
      return null;
    }
    // 正常登录
    doSomeAction(user);
    return new SimpleAuthenticationInfo(user, null, getName());
  }

  /**
   * 
   * @param user
   * @return
   */
  private void doSomeAction(User user) {
    Subject subject = SecurityUtils.getSubject();
    Session session = subject.getSession();
    session.setAttribute("user", user);
  }

  /**
   * 权限认证回调函数
   */
  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    // TODO Auto-generated method stub
    return null;
  }

}
