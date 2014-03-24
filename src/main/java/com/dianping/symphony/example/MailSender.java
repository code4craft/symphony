package com.dianping.symphony.example;

import com.dianping.symphony.ResourceScheduler;

/**
 * @author code4crafter@gmail.com
 */
public class MailSender {

    public static void main(String[] args) {
        ResourceScheduler resourceScheduler = new ResourceScheduler("10.1.2.1","10.1.2.2");
        String availableResouce = resourceScheduler.getAvailableResource("qq.com");
        sendMailTo(availableResouce);
    }

    private static void sendMailTo(String availableResouce) {
        //TODO send mail by java mail
    }
}
