package frg.heroku.test.service;

import frg.heroku.test.payload.req.AliceRequest;
import frg.heroku.test.payload.res.AliceResponse;

public interface AliceService {
    AliceResponse call(AliceRequest req);
}
