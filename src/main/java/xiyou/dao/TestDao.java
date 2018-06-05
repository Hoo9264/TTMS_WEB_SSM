package xiyou.dao;

import org.apache.ibatis.annotations.Select;
import xiyou.pojo.User;

import java.util.List;

public interface TestDao {

    @Select("SELECT * FROM user")
    List<User> QueryAll();
}
