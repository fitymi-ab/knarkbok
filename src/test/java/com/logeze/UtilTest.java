package com.logeze;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilTest {

    @Test
    void should_verify_test_setup() {
        assertThat(true).isFalse();
    }
}
