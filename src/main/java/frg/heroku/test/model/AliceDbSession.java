package frg.heroku.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AliceDbSession {
    private String skillId;
    private String userId;
    private String sessionId;

    private String status;

    

}
