package jocture.joclearn.application.member.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jocture.joclearn.application.member.data.dto.MemberJoinRequest;
import jocture.joclearn.domain.member.Member;
import jocture.joclearn.domain.member.MemberRepository;
import jocture.joclearn.domain.member.PasswordEncoder;
import lombok.RequiredArgsConstructor;

/**
 * MethodName     : 
 * description    :
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-29        NAHAEJUN       최초 생성
 */
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService implements MemberWriter,MemberReadr {

    private final PasswordEncoder passwordEncoder;
    private final MemberRepository memberRepository;

    @Override public void getMembers() {

    }

    @Override public void getMember() {

    }


    @Override
    @Transactional
    public Member joinMember(MemberJoinRequest request) {
        //수많은 멤버 필드 생성을 하나로 가릴수 있다?
        //Member member = Member.create(request.nickname(), request.email(), request.password(), passwordEncoder);
        // request.toEntity = request를 엔티티를 만든다.
        Member member = request.toEntity(passwordEncoder);
        return memberRepository.save(member);
    }

    @Override
    @Transactional
    public void updateMember() {

    }

    @Override
    @Transactional
    public void leaveMember() {

    }
}
