package com.chinadci.oneshopreception.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.chinadci.oneshopreception.config.AlipayConfig;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@CrossOrigin
@RestController
public class alipayController {
    @RequestMapping("/alipay")//设置请求的路径
    public String toPay(String total_amount) throws Exception{
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        //设置请求参数,并把配置类中的两个路径设置进去
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        //如果想正常调用接口则需要传一些必要参数,out_trade_no:订单号,保证唯一性,支付宝根据该参数生成你的支付单号,total_amount:需要支付的金额,注意是String型,且金额计数的分割","不能存在(例如1,000就是错误的参数),subject:对物品进行描述,product_code:是支付类型.更多详细的参数信息参考链接: [https://docs.open.alipay.com/api_1/alipay.trade.page.pay](https://docs.open.alipay.com/api_1/alipay.trade.page.pay)
        String out_trade_no = UUID.randomUUID().toString().replace("-","").trim().substring(0,24);
        String subject="一号店购物清单";
        try {
            alipayRequest.setBizContent("{\"out_trade_no\":\""+out_trade_no +"\","
                    + "\"total_amount\":\""+total_amount +"\","
                    + "\"subject\":\""+ subject +"\","
                    + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
            //请求
            String result;
            //发送请求并返回
            result = alipayClient.pageExecute(alipayRequest).getBody();
            //System.out.println("*********************\n返回结果为："+result);
            return result;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
}
