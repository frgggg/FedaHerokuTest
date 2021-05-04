package frg.heroku.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AliceRequestRequest {

    @JsonProperty("original_utterance")
    private String originalUtterance;

    @JsonProperty("type")
    private String type;

    @JsonProperty("nlu")
    private AliceRequestNlu aliceRequestNlu;

    @JsonProperty("markup")
    private AliceRequestMarkup aliceRequestMarkup;

}
