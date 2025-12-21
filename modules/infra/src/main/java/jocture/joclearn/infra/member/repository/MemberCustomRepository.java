package jocture.joclearn.infra.member.repository;

import java.util.List;
import jocture.joclearn.domain.member.Member;
import jocture.joclearn.domain.member.dto.MemberCondition;

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
public interface MemberCustomRepository {
    List<Member> findAll(MemberCondition condition);
}
