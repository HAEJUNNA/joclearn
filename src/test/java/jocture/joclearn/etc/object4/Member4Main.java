package jocture.joclearn.etc.object4;

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
public class Member4Main {
    static void main() {
        Member4.BasicInfo basicInfo = new Member4.BasicInfo(MemberConst.EMAIL, MemberConst.NICKNAME);
        Member4 m1 = new Member4(basicInfo);
        System.out.println(">>> m1: " + m1);

        Member4.ExtraInfo extraInfo = new Member4.ExtraInfo(MemberConst.PHONE, MemberConst.ADDRESS);
        Member4 m2 = new Member4(basicInfo, extraInfo);
        System.out.println(">>> m2: " + m2);
    }
}
