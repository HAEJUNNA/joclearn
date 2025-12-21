package jocture.joclearn.domain.common.exception;

/**
 * MethodName     : 
 * description    :
 * 
 * 특별한 기능이없어 오버라이딩만 진행
 * 
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-12-21        NAHAEJUN       최초 생성
 */
public class NotFoundException extends DomainException{
    
    //예외는 항상 메시지가 있어야 한다.
    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
