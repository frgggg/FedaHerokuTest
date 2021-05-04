package frg.heroku.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AliceRequestMarkup {
    @JsonProperty("dangerous_context")
    private Boolean dangerousContext;
}
