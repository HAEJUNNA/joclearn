package jocture.joclearn.application.member.data.dto;

import jocture.joclearn.domain.member.Member;
import jocture.joclearn.domain.member.MemberStatus;

/**
 * MethodName     : 
 * description    :
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-02-22        NAHAEJUN       최초 생성
 */

/* dto는 클래스보다 record가 많이 쓰인다(상속이 되지않는다) */
public record MemberResponse(
    int memberId,
    String email,
    String nickName,
    MemberStatus status
) {

    public static MemberResponse of(Member member) {
       return new MemberResponse (member.getId()
           ,member.getEmail().value()
           ,member.getNickname().value()
           ,member.getStatus());
    }
}
