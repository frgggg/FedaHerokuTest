package frg.heroku.test.payload.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import frg.heroku.test.model.AliceRequestRequest;
import frg.heroku.test.model.AliceResponseSession;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AliceRequest {
    //TODO
    @JsonProperty("session")
    private AliceResponseSession aliceResponseSession;

    @JsonProperty("version")
    private String version;

    @JsonProperty("request")
    private AliceRequestRequest aliceRequestRequest;
}
