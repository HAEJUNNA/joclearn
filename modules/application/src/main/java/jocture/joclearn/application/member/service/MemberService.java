package jocture.joclearn.application.member.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * MethodName     : 
 * description    :
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-29        NAHAEJUN       최초 생성
 */
@Service
@Transactional(readOnly = true)
public class MemberService implements MemberWriter,MemberReadr {

    @Override public void getMembers() {

    }

    @Override public void getMember() {

    }


    @Override
    @Transactional
    public void joinMember() {

    }

    @Override
    @Transactional
    public void updateMember() {

    }

    @Override
    @Transactional
    public void leaveMember() {

    }
}
