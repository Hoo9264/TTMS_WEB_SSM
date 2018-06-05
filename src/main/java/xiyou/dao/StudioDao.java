package xiyou.dao;

import xiyou.pojo.Studio;

import java.util.List;

public interface StudioDao {
    /**
     * 查询所有Studio;
     * @return
     */
    List<Studio> queryAll();

    /**
     * 插入
     * @param studio
     */
    void insert(Studio studio);

    /**
     * 更新
     * @param studio
     */
    void update(Studio studio);

    /**
     * 通过id删除
     * @param studio_id
     */
    void delete(int studio_id);
}
