package frg.heroku.test.payload.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import frg.heroku.test.model.AliceResponseResponse;
import frg.heroku.test.model.AliceResponseSession;
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
}
