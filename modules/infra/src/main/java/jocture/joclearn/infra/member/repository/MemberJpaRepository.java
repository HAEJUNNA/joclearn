package jocture.joclearn.infra.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jocture.joclearn.domain.member.Member;
import jocture.joclearn.domain.member.MemberRepository;

/**
 * MethodName     : 
 * description    :
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-12-07        NAHAEJUN       최초 생성
 */
public interface MemberJpaRepository extends MemberRepository, JpaRepository<Member,Integer> {
}
