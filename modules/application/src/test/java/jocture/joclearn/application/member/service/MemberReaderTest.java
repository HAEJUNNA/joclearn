package jocture.joclearn.application.member.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.Transactional;
import jocture.joclearn.domain.member.Member;
import jocture.joclearn.domain.member.MemberRepository;
import jocture.joclearn.domain.member.PasswordEncoder;
import jocture.joclearn.domain.member.dto.MemberCondition;
import jocture.joclearn.infra.config.InfraTestConfig;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * MethodName     : 
 * description    :
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-12-21        NAHAEJUN       최초 생성
 */
@SpringBootTest
@Transactional
@Import(InfraTestConfig.class) // 동일한게 테스트를 의존못하기 때문에 Fixture를 사용한다.
public class MemberReaderTest {


    @Autowired MemberReader memberReader;
    @Autowired MemberRepository memberRepository;
    @Autowired PasswordEncoder passwordEncoder;

    @Test
    void getMembers() {
        MemberCondition condition = MemberCondition.empty();

        memberReader.getMembers(condition);
    }

    @Test
    void getMember() {
        Member member = memberRepository.save(Member.create("haejun","skrhkaa@sd.com","asdzx312",passwordEncoder));

        Member result = memberReader.getMember(member.getId());

        assertThat(result.getId()).isNotNull().isEqualTo(member.getId());
        assertThat(result.getNickname()).isEqualTo(member.getNickname());
    }


}
