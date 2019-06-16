package org.study.heat.utils.alipay;


import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

/**
 * 配置公共参数
 * @author Niu Li
 * @date 2016/10/29
 */
public final class AliPayConfig {
    /**
     * 应用号
     */
    public static String APP_ID = "2016073000129148";
	//public static String APP_ID = "2018021202183985";
    /**
     * 商户的私钥
     */
    public static String APP_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALvK+SgVaWgLqnmsfk8TSAHLh473aDWLaJhwDg4zWndHArZcNZ9VzbbpP6F7KKvoM1o1V2N/SN81ZAMjZ0mfn2TtihQyvy3hIG8DC1tNPSEPaYvrpKREzAGOU60Q5VZ0Q4nzlXeIaXwI8gRfghG3Wdxn2U+/rMluDHkZ6zJc2+r1AgMBAAECgYEAjZcjNvK178nj9it1bJ+oChpwEf4+Zyi+azkJj/FuQ0KaK+7oS0OBgGjrHhDjAIJpvZk8U3uT8R+rUaZu6RbeMQr7nwFl7MFJua5RyZDn1RsKzvEKeh4f2Cu7w3ofIf781WEq5bzep5L4dhMDH1yP4iJmESWUPwplpOulVvK27z0CQQDj0sI0KXdAQ50WgQFIoHjY+/VJFwsJhl+p8f8WsDPFqhUIsPADn1aMlY4MSXiKVaGTd/i+f8ROPJ+xkN7/niiTAkEA0wTKCLa0PnyTdriOB6apQ9TQ/2rNpzWfQy+PKZVBMkqqM8pl1Y5/UBXveJLkmZL/0uHGWkiyrF6IW3ol+tz7VwJACihZdE3s/TaGiHxT/FL7UGFbfFjEqzYMid06TF6q0ENXEL4i1WaDS11XqgCUmUZcH+EXfBbiP8LANACLkMYSdQJAD8LY0EPNPKmTXhe0zA9/rwhTP/CbQbT4m00PFV0HjJkVE183sfa9vZ6Vz1yxZGMdZoPki9PIPKWm66Y49f7RawJAIKXGne7TuPS63RR7qA1k7/hK12CQUk7EQRkuwPHy1OS9Q/lzsJb3+ZVmGTOa4kF/5EgxtlDXmnsxgZZdNELt1Q==";
	//public static String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQChCOgSkXS/v+kviuNeD/UdETAR3hZEMOPtjU6PlFTdBP6nZf554S6azTiq6InCuzCHcgp7cJ5jerF4t1gagzY1RNRNU1GbT/FbptNwBpKBA5qFIULs7t6w5aXeNlIYd7TBb63P/3zDAOYm12FLwGZuCqUE8pe4aHZMHti5hrQjqMCY7PQxBd8V3dR2QUF48ukb8wLlKcPl6l6HeM7AN0j1n9XA89Id9sbVBtXjq6ksULr+Z0856/ZvhPpBzyIA3sugt2yOiRPH/EclOVFoyqqeKw1cKCQ6qXumcbLeRiy1V+U0h8mRC2NadGqV0fYlldgJ+k1OuT1wqlXKFPKAHx/hAgMBAAECggEBAI8Lwlr8KqFKcHFzBpW/xxSS+AhnJ5BbfZy/MVIJiXjrvuokh/DsPuHz+qqW9gitD2bBvt34JDpp+swo0XJ7q+OVyKEHqi40zUmE371bmThRYylvamvdpKOu27CQwExLyZ0q/1MMuF7gpZFLMXqA5nxJqFzEwlFlOfBUVmA3cD1beCuC0dKJ+ivtSeyxnt43JtAeh1hssJ8zZ3FCxsvZpol99/ZgUUanbEw9RHmEdGoxeYO4fvxCkejjOS6HNgNH4ILQgqUihGstXdcw2Y+FnHSZ39qCOX9yhX7lW4IPIMgt81/gaExKt/xZwAG0ONl1VZiYuLyWTIuqXYCexImIXCECgYEA22ucZp9chOd6YMs7Rm4bNz4Efi2HiX2P3cJva0uGzpBhfgWAJ17GNTkozPOUR5yabmOonHWLWQGStgWz6vBBjSe8eluusBv5M3iYtuE7w0EfmRlkuYLYcKTpvMIZD8MMmqeuq5+AMm8JoieqbBbCeWwrx0iIAYkklXWVxZUuO1MCgYEAu+GGdZ+ca7WwyRMjev2Er0RQtM/jwzz1r1ydWj6v550NpeqySagJ5Mq4JMUiHrEAQ9tuTTf4R/azdluODj70Zti74Xaw+ffZzpjlw0z8/2GXGLR0LOaNXxQO3RCgNRUgkWAwXGa/e+QOmAskJp27aqgoJ5RbMq3DRlmmPK1ABXsCgYBzewNpj13mJN3nq46a1sBEJsO+lL/MwOTC1d5GHg3pEVv+M27rSZoP0PGETH4x4l3000aecc7RHV7VpdK3R5N4cv1jeHVMAqz5RfM57PjDHrc+oHq+l/rJ7kGGMrF19jXf/3iSovOZl47+ZNnw4VmhBilUTPwnssIqVyRoRMd8OQKBgCmnjKoTYxi2RaWu6pTgFETPfp034iVtJINmozRY5aMSPO5mJHUUHm1tTHpKgpAPaiGhSskv+Ynq9krtbYdXCdSrhKwuJnqlKtMVLwunzAfK2TcO+xrhWsKTrd/xSbO7JWdVziMOXLHZFCs9fRxaqCyzb4Om7rlDsSGtyp91QdZ1AoGAWyKfouJ7VF67D1QweaTXKXpYUnN0Aw9XSXXhHiOLCW2oO1RSLbnJYuvag1OAadXn8O+ggZAE0noe552bH+YC8GlgOwxU2KAGYew2w9ukEtltOQ9zpYUU0aQGDvhiS+ICPJ/j9AB2QsSi+AD9qqW8IjDtkdcc9wGjrb1dU8+gd00=";
	/**
     * 编码
     */
    public static String CHARSET = "UTF-8";
    /**
     * 支付宝公钥
     */
    public static String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC7yvkoFWloC6p5rH5PE0gBy4eO92g1i2iYcA4OM1p3RwK2XDWfVc226T+heyir6DNaNVdjf0jfNWQDI2dJn59k7YoUMr8t4SBvAwtbTT0hD2mL66SkRMwBjlOtEOVWdEOJ85V3iGl8CPIEX4IRt1ncZ9lPv6zJbgx5GesyXNvq9QIDAQAB";
    //public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoQjoEpF0v7/pL4rjXg/1HREwEd4WRDDj7Y1Oj5RU3QT+p2X+eeEums04quiJwrswh3IKe3CeY3qxeLdYGoM2NUTUTVNRm0/xW6bTcAaSgQOahSFC7O7esOWl3jZSGHe0wW+tz/98wwDmJtdhS8BmbgqlBPKXuGh2TB7YuYa0I6jAmOz0MQXfFd3UdkFBePLpG/MC5SnD5epeh3jOwDdI9Z/VwPPSHfbG1QbV46upLFC6/mdPOev2b4T6Qc8iAN7LoLdsjokTx/xHJTlRaMqqnisNXCgkOql7pnGy3kYstVflNIfJkQtjWnRqldH2JZXYCfpNTrk9cKpVyhTygB8f4QIDAQAB";
    /**
     * 支付宝网关地址
     */
    public static String GATEWAY = "https://openapi.alipaydev.com/gateway.do";
    //public static String GATEWAY = "https://openapi.alipay.com/gateway.do";
    /**
     * 成功付款回调
     */
    //public static String PAY_NOTIFY = "http://niuli.tunnel.qydev.com/notify/alipay_pay";
    //public static String PAY_NOTIFY = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
    // public static String PAY_NOTIFY = "http://www.sangtech.cn/Dryer/OnlinePayment/aliPayNotify";
    public static String PAY_NOTIFY = "http://localhost:8080/heat/payment/aliPayNotify";
    /**
     * 支付成功回调
     */
    public static String REFUND_NOTIFY = "http://niuli.tunnel.qydev.com/notify/alipay_pay";
    /**
     * 前台通知地址
     * 前台根据返回的参数获取订单详情
     */
    //public static String RETURN_URL = "http://niuli.tunnel.qydev.com/notify/alipay_pay";
    // public static String RETURN_URL = "http://www.sangtech.cn/dryerWx/html/record.html";
    public static String RETURN_URL = "http://localhost:8080/heat/wx/html/payment_list.html";
    /**
     * 参数类型
     */
    public static String PARAM_TYPE = "json";
    /**
     * 成功标识
     */
    public static final String SUCCESS_REQUEST = "TRADE_SUCCESS";
    /**
     * 交易关闭回调(当该笔订单全部退款完毕,则交易关闭)
     */
    public static final String TRADE_CLOSED = "TRADE_CLOSED";
    /**
     * 收款方账号
     */
    public static final String SELLER_ID = "yjeslc3497@sandbox.com";
    //public static final String SELLER_ID = "1554816903@qq.com";
    
    /**
     * 加密方式
     */
    public static final String SIGN_TYPE = "RSA";
    //public static final String SIGN_TYPE = "RSA2";
    
    /**
     * 支付宝请求客户端入口
     */
    private volatile static AlipayClient alipayClient = null;

    /**
     * 不可实例化
     */
    private AliPayConfig(){};

    /**
     * 双重锁单例
     * @return 支付宝请求客户端实例
     */
    public static AlipayClient getInstance(){
        if (alipayClient == null){
            synchronized (AliPayConfig.class){
                if (alipayClient == null){
                    alipayClient = new DefaultAlipayClient(GATEWAY,APP_ID,APP_PRIVATE_KEY,PARAM_TYPE,CHARSET,ALIPAY_PUBLIC_KEY,SIGN_TYPE);
                }
            }
        }
        return alipayClient;
    }

}
