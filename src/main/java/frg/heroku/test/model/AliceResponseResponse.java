package frg.heroku.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AliceResponseResponse {
    @JsonProperty("text")
    private String text;

    @JsonProperty("end_session")
    private Boolean endSession;
}
