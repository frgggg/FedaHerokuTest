package frg.heroku.test.service.impl;

import frg.heroku.test.model.Msg;
import frg.heroku.test.repository.MsgRepository;
import frg.heroku.test.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MsgServiceImpl implements MsgService {
    private MsgRepository msgRepository;

    @Autowired
    public MsgServiceImpl(MsgRepository msgRepository) {
        this.msgRepository = msgRepository;
    }

    @Override
    public Iterable<Msg> addNewMsg(String text) {
        msgRepository.save(new Msg(text));
        return msgRepository.findAll();
    }
}
