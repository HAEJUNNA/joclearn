package jocture.joclearn.etc.object7;

import jocture.joclearn.etc.object.MemberConst;

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
public class Member7Main {

    static void main() {
        Member7 m1 = Member7.builder()
            .email(MemberConst.EMAIL)
            .nickname(MemberConst.NICKNAME)
            .phone(MemberConst.PHONE)
            .address(MemberConst.ADDRESS)
            .build();
        System.out.println(">>> m1: " + m1);

        Member7 m2 = Member7.builder()
            .email(MemberConst.EMAIL)
            .nickname(MemberConst.NICKNAME)
            .build();
        System.out.println(">>> m2: " + m2);
    }

}
