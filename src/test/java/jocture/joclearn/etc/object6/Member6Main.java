package jocture.joclearn.etc.object6;

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
public class Member6Main {
    static void main() {
        Member6 m1 = Member6.withBasic(MemberConst.EMAIL, MemberConst.NICKNAME)
            .phone(MemberConst.PHONE)
            .address(MemberConst.ADDRESS)
            .build();
        System.out.println(">>> m1: " + m1);

        Member6 m2 = Member6.withBasic(MemberConst.EMAIL, MemberConst.NICKNAME)
            .build();
        System.out.println(">>> m2: " + m2);
    }
}
