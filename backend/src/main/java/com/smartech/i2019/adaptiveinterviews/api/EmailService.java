package com.smartech.i2019.adaptiveinterviews.api;

import java.util.Date;

public interface EmailService {
    void sendRemindInterviewEmail(String to, String user, String employee, Date date);

    void sendRemindReviewEmail(String to, String user, String employee, Date date);
}
