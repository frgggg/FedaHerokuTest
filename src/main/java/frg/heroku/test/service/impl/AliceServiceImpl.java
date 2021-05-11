package frg.heroku.test.service.impl;

import frg.heroku.test.model.AliceResponseResponse;
import frg.heroku.test.payload.req.AliceRequest;
import frg.heroku.test.payload.res.AliceResponse;
import frg.heroku.test.service.AliceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AliceServiceImpl implements AliceService {

    @Override
    public AliceResponse call(AliceRequest req) {
        return testResProc(req);
    }

    protected AliceResponse testResProc(AliceRequest req) {
        AliceResponse res = new AliceResponse();

        res.setAliceResponseSession(req.getAliceResponseSession());
        res.setVersion(req.getVersion());

        log.info("req = " + req);

        if(req.getAliceRequestRequest().getOriginalUtterance().equalsIgnoreCase("Привет")) {
            res.setAliceResponseResponse(
                    new AliceResponseResponse("И тебе привет от ПЭС!!!", false)
            );
        } else {
            res.setAliceResponseResponse(
                    new AliceResponseResponse("Ты сказал:\"" + req.getAliceRequestRequest().getOriginalUtterance() + "\".", false)
            );
        }

        return res;
    }
}
