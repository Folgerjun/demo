package com.example.springbootmail.controller;

import com.example.springbootmail.service.impl.IMailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RestController
@RequestMapping("/Mail")
public class MailController {

    private static final String SUCC_MAIL = "邮件发送成功！";
    private static final String FAIL_MAIL = "邮件发送失败！";

    // 图片路径
    private static final String IMG_PATH = "C:/Users/zjj/Desktop/github/materials/blog/img/WC-GZH.jpg";
    // 发送对象
    private static final String MAIL_TO = "folgerjun@gmail.com";

    @Autowired
    private IMailServiceImpl mailService;
    @Autowired
    private TemplateEngine templateEngine;

    @RequestMapping("/Email")
    public String index(){
        try {
            mailService.sendSimpleMail(MAIL_TO,"这是一封普通的邮件","这是一封普通的SpringBoot测试邮件");
        }catch (Exception ex){
            ex.printStackTrace();
            return FAIL_MAIL;
        }
        return SUCC_MAIL;
    }

    @RequestMapping("/htmlEmail")
    public String htmlEmail(){
        try {
            mailService.sendHtmlMail(MAIL_TO,"这是一HTML的邮件","<body>\n" +
                    "<div id=\"welcome\">\n" +
                    "    <h3>Welcome To My Friend!</h3>\n" +
                    "\n" +
                    "    GitHub：\n" +
                    "        <a href=\"#\" th:href=\"@{${github_url}}\" target=\"_bank\">\n" +
                    "            <strong>GitHub</strong>\n" +
                    "        </a>\n" +
                    "    <br />\n" +
                    "    <br />\n" +
                    "    个人博客：\n" +
                    "        <a href=\"#\" th:href=\"@{${blog_url}}\" target=\"_bank\">\n" +
                    "            <strong>DoubleFJ の Blog</strong>\n" +
                    "        </a>\n" +
                    "    <br />\n" +
                    "    <br />\n" +
                    "    <img width=\"258px\" height=\"258px\"\n" +
                    "         src=\"https://raw.githubusercontent.com/Folgerjun/materials/master/blog/img/WC-GZH.jpg\">\n" +
                    "    <br />微信公众号（诗词鉴赏）\n" +
                    "</div>\n" +
                    "</body>");
        }catch (Exception ex){
            ex.printStackTrace();
            return FAIL_MAIL;
        }
        return SUCC_MAIL;
    }

    @RequestMapping("/attachmentsMail")
    public String attachmentsMail(){
        try {
            mailService.sendAttachmentsMail(MAIL_TO, "这是一封带附件的邮件", "邮件中有附件，请注意查收！", IMG_PATH);
        }catch (Exception ex){
            ex.printStackTrace();
            return FAIL_MAIL;
        }
        return SUCC_MAIL;
    }

    @RequestMapping("/resourceMail")
    public String resourceMail(){
        try {
            String rscId = "DoubleFJ";
            String content = "<html><body>这是有图片的邮件<br/><img src=\'cid:" + rscId + "\' ></body></html>";
            mailService.sendResourceMail(MAIL_TO, "这邮件中含有图片", content, IMG_PATH, rscId);

        }catch (Exception ex){
            ex.printStackTrace();
            return FAIL_MAIL;
        }
        return SUCC_MAIL;
    }

    @RequestMapping("/templateMail")
    public String templateMail(){
        try {
            Context context = new Context();
            context.setVariable("github_url", "https://github.com/Folgerjun");
            context.setVariable("blog_url", "http://putop.top/");
            String emailContent = templateEngine.process("mailTemplate", context);

            mailService.sendHtmlMail(MAIL_TO, "这是模板邮件", emailContent);
        }catch (Exception ex){
            ex.printStackTrace();
            return FAIL_MAIL;
        }
        return SUCC_MAIL;
    }
}
