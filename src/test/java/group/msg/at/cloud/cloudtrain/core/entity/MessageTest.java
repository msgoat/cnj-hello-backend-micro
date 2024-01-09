package group.msg.at.cloud.cloudtrain.core.entity;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test which verifies that {@code entity} {@link Message} works as expected.
 */
class MessageTest {

    @Test
    void givenValidInitialValuesConstructsValidInstance() {
        final UUID MESSAGE_ID = UUID.randomUUID();
        final String MESSAGE_CODE = "1232";
        final String MESSAGE_TEXT = "This is a test!";
        final Locale MESSAGE_LOCALE = Locale.ENGLISH;

        Message underTest = new Message(MESSAGE_ID);
        underTest.setCode(MESSAGE_CODE);
        underTest.setText(MESSAGE_TEXT);
        underTest.setLocale(MESSAGE_LOCALE);

        assertThat(underTest.getId()).as("id must match").isEqualTo(MESSAGE_ID);
        assertThat(underTest.getCode()).as("code must match").isEqualTo(MESSAGE_CODE);
        assertThat(underTest.getText()).as("text must match").isEqualTo(MESSAGE_TEXT);
        assertThat(underTest.getLocale()).as("locale must match").isEqualTo(MESSAGE_LOCALE);
    }
}
