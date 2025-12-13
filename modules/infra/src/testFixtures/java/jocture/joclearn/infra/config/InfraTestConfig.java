package jocture.joclearn.infra.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import jocture.joclearn.domain.member.PasswordEncoder;
import jocture.joclearn.infra.member.StubPasswordEncoder;

//@Configuration 컴포넌트 스캔으로 대상이 된다.
@TestConfiguration // 컴포넌트 스캔 대상이 아니다.
public class InfraTestConfig {
    //아무리 의존관계라도, test밑에 있는 모듈은 의존할수없다.
    // StubPasswordEncoder 을 테스트에서 인식할수있도록 가짜 빈생성
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new StubPasswordEncoder();
    }
}
