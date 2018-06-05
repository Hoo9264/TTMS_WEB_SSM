package xiyou.dao;

import org.apache.ibatis.annotations.Select;
import xiyou.pojo.Play;

import java.util.List;

public interface PlayDao {

    /**
     * 查询所有play
     * @return
     */
    @Select("Select * from user")
    List<Play> queryAll();

    /**
     * 通过id查询
     * @param play_id
     * @return
     */
    Play queryById(int play_id);

    /**
     * 通过id查询
     * @param play_id
     * @return
     */
    Play queryPlayById(int play_id);

    /**
     * 插入
     * @param play
     */
    void insert(Play play);

    /**
     * 更新
     * @param play
     */
    void update(Play play);

    /**
     * 通过id删除
     * @param play_id
     */
    void delete(int play_id);
}
