package com.itboy.security;

import com.itboy.model.SysUser;
import com.itboy.service.LoginService;
import lombok.extern.log4j.Log4j2;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName MyShiroRealm
 * @Description 权限数据源及认证
 * @Author 超 boy_0214@sina.com
 * @Date 2019/6/26 0026 16:36
 **/
@Log4j2
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private LoginService loginService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = (String) authenticationToken.getPrincipal();
        if (userName == null) {
            return null;
        }
        SysUser user = loginService.findByUserName(userName);
        if (user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo(userName, user.getPassword(), ByteSource.Util.bytes(user.getSalt()),this.getName());
    }

}
