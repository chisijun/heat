package org.study.heat.config;

/**
 * @Description: 存放静态变量
 * @author liangyunlong
 * @date 2017/12/20
 */
public class Constants {
    /**
     * 存储当前登录用户id的字段名
     */
    public static final String CURRENT_USER_ID = "CURRENT_USER_ID";

    /**
     * token有效期（小时）
     */
    public static final int TOKEN_EXPIRES_HOUR = 72;
    /**
     * 存放Authorization的header字段
     */
    public static final String AUTHORIZATION = "authorization";
    /**
     * 短信验证业务-用户注册
     */
    public static final int PHONE_REGISTER = 1;

    /**
     * 短信验证码业务-修改密码
     */
    public static final int PHONE_RESTPWD = 2;

    /**
     * 短信验证码业务-修改手机号
     */
    public static final int PHONE_MODIFY = 3;

    /**
     * 短信验证码业务-修改手机号-新号码确认
     */
    public static final int PHONE_MODIFY_CHECK = 4;

    /**
     * 短信验证码业务--验证码登录
     */
    public static final int PHONE_SMSLOGIN = 5;

    /**
     * 短信验证码工单时效 1天
     */
    public static final long PHONE_EXPIRE = (24 * 60 * 60);

    /**
     * 管理员Code
     */
    public static final String ADMIN = "admin";

    /**
     * 用户Code
     */
    public static final String USER = "user";
    
    /**
     * 用户二维码domain
     */
    public static final String DOMAIN_USER = "http://192.168.1.112:8080/Dryer/user_info.html?code=";
    
    /**
     * 设备二维码domain
     */
    public static final String DOMAIN_DEVICE = "http://192.168.1.112:8080/Dryer/device_info.html?code=";

    /**
     * 用户信息
     */
    public static final String USERMSG = "userMsg";
    
    

}
