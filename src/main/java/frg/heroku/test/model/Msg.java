package frg.heroku.test.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table
@NoArgsConstructor
public class Msg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime time;
    private String text;

    public Msg(LocalDateTime time, String text) {
        this.time = time;
        this.text = text;
    }
    public Msg(String text) {
        time = LocalDateTime.now();
        this.text = text;
    }
}
