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

    private Member(String email, String nickname, String phone, String address) {
        this.email = email;
        this.nickName = nickname;
        this.phone = phone;
        this.address = address;
    }

    public static Member withAll(String email, String nickname, String phone, String address) {
        return new Member(email, nickname, phone, address);
    }

    public static Member withBasic(String email, String nickname) {
        return new Member(email, nickname, null, null);
    }

    public static Member withBasicAndPhone(String email, String nickname, String phone) {
        return new Member(email, nickname, phone, null);
    }

    public static Member withBasicAndAddress(String email, String nickname, String address) {
        return new Member(email, nickname, null, address);
    }
}
