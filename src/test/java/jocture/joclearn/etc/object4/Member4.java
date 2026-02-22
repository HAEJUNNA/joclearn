package jocture.joclearn.etc.object4;

/**
 * MethodName     : 
 * description    :
 * 
 * 1. 빌더패턴 : 파라미터 사용 객체
 * 2. 레코드 패턴 :
 * 
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-01-24        NAHAEJUN       최초 생성
 */
public class Member4 {

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

    public Member4(){

    }

    public record BasicInfo(String email, String nickName){}

    public record ExtraInfo(String phone, String address){}
    
}
