package frg.heroku.test.controller;

import frg.heroku.test.model.AliceResponseResponse;
import frg.heroku.test.model.Msg;
import frg.heroku.test.payload.req.AddMsgReq;
import frg.heroku.test.payload.req.AliceRequest;
import frg.heroku.test.payload.res.AliceResponse;
import frg.heroku.test.service.AliceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/alice")
public class AliceRestController {

    private AliceService aliceService;

    @Autowired
    public AliceRestController(AliceService aliceService) {
        this.aliceService = aliceService;
    }

    @PostMapping("")
    public AliceResponse repeat(@RequestBody AliceRequest req) {
        return aliceService.call(req);
    }

}
