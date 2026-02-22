package api;

import org.springframework.web.bind.annotation.*;
import jocture.joclearn.application.member.data.dto.MemberJoinRequest;
import jocture.joclearn.application.member.service.MemberReader;
import jocture.joclearn.application.member.service.MemberWriter;
import lombok.RequiredArgsConstructor;

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
@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberApi {

    private final MemberReader memberReader;
    private final MemberWriter memberWriter;

    /* 회원 목록 조회 */
    @GetMapping
    public void getMembers() {
        //TODO

    }
    /* 특정 회원 조회 */
    @GetMapping("/{memberId}")
    public void getMember() {
        //TODO
    }
    /* 회원 가입 */
    @PostMapping
    public void joinMember(MemberJoinRequest request) {
        //TODO
        memberWriter.joinMember2(request);
    }
    /* 회원정보 수정 */
    @PutMapping("/{memberId}")
    //@PutMapping("/me") 자기 자신의 정보를 조회하고 수정할때 "me"라는 키워드 사용
    public void updateMember() {
        //TODO
    }

    /* 회원 탈퇴 */
    @DeleteMapping("/{memberId}")
    public void leaveMember() {
        //TODO
    }
}
