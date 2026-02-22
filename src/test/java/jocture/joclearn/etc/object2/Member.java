package jocture.joclearn.etc.object2;

import lombok.ToString;

/**
 * MethodName     : 
 * description    :
 * 
 *  생성자 패턴
 * 
 * @param         : 
 * @return        :
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

    public Member(String email, String nickName) {
        this(email, nickName, null);
    }

    public Member(String email, String nickName, String phone) {
        this(email, nickName, phone, null);
    }

    public Member(String email, String nickName, String phone, String address) {
        this.email = email;
        this.nickName = nickName;
        this.phone = phone;
        this.address = address;
    }

}
