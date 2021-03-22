package com.chinadci.oneshopreception.sendSms;

import com.cloopen.rest.sdk.BodyType;
import com.cloopen.rest.sdk.CCPRestSmsSDK;
import io.swagger.annotations.ApiParam;


import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class SendSMS {
    @ApiParam(name = "SendSMS",value = "发送短信")
    public static String sendsms(String phone) {
        //生产环境请求地址：app.cloopen.com
        String serverIp = "app.cloopen.com";
        //请求端口
        String serverPort = "8883";
        //主账号,登陆云通讯网站后,可在控制台首页看到开发者主账号ACCOUNT SID和主账号令牌AUTH TOKEN
        String accountSId = "8a216da878005a80017834009f5810bc";
        String accountToken = "06105d93cdfd4a288ae6ee307731a836";
        //请使用管理控制台中已创建应用的APPID
        String appId = "8aaf0708780055cd0178389ddd841347";
        CCPRestSmsSDK sdk = new CCPRestSmsSDK();
        sdk.init(serverIp, serverPort);
        sdk.setAccount(accountSId, accountToken);
        sdk.setAppId(appId);
        sdk.setBodyType(BodyType.Type_JSON);
        String to = phone;
        String templateId = "1";
        String results = "";
        String datass = "123456789987452136";
        char[] crr = datass.toCharArray();
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * 4);
            results += crr[index];
        }
        String[] datas = {results, "5"};
        HashMap<String, Object> result = sdk.sendTemplateSMS(to, templateId, datas);
        if ("000000".equals(result.get("statusCode"))) {
            //正常返回输出data包体信息（map）
            HashMap<String, Object> data = (HashMap<String, Object>) result.get("data");
            Set<String> keySet = data.keySet();
            for (String key : keySet) {
                Object object = data.get(key);
                System.out.println(key + " = " + object);
            }
        } else {
            //异常返回输出错误码和错误信息
            System.out.println("错误码=" + result.get("statusCode") + " 错误信息= " + result.get("statusMsg"));
        }
        return results;
    }

}

