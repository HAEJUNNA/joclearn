package jocture.joclearn.etc.object6;

/**
 * MethodName     : 
 * description    :
 *
 * 빌더 패턴 - 필수값 지정
 * 빌더 패턴을 생성시, 파라미터를 빠트리지 않고 쓸수있게 하는 방법.
 * 이경우는 롬복 어노테이션으로는 만들수 없고, 직접 작성해야한다.
 *
 * @param         : 
 * @return        :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-01-24        NAHAEJUN       최초 생성
 */
@ToString
public class Member6 {

    private final String email;
    private final String nickname;
    private final String phone;
    private final String address;

    private Member6(String email, String nickname, String phone, String address) {
        this.email = email;
        this.nickname = nickname;
        this.phone = phone;
        this.address = address;
    }

    public static Builder withBasic(String email, String nickname) {
        return new Builder(email, nickname);
    }


    public static class Builder {

        private String email;
        private String nickname;
        private String phone;
        private String address;

        private Builder(String email, String nickname) {
            this.email = email;
            this.nickname = nickname;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Member6 build() {
            return new Member6(email, nickname, phone, address);
        }
    }
}
