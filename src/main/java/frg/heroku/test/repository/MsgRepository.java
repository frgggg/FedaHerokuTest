package frg.heroku.test.repository;

import frg.heroku.test.model.Msg;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsgRepository extends CrudRepository<Msg,Long> {}
