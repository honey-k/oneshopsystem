package com.chinadci.oneshopreception.config;

public class AlipayConfig {
    // 应用ID,支付宝提供的APPID，上面截图中有提到
    public static String app_id = "2021000117623655";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCnmwNeV4ePj707LS5hqrfLw7IGiDFe0mg0x3IX4W3AaUj+Uow4/ejE5FOIFXUyDuE3cezBAGLqK1WnYJufzahuocW9itCQCIGEQ6fh9lhbgaa15QgLlxjrEEA7K9tdqs5Whtu7WjOUkIAhvHpZ+FBKlD+va7YKc6J8yNaTLykuOr744qFypWh8wmDRp43bNMJlqlB9LUjl1A7ZgFgkET5/h11sDuO20DVlnhTagJLlom7ZBpBo7VAy7pxUiSWcF9oMN5pNb7/1BocBIBKU3Dl8WudWsjNyyxVtsLLx8N3egIYTa8ExliMc0tLrg8Gby9Zi2csyZGNqwBv5zbFohYbtAgMBAAECggEAIw1ONQrFNQbwolGeo5paeejhcHBHMvd6B5+2grwIgfcC5v1Iihq/9X1y4sDqE5/9BeVziCGWjjal4S1ZHqCaGxkGC8/eMmE1BP5JO/6TGAATZ3MQravZ8D8jz7wqUnqIUJw/k/0XUHiv815BkFNYJ2C9uOgj2Ce60bIG/h0c1afo5/eXNyhJ7opdEBf5uVv8rlLKQ/jmLMm/tvZvnea01F4lsU9RQVBIXB3vdQYUL6xO5RPYs64D57YtPsXybKa4R8Nst56p0ArgXBy8fqyctn9osdLfYEh8zCcg44GXQoQOMwkI7brsxFYkqJMIp3RiTchDoUomricU+xrJt2mJmQKBgQDQbPoTF7V9dQKRMxM2WPy9E7zQ3WUwYl1Nh31jyJwtCBIXBoh7pvEYzfNirJukc8yf57JAFVIqNy1OGVS4K3ADJF7FAsWDH1nOSpacCja5q3KlDvPdR6MvfwH2P8rvshvRpQCQDUURREhG10qs3yW+bHUGC3F26NGrl3Hr9Kl3XwKBgQDN3MZQ5Arn85vhzaDllekpZmic0n07VcdvPHRRoO7o1zhrzMuUPgPDkNzMWQyLHrWFswF/9taDwHhBxiWACDl5BXA6SFK5LeV+t9x+b0gCR4wd8oFi/1cFaVLI5kAtYKrFaGsxUHleENHNvL2/CIlfFcMRQSO2Eway/H5F11ChMwKBgDOPAb2/W7IRQ/VPQS1sjfjn7Qlt+x4g9xu6rJYGhjvNh0wS3ahY/8M3D0IVmNrxmmjkFAAuRgkTZS2wrnhwpmDgmmD58oohM0IIyYEINclwVAfozwKqOgAB1yZnWXg6Aw+1VZJM9gzzaz26/EoPWXLluX0pT4Quy886w3+vIkzZAoGBAMUmGLqhGhy2/WNLVTppzej7DVaacppfdOZ/o/oEwKg2bO84KwLmPR6OXhZJdazKFRdcriQJlbiJm+GJzKIHvlq7LZZzat2zKaSomj5vfivIr1SCyQyw8nrZOhHyCCYs/H6fmICazBCc1QBOL/2CRGTOZ4jftD6LjA/fpWJnaO1nAoGAeXE9anlpAXrdJSTLIOo9PMeBJMYrnOj3h0Wdd3FS0I3TSoGKTtlYRE8ucr4Zk5dOZ7uOprt6KyBmca1lNokutvKRi/c8UmO62SDKdIsYmCyR2j7IAl3EstDXoEz4NsfYUZTL5CxuJp/TooAuCRDJiTOVOf7mBmRtNe23SakEGL4=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/appDaily.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp5sDXleHj4+9Oy0uYaq3y8OyBogxXtJoNMdyF+FtwGlI/lKMOP3oxORTiBV1Mg7hN3HswQBi6itVp2Cbn82obqHFvYrQkAiBhEOn4fZYW4GmteUIC5cY6xBAOyvbXarOVobbu1ozlJCAIbx6WfhQSpQ/r2u2CnOifMjWky8pLjq++OKhcqVofMJg0aeN2zTCZapQfS1I5dQO2YBYJBE+f4ddbA7jttA1ZZ4U2oCS5aJu2QaQaO1QMu6cVIklnBfaDDeaTW+/9QaHASASlNw5fFrnVrIzcssVbbCy8fDd3oCGE2vBMZYjHNLS64PBm8vWYtnLMmRjasAb+c2xaIWG7QIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问.如果只是测试使用,那么设置成自己项目启动后可以访问到的一个路径,作为支付宝发送通知的路径(有什么用暂时没发现)
    public static String notify_url = "D:/idea/oneshopsystem/oneshop-web/src/main/webapp/successpay.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问.如果只是测试使用,那么设置成自己项目启动后可以访问到的一个路径.是支付正常完成后,会访问的路径.
    public static String return_url = "file:///D:/idea/oneshopsystem/oneshop-web/src/main/webapp/successpay.html";
    // 签名方式，注意这里，如果步骤设置的是RSA则用RSA,如果按照扇面步骤做的话,选择RSA2
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}