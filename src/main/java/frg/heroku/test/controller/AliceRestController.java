package frg.heroku.test.controller;

import frg.heroku.test.model.AliceResponseResponse;
import frg.heroku.test.model.Msg;
import frg.heroku.test.payload.req.AddMsgReq;
import frg.heroku.test.payload.req.AliceRequest;
import frg.heroku.test.payload.res.AliceResponse;
import frg.heroku.test.service.AliceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
    public AliceResponse repeat(@RequestBody AliceRequest req, HttpServletRequest request) { //, ServerHttpRequest request) {
        log.info("---------------");

        /*
        log.info("1) request.getRemoteAddress().getHostName() = " + request.getRemoteAddress().getHostName());
        log.info("2) request.getRemoteAddress().getHostString()= " + request.getRemoteAddress().getHostString());
        log.info("3) request.getRemoteAddress().getAddress() = " + request.getRemoteAddress().getAddress());
        log.info("4) request.getRemoteAddress().getPort()= " + request.getRemoteAddress().getPort());
         */


        log.info("1) request.getRequestURI().toString() = " + request.getRequestURI());
        log.info("2) request.getRequestURL().toString() = " + request.getRequestURL().toString());
        log.info("3) request.getRemoteAddr().toString() = " + request.getRemoteAddr());
        log.info("4) request.getRemoteHost().toString() = " + request.getRemoteHost());
        log.info("5) request.getRemotePort().toString() = " + request.getRemotePort());

        log.info("---------------");
        return aliceService.call(req);
    }

}
