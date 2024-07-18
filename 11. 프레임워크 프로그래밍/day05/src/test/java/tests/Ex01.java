package tests;

import org.choongang.config.MvcConfig;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
public class Ex01 {

    @Test
    void test1() {
        URI url = UriComponentsBuilder.fromUriString("https://www.naver.com")
                .path("/news/{0}")
                .queryParam("tq","v1")
                .queryParam("t2", "v2")
                .queryParam("t3", "한글")
                .queryParam("t4", "aa{1}")
                .fragment("hash")
                .encode()
                .build();
        System.out.println(url);
    }
}
