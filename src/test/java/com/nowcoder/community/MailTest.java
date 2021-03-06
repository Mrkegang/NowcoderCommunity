package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author kg
 * @version 1.0
 * @date 2022/4/29 16:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = NowcoderCommunityApplication.class)
public class MailTest {

    @Autowired
    private MailClient mailClient;

    @Test
    public void testTextMail() {
        mailClient.sendMail("2940730274@qq.com", "TEST", "Spring邮箱测试");
    }
}
