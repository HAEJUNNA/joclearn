package jocture.joclearn.etc.object3;

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
public class MemberMain {

    static void main() {
        Member m1 = Member.withAll(MemberConst.EMAIL, MemberConst.NICKNAME, MemberConst.PHONE, MemberConst.ADDRESS);
        System.out.println(">>> m1: " + m1);

        Member m2 = Member.withBasic(MemberConst.EMAIL, MemberConst.NICKNAME);
        System.out.println(">>> m2: " + m2);

        Member m3 = Member.withBasicAndPhone(MemberConst.EMAIL, MemberConst.NICKNAME, MemberConst.PHONE);
        System.out.println(">>> m3: " + m3);

        Member m4 = Member.withBasicAndAddress(MemberConst.EMAIL, MemberConst.NICKNAME, MemberConst.ADDRESS);
        System.out.println(">>> m4: " + m4);
    }
}
