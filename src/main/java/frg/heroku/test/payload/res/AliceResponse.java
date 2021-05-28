package frg.heroku.test.payload.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import frg.heroku.test.model.AliceRequestSession;
import frg.heroku.test.model.AliceResponseResponse;
import frg.heroku.test.model.AliceResponseSession;
import frg.heroku.test.model.AliceResponseUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AliceResponse {
    @JsonProperty("session")
    private AliceResponseSession aliceResponseSession;

    @JsonProperty("version")
    private String version;

    @JsonProperty("response")
    private AliceResponseResponse aliceResponseResponse;

    public void setAliceResponseSession(AliceRequestSession aliceRequestSession) {
        aliceResponseSession = new AliceResponseSession(
                aliceRequestSession.getSkillId(),
                aliceRequestSession.getUserId(),
                aliceRequestSession.getSessionId(),
                aliceRequestSession.getNewFlag(),
                aliceRequestSession.getMessageId(),
                new AliceResponseUser(aliceRequestSession.getAliceRequestUser())
        );
    }
}
