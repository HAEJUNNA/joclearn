package jocture.joclearn.member;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemberTest {

    @Test
    void member() {
        Member member = new Member("jjlim", "jjlim@abc.com", "abcd1234");
        assertThat(member.getStatus()).isEqualTo(MemberStatus.STANDBY);
    }
}
