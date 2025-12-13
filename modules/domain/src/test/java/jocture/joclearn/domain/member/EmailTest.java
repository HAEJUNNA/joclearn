package jocture.joclearn.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class EmailTest {

    @Test
    void create() {
        Email email = new Email("jocture@gmail.com");
        Assertions.assertThat(email.value()).isEqualTo("jocture@gmail.com");
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "jocture", "@abc.com", "j@a.c"
    })
    void create_fail(String value) {
        assertThatThrownBy(() -> new Email(value))
            .isInstanceOf(IllegalArgumentException.class);
    }

}
