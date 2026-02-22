package jocture.joclearn.etc.object2;

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

    static void main() {
        Member m1 = new Member(MemberConst.EMAIL, MemberConst.NICKNAME, MemberConst.PHONE, MemberConst.ADDRESS);
        System.out.println(">>> m1: " + m1);

        Member m2 = new Member(MemberConst.EMAIL, MemberConst.NICKNAME);
        System.out.println(">>> m2: " + m2);

        Member m3 = new Member(MemberConst.EMAIL, MemberConst.NICKNAME, MemberConst.PHONE);
        System.out.println(">>> m3: " + m3);
    }
}
