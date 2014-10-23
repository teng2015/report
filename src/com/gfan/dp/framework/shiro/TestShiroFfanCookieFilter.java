package com.gfan.dp.framework.shiro;


import com.gfan.user.sso.shiro.ShiroGfanCookieFilter;

public class TestShiroFfanCookieFilter extends ShiroGfanCookieFilter {

  @Override
  protected String getTokenName() {
    return CookieConst.TOKEN_NAME;
  }

  @Override
  protected String getAppKey() {
    return CookieConst.APPKEY;
  }
  @Override
  protected String getAccessUrl() {
    return CookieConst.DEFAULT_LOGIN_ADDRESS.substring(0,
        CookieConst.DEFAULT_LOGIN_ADDRESS.indexOf("?"));
  }



}
