package frg.heroku.test.service;

import frg.heroku.test.model.Msg;

import java.util.List;

public interface MsgService {
    Iterable<Msg> addNewMsg(String text);
}
