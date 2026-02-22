package jocture.joclearn.etc.object3;

import lombok.ToString;

/**
 * MethodName     : 
 * description    :
 * 정적 팩토리 메서드 사용
 *
 *  @param         :
 * @return        :
 *
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-01-24        NAHAEJUN       최초 생성
 */
@ToString
public class Member {

    private final String email;
    private final String nickName;
    private final String phone;
    private final String address;

    private Member(String email, String nickName, String phone, String address) {
        this.email = email;
        this.nickName = nickName;
        this.phone = phone;
        this.address = address;
    }

    public static Member withAll(String email, String nickName, String phone, String address) {
        return new Member(email, nickName, phone, address);
    }
}
