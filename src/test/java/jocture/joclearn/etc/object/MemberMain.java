package jocture.joclearn.etc.object;

/**
 * MethodName     : 
 * description    :
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-01-24        NAHAEJUN       최초 생성
 */
public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member();
        member.setNickName("haejun");
        member.setEmail("<EMAIL>");
        member.setPhone("010-1234-5678");
        member.setAddress("서울특별시 강남구 강남대로 123");
        System.out.println(">>>> member: " + member);
    }
}
