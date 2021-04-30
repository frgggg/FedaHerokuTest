package frg.heroku.test.controller;

import frg.heroku.test.model.Msg;
import frg.heroku.test.payload.req.AddMsgReq;
import frg.heroku.test.service.MsgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("msg")
public class MsgRestController {
    private MsgService msgService;

    @Autowired
    public MsgRestController(MsgService msgService) {
        this.msgService = msgService;
    }

    @GetMapping("")
    public String hello() {
        return "Hello from Feda And Heroku test!!!";
    }

    @PostMapping("")
    public Iterable<Msg> addMsg(@RequestBody AddMsgReq req) {
        return msgService.addNewMsg(req.getText());
    }
}
