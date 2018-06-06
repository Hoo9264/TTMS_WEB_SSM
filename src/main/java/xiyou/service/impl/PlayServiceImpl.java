package xiyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiyou.dao.PlayMapper;
import xiyou.pojo.Play;
import xiyou.service.PlayService;
@Service
public class PlayServiceImpl implements PlayService{

    @Autowired
    private PlayMapper playMapper;

    public Play selectByPrimaryKey(int playId) {
        return playMapper.selectByPrimaryKey(playId);
    }
}
