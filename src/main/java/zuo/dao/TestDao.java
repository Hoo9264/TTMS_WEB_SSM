package zuo.dao;

import org.apache.ibatis.annotations.Select;
import zuo.entity.User;

import java.util.List;

public interface TestDao {

    @Select("SELECT * FROM user")
    List<User> QueryAll();
}
