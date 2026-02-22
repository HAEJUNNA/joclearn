package jocture.joclearn.etc.object8;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * MethodName     : 
 * description    :
 * 
 * 필드를 순서대로 선언하는걸 강제하는 패턴이다.
 * 
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-01-24        NAHAEJUN       최초 생성
 */
@Builder
@AllRequiredArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@ToString
public class Member8 {
    private final String email;
    private final String nickName;
    private final String phone;
    private final String address;

    public Member8(String email, String nickName, String phone, String address) {
        this.email = email;
        this.nickName = nickName;
        this.phone = phone;
        this.address = address;
    }

    public interface EmailStack {
        Builder email(String email);
    }
}
