package jocture.joclearn.application.member.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import jocture.joclearn.domain.member.PasswordEncoder;

@TestConfiguration
public class ApplicationTestConfig {
    //아무리 의존관계라도, test밑에 있는 모듈은 의존할수없다.
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new StubPasswordEncoder();
    }
}
