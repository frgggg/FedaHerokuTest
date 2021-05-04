package frg.heroku.test.controller;

import frg.heroku.test.model.AliceResponseResponse;
import frg.heroku.test.model.Msg;
import frg.heroku.test.payload.req.AddMsgReq;
import frg.heroku.test.payload.req.AliceRequest;
import frg.heroku.test.payload.res.AliceResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/alice")
public class AliceRestController {

    @PostMapping("")
    public AliceResponse repeat(@RequestBody AliceRequest req) {
        AliceResponse res = new AliceResponse();

        res.setAliceResponseSession(req.getAliceResponseSession());
        res.setVersion(req.getVersion());
        res.setAliceResponseResponse(
                new AliceResponseResponse("Hello from Herocu and Fedor to Alice!!!", false)
        );

        return res;
    }

}
