package jocture.joclearn.domain.member;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * MethodName     : 
 * description    :
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-01-18        NAHAEJUN       최초 생성
 */
public abstract class MemberFixtures { //유틸성을 위해  클래스명뒤에 s를 붙이는게 관례다.


    public static Member create(){
        //PasswordEncoder passwordEncoder = new StubPasswordEncoder();
        return create("haejun","skrhkaa@sd.com");
    }

    public static Member create(String nickname, String email){
        PasswordEncoder passwordEncoder = new StubPasswordEncoder();
        return Member.create(nickname,email,"asdzx312",passwordEncoder);
    }


}
