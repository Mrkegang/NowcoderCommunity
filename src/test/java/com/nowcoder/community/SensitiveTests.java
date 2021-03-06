package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author kg
 * @version 1.0
 * @date 2022/5/2 18:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = NowcoderCommunityApplication.class)
public class SensitiveTests {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void tsetSensitive() {
        String text = "这里可以赌`博，可以嫖?娼，可以吸毒，可以开票，哈哈哈！";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }
}
