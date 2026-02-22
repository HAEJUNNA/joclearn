package jocture.joclearn.etc.object7;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * MethodName     : 
 * description    :
 * 
 * 단계별 빌더 패턴
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
public class Member7 {
    private final String email;
    private final String nickName;
    private final String phone;
    private final String address;

    public Member7(String email, String nickName, String phone, String address) {
        this.email = email;
        this.nickName = nickName;
        this.phone = phone;
        this.address = address;
    }
}
