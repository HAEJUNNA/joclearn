package jocture.joclearn.etc.object5;

import lombok.ToString;

/**
 * MethodName     : 
 * description    :
 *
 * 빌더 패턴
 *
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-01-24        NAHAEJUN       최초 생성
 */
@ToString
public class Member5 {

    private final String email;
    private final String nickName;
    private final String phone;
    private final String address;

    public Member5(String email, String nickName, String phone, String address) {
        this.email = email;
        this.nickName = nickName;
        this.phone = phone;
        this.address = address;
    }

    //선택1 - 롬북 구분 방식
    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private String email;
        private String nickName;
        private String phone;
        private String address;

        private Builder() { }

        //선택2
        public static Builder builder() {
            return new Builder();
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder nickname(String email){
            this.nickName = nickName;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Member5 build(){
            return new Member5(email,nickName,phone,address);
        }
    }

}
