package jocture.joclearn.application.member.data.dto;

import jocture.joclearn.domain.member.Email;
import jocture.joclearn.domain.member.Member;
import jocture.joclearn.domain.member.PasswordEncoder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

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
public record MemberJoinRequest (
    String nickname,
    String email,
    String password
){
    //public static Member of(MemberJoinRequest request, PasswordEncoder passwordEncoder) {
    //    return Member.create(request.nickname(), request.email(), request.password(), passwordEncoder);
    //}
    //자기 자신을 파라미터로 받읋때 한번더 생각해본다
    public Member toEntity(PasswordEncoder passwordEncoder) {
        return Member.create(nickname, email, password, passwordEncoder);
    }

}
