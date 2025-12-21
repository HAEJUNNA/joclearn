package jocture.joclearn.application.member.service;

import org.springframework.stereotype.Service;
import jocture.joclearn.application.member.data.dto.MemberJoinRequest;
import jocture.joclearn.domain.common.exception.NotFoundException;
import jocture.joclearn.domain.member.Member;
import jocture.joclearn.domain.member.MemberRepository;
import jocture.joclearn.domain.member.PasswordEncoder;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService implements MemberReader, MemberWriter {

    private final PasswordEncoder passwordEncoder;
    private final MemberRepository memberRepository;

    @Override
    public void getMembers() {

    }

    @Override
    public Member getMember(int memberId) {
        // 있을때,없을때를 처리하기 위해서 서비스에서 처리(서비스는 비즈니스 로직이 있어야하는곳이다.) 그대로 넘긴다는건 책임전가
        return memberRepository.findById(memberId)
            .orElseThrow(()-> new NotFoundException("회원을 찾을 수 없습니다. : " + memberId));
    }

    @Override
    public Member joinMember(MemberJoinRequest request) {
        //수많은 멤버 필드 생성을 하나로 가릴수 있다?
        //Member member = Member.create(request.nickname(), request.email(), request.password(), passwordEncoder);
        // request.toEntity = request를 엔티티를 만든다.
        Member member = request.toEntity(passwordEncoder);
        System.out.println("save() 호출 전");
        Member savedMember = memberRepository.save(member);
        System.out.println("save() 호출 후");
        return savedMember;
    }

    @Override
    public void updateMember() {

    }

    @Override
    public void leaveMember() {

    }
}
