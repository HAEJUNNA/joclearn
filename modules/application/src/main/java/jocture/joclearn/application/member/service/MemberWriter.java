package jocture.joclearn.application.member.service;

import jocture.joclearn.application.member.data.dto.MemberJoinRequest;
import jocture.joclearn.domain.member.Member;

/**
 * MethodName     : 
 * description    :
 *
 * 인터페이스는 의미있는 단위로 분리할수 있다.
 * 각 역할 단위로 분류할수있어야 한다.
 *
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-29        NAHAEJUN       최초 생성
 */
public interface MemberWriter {
    /** 회원가입 */
    Member joinMember(MemberJoinRequest request);
    /** 회원정보 수정 */
    void updateMember();
    /** 회원 탈퇴 */
    void leaveMember();
}
