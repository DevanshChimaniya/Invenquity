package com.inventorymanagementsystem.server.helper;

public class EmailTemplate {
    
    public static String getEmailTemplateForVerifyUser(String firstName, String otp) {
        return "<html>" +
                "<head>" +
                "<style>" +
                "body {" +
                "    font-family: Arial, sans-serif;" +
                "    background-color: #f4f4f4;" +
                "    margin: 0;" +
                "    padding: 0;" +
                "}" +
                ".container {" +
                "    width: 100%;" +
                "    max-width: 600px;" +
                "    margin: 0 auto;" +
                "    background-color: #ffffff;" +
                "    padding: 20px;" +
                "    border-radius: 10px;" +
                "    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);" +
                "}" +
                ".header {" +
                "    text-align: center;" +
                "    padding: 10px 0;" +
                "    border-bottom: 1px solid #eeeeee;" +
                "}" +
                ".header img {" +
                "    max-width: 100%;" +
                "    height: auto;" +
                "    border-radius: 10px 10px 0 0;" +
                "}" +
                ".header h2 {" +
                "    margin: 0;" +
                "    color: #333333;" +
                "}" +
                ".content {" +
                "    padding: 20px;" +
                "}" +
                ".content p {" +
                "    font-size: 16px;" +
                "    color: #666666;" +
                "    line-height: 1.5;" +
                "}" +
                ".otp {" +
                "    font-size: 24px;" +
                "    font-weight: bold;" +
                "    color: #333333;" +
                "    text-align: center;" +
                "    margin: 20px 0;" +
                "}" +
                ".button {" +
                "    text-align: center;" +
                "    margin: 20px 0;" +
                "}" +
                ".button a {" +
                "    background-color: #007bff;" +
                "    color: #ffffff;" +
                "    padding: 10px 20px;" +
                "    text-decoration: none;" +
                "    border-radius: 5px;" +
                "    font-size: 16px;" +
                "}" +
                ".footer {" +
                "    text-align: center;" +
                "    padding: 10px 0;" +
                "    border-top: 1px solid #eeeeee;" +
                "    font-size: 14px;" +
                "    color: #aaaaaa;" +
                "}" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class=\"container\">" +
                "    <div class=\"header\">" +
                "        <img src=\"https://res.cloudinary.com/dth5ysuhs/image/upload/v1735127095/b5qgg0b8myao8qsqmf4k.png\" alt=\"Banner\">" +
                "    </div>" +
                "    <div class=\"content\">" +
                "        <h2>Hello " + firstName + ",</h2>" +
                "        <p>Welcome to Inven<u>quity</u>.</p>" +
                "        <p>Here's the code that you need to use to activate your account:</p>" +
                "        <div class=\"otp\">" + otp + "</div>" +
                "        <p>Thank you,<br>Inven<u>quity</u> team</p>" +
                "    </div>" +
                "    <div class=\"footer\">" +
                "        <p>&copy; 2024 Inven<u>Quity</u>. All rights reserved.</p>" +
                "    </div>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
    

    public static String getEmailTemplateForPasswordRecovery(String firstName, String otp) {
        return "<html>" +
                "<head>" +
                "<style>" +
                "body {" +
                "    font-family: Arial, sans-serif;" +
                "    background-color: #f4f4f4;" +
                "    margin: 0;" +
                "    padding: 0;" +
                "}" +
                ".container {" +
                "    width: 100%;" +
                "    max-width: 600px;" +
                "    margin: 0 auto;" +
                "    background-color: #ffffff;" +
                "    padding: 20px;" +
                "    border-radius: 10px;" +
                "    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);" +
                "}" +
                ".header {" +
                "    text-align: center;" +
                "    padding: 10px 0;" +
                "    border-bottom: 1px solid #eeeeee;" +
                "}" +
                ".header img {" +
                "    max-width: 100%;" +
                "    height: auto;" +
                "    border-radius: 10px 10px 0 0;" +
                "}" +
                ".header h2 {" +
                "    margin: 0;" +
                "    color: #333333;" +
                "}" +
                ".content {" +
                "    padding: 20px;" +
                "}" +
                ".content p {" +
                "    font-size: 16px;" +
                "    color: #666666;" +
                "    line-height: 1.5;" +
                "}" +
                ".otp {" +
                "    font-size: 24px;" +
                "    font-weight: bold;" +
                "    color: #333333;" +
                "    text-align: center;" +
                "    margin: 20px 0;" +
                "}" +
                ".button {" +
                "    text-align: center;" +
                "    margin: 20px 0;" +
                "}" +
                ".button a {" +
                "    background-color: #007bff;" +
                "    color: #ffffff;" +
                "    padding: 10px 20px;" +
                "    text-decoration: none;" +
                "    border-radius: 5px;" +
                "    font-size: 16px;" +
                "}" +
                ".footer {" +
                "    text-align: center;" +
                "    padding: 10px 0;" +
                "    border-top: 1px solid #eeeeee;" +
                "    font-size: 14px;" +
                "    color: #aaaaaa;" +
                "}" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class=\"container\">" +
                "    <div class=\"header\">" +
                "        <img src=\"https://res.cloudinary.com/dth5ysuhs/image/upload/v1735127095/b5qgg0b8myao8qsqmf4k.png\" alt=\"Banner\">" +
                "    </div>" +
                "    <div class=\"content\">" +
                "        <h2>Hello " + firstName + ",</h2>" +
                "        <p>Welcome to Inven<u>quity</u>.</p>" +
                "        <p>Here's the code that you need to use to reset your password: </p>" +
                "        <div class=\"otp\">" + otp + "</div>" +
                "        <p>Thank you,<br>Inven<u>quity</u> team</p>" +
                "    </div>" +
                "    <div class=\"footer\">" +
                "        <p>&copy; 2024 Inven<u>quity</u>. All rights reserved.</p>" +
                "    </div>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
    
    public static String getEmailTemplateForNotifyAdmins(String productName, String skuCode, int currentQuantity, int minimumQuantity) {
        return "<html>" +
                "<head>" +
                "<style>" +
                "body {" +
                "    font-family: Arial, sans-serif;" +
                "    background-color: #f4f4f4;" +
                "    margin: 0;" +
                "    padding: 0;" +
                "}" +
                ".container {" +
                "    width: 100%;" +
                "    max-width: 600px;" +
                "    margin: 0 auto;" +
                "    background-color: #ffffff;" +
                "    padding: 20px;" +
                "    border-radius: 10px;" +
                "    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);" +
                "}" +
                ".header {" +
                "    text-align: center;" +
                "    padding: 10px 0;" +
                "    border-bottom: 1px solid #eeeeee;" +
                "}" +
                ".header img {" +
                "    max-width: 100%;" +
                "    height: auto;" +
                "    border-radius: 10px 10px 0 0;" +
                "}" +
                ".content {" +
                "    padding: 20px;" +
                "}" +
                ".content h2 {" +
                "    color: #333333;" +
                "    font-size: 24px;" +
                "    margin-bottom: 10px;" +
                "}" +
                ".content p {" +
                "    font-size: 16px;" +
                "    color: #666666;" +
                "    line-height: 1.5;" +
                "}" +
                ".footer {" +
                "    text-align: center;" +
                "    padding: 10px 0;" +
                "    border-top: 1px solid #eeeeee;" +
                "    font-size: 14px;" +
                "    color: #aaaaaa;" +
                "}" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class=\"container\">" +
                "    <div class=\"header\">" +
                "        <img src=\"https://res.cloudinary.com/dth5ysuhs/image/upload/v1735127095/b5qgg0b8myao8qsqmf4k.png\" alt=\"Banner\">" +
                "        <h2>Product Quantity Alert</h2>" +
                "    </div>" +
                "    <div class=\"content\">" +
                "        <h2>Attention Admins,</h2>" +
                "        <p>The quantity of the product <strong>" + productName + "</strong> (SKU: <strong>" + skuCode + "</strong>) has fallen below the minimum threshold.</p>" +
                "        <p>Current Quantity: <strong>" + currentQuantity + "</strong></p>" +
                "        <p>Minimum Required Quantity: <strong>" + minimumQuantity + "</strong></p>" +
                "        <p>Please take the necessary actions to restock the product and ensure availability.</p>" +
                "    </div>" +
                "    <div class=\"footer\">" +
                "        <p>&copy; 2024 Inven<u>quity</u>. All rights reserved.</p>" +
                "    </div>" +
                "</div>" +
                "</body>" +
                "</html>";
    }

    public static String getEmailTemplateForReply(String firstName, String lastName, String subject, String replyMessage, String senderEmail) {
        return "<html>" +
                "<head>" +
                "<style>" +
                "body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 0; }" +
                ".container { width: 100%; max-width: 600px; margin: 0 auto; background-color: #ffffff; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }" +
                ".header { text-align: center; padding: 10px 0; border-bottom: 1px solid #eeeeee; }" +
                ".header img { max-width: 100%; height: auto; border-radius: 10px 10px 0 0; }" +
                ".header h2 { margin: 0; color: #333333; }" +
                ".content { padding: 20px; }" +
                ".content p { font-size: 16px; color: #666666; line-height: 1.5; }" +
                ".footer { text-align: center; padding: 10px 0; border-top: 1px solid #eeeeee; font-size: 14px; color: #aaaaaa; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class=\"container\">" +
                "    <div class=\"header\">" +
                "        <img src=\"https://res.cloudinary.com/dth5ysuhs/image/upload/v1735127095/b5qgg0b8myao8qsqmf4k.png\" alt=\"Banner\">" +
                "        <h2>Reply to Your Inquiry</h2>" +
                "    </div>" +
                "    <div class=\"content\">" +
                "        <p>Dear " + firstName + " " + lastName + ",</p>" +
                "        <p>We have received your inquiry regarding '<b>" + subject + "</b>' and here is our response:</p>" +
                "        <p>" + replyMessage + "</p>" +
                "        <p>Best regards,<br>" + senderEmail + "</p>" +
                "    </div>" +
                "    <div class=\"footer\">" +
                "        <p>&copy; 2024 Your Company Name. All rights reserved.</p>" +
                "    </div>" +
                "</div>" +
                "</body>" +
                "</html>";
    }

    public static String getEmailTemplateForConfirmation(String firstName, String lastName, String email, String password) {
        return "<html>" +
                "<head>" +
                "<style>" +
                "body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 0; }" +
                ".container { width: 100%; max-width: 600px; margin: 0 auto; background-color: #ffffff; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }" +
                ".header { text-align: center; padding: 10px 0; border-bottom: 1px solid #eeeeee; }" +
                ".header img { max-width: 100%; height: auto; border-radius: 10px 10px 0 0; }" +
                ".header h2 { margin: 0; color: #333333; }" +
                ".content { padding: 20px; }" +
                ".content p { font-size: 16px; color: #666666; line-height: 1.5; }" +
                ".footer { text-align: center; padding: 10px 0; border-top: 1px solid #eeeeee; font-size: 14px; color: #aaaaaa; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class=\"container\">" +
                "    <div class=\"header\">" +
                "        <img src=\"https://res.cloudinary.com/dth5ysuhs/image/upload/v1735127095/b5qgg0b8myao8qsqmf4k.png\" alt=\"Banner\">" +
                "        <h2>Subscription Confirmation</h2>" +
                "    </div>" +
                "    <div class=\"content\">" +
                "        <p>Dear " + firstName + " " + lastName + ",</p>" +
                "        <p>Thank you for choosing Invenquity. Your subscription is successful.</p>" +
                "        <p>Here are your login details:</p>" +
                "        <p>Email: " + email + "<br>Password: " + password + "</p>" +
                "        <p>We look forward to serving you.</p>" +
                "        <p>Best regards,<br>Invenquity Team</p>" +
                "    </div>" +
                "    <div class=\"footer\">" +
                "        <p>&copy; 2024 Invenquity. All rights reserved.</p>" +
                "    </div>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
    
    
}
