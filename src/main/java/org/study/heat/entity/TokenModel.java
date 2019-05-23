package org.study.heat.entity;

/**
 * @Description: Token的Model类，可以增加字段提高安全性，例如时间戳、url签名
 * @author liangyunlong
 * @date 2017/12/20
 */
public class TokenModel {
    //用户id
    private Integer userId;

    //随机生成的uuid
    private String token;

    // 构造函数
    public TokenModel(Integer userId, String token){
        this.userId = userId;
        this.token = token;
    }

    public Integer getUserId(){
        return userId;
    }

    public void setUserId(){
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}


















