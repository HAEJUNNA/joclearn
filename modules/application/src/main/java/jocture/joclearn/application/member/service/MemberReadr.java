package jocture.joclearn.application.member.service;

/**
 * MethodName     : 
 * description    :
 *
 * 인터페이스는 의미있는 단위로 분리할수 있다.
 *
 * @param         :
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-29        NAHAEJUN       최초 생성
 */
public interface MemberReadr {
    /** 회원 목록 조회 */
    void getMembers();
    /** 특정 회원 조회 */
    void getMember();
}
