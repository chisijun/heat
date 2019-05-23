package org.study.heat.service.impl;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.stereotype.Service;
import org.study.heat.config.Constants;
import org.study.heat.entity.TokenModel;
import org.study.heat.service.TokenManager;

import javax.annotation.Resource;
import javax.management.monitor.CounterMonitor;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/**
 * @Description: 通过Redis存储和验证token的实现类
 * @author liangyunlong
 * @date 2017/12/20
 */
@Service("tokenManager")
public class TokenManagerImpl implements TokenManager {
    //@Resource(name = "redisTemplate")
    //private RedisTemplate<String, String> redis;
	ConcurrentHashMap<Long, String> tokenMap = new ConcurrentHashMap<Long, String>();
	
    public TokenManagerImpl(){}

    public TokenManagerImpl(RedisTemplate<String, String> redis) {
        //this.redis = redis;
        redis.setKeySerializer(new JdkSerializationRedisSerializer());
    }

    @Override
    public TokenModel createToken(Long userId) {
        //使用uuid作为源token
        String token = UUID.randomUUID().toString().replace("-", "");
        TokenModel model = new TokenModel(userId, token);
        //存储到redis并设置过期时间
        //redis.boundValueOps(String.valueOf(userId)).set(token, Constants.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
        return model;
    }

    @Override
    public boolean checkToken(TokenModel model) {
        if (model == null) {
            return false;
        }
        //String token = redis.boundValueOps(String.valueOf(model.getUserId())).get();
        if (token == null || !token.equals(model.getToken())) {
            return false;
        }
        //如果验证成功，说明此用户进行了一次有效操作，延长token的过期时间
        //redis.boundValueOps(String.valueOf(model.getUserId())).expire(Constants.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
        return true;
    }

    /**
     * 非单点登录-通过userId获取token
     */
    @Override
    public TokenModel get(Integer userId) {
    	System.out.println("userId = " + userId);
        ValueOperations<String, String> value = redis.opsForValue();
        String token = value.get(String.valueOf(userId));
        if (token == null) {
            return null;
        }
        TokenModel model = new TokenModel(userId, token);
        return model;
    }
    @Override
    public TokenModel getToken(String authentication) {
        if (authentication == null || authentication.length() == 0) {
            return null;
        }
        String[] param = authentication.split("_");
        if (param.length != 2) {
            return null;
        }
        //使用userId和源token简单拼接成的token，可以增加加密措施
        Integer userId = Integer.parseInt(param[0]);
        String token = param[1];
        return new TokenModel(userId, token);
    }

    @Override
    public void deleteToken(Integer userId) {
        redis.delete(String.valueOf(userId));
    }
}
