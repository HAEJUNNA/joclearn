package jocture.joclearn.etc.object5;

import jocture.joclearn.etc.object.MemberConst;

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
public class MemberMain5 {

    static void main() {
        Member5 m1 = Member5.builder()  //선택1
            .email(MemberConst.EMAIL)
            .nickname(MemberConst.NICKNAME)
            .phone(MemberConst.PHONE)
            .address(MemberConst.ADDRESS)
            .build();
        System.out.println(">>> m1: " + m1);

        Member5 m2 = Member5.Builder.builder()  //선택2
            .email(MemberConst.EMAIL)
            .nickname(MemberConst.NICKNAME)
            .phone(MemberConst.PHONE)
            .address(MemberConst.ADDRESS)
            .build();
        System.out.println(">>> m2: " + m2);
    }
}
