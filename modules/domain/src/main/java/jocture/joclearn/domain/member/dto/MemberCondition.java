package jocture.joclearn.domain.member.dto;

import jocture.joclearn.domain.member.MemberStatus;

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
public record MemberCondition(
    Integer memberId,
    String nickName,
    String emailLike,
    MemberStatus status
) { }
