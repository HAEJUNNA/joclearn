package jocture.joclearn.application.member.service;

import org.springframework.transaction.annotation.Transactional;
import jocture.joclearn.domain.member.Member;

//인터페이스도 Transactional을 다룰수있다.
@Transactional(readOnly = true)
public interface MemberReader {

    /** 회원 목록 조회 */
    void getMembers();

    /** 특정 회원 조회 */
    Member getMember(int memberId);
}
