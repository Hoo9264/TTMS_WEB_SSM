package xiyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiyou.dao.StudioMapper;
import xiyou.pojo.Studio;
import xiyou.service.StudioService;
@Service
public class StudioServiceImpl implements StudioService{

    @Autowired
    private StudioMapper studioMapper;
    @Override
    public Studio selectByPrimaryKey(int studioId) {
        return studioMapper.selectByPrimaryKey(studioId);
    }
}
