package jocture.joclearn.application.member.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import jocture.joclearn.application.member.data.dto.MemberJoinRequest;
import jocture.joclearn.domain.member.Email;
import jocture.joclearn.domain.member.Member;
import jocture.joclearn.domain.member.Nickname;
import jocture.joclearn.infra.config.InfraTestConfig;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional //트랜잭션이 일어난 후에 롤백된다.
//@Commit // 전체컴잇
//@Rollback(false)
@Import(InfraTestConfig.class)
class MemberWriterTest {

    @Autowired MemberWriter memberWriter;

    //@Commit // 특정메서드 컴잇
    @Test
    void joinMember() {
        //BDD 패턴 - Given, When, Then

        //Given
        String nicknameValue = "jocture";
        String emailValue = "joc@ture.com";
        String password = "abcd1234";
        MemberJoinRequest request = new MemberJoinRequest(nicknameValue, emailValue, password);

        //When
        Member member = memberWriter.joinMember(request);

        assertThat(member.getId()).isPositive();
        System.out.println(">>>> member Id : " + member.getId());
        assertThat(member.getNickname()).isEqualTo(new Nickname(nicknameValue));
        assertThat(member.getEmail()).isEqualTo(new Email(emailValue));
    }

    @Test
    void updateMember() {
    }

    @Test
    void leaveMember() {
    }
}
