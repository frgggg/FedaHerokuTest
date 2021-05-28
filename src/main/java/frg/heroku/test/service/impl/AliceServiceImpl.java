package frg.heroku.test.service.impl;

import frg.heroku.test.model.AliceResponseResponse;
import frg.heroku.test.payload.req.AliceRequest;
import frg.heroku.test.payload.res.AliceResponse;
import frg.heroku.test.service.AliceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@Service
public class AliceServiceImpl implements AliceService {

    @Override
    public AliceResponse call(AliceRequest req) {
        return testResProc(req);
    }

    protected AliceResponse testResProc(AliceRequest req) {
        AliceResponse res = new AliceResponse();

        res.setAliceResponseSession(req.getAliceRequestSession());
        res.setVersion(req.getVersion());

        String reg = "[Пп]ривет\\.*";

        log.info("req = " + req);
        log.info("req.getAliceRequestRequest().getOriginalUtterance() = " + req.getAliceRequestRequest().getOriginalUtterance());
        for(String token: req.getAliceRequestRequest().getAliceRequestNlu().getTokens()) {
            log.info("    token = " + token);
        }
        if(
                Pattern.matches(reg, req.getAliceRequestRequest().getOriginalUtterance())
        ) {
            res.setAliceResponseResponse(
                    new AliceResponseResponse("И тебе привет от ПЭС!!!", false)
            );
        } else {
            res.setAliceResponseResponse(
                    new AliceResponseResponse("Ты сказал:\"" + req.getAliceRequestRequest().getOriginalUtterance() + "\".", false)
            );
        }
        log.info("");
        return res;
    }
}
