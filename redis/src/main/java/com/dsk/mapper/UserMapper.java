package com.dsk.mapper;
import org.apache.ibatis.annotations.Insert;
import com.dsk.bean.primary.User;
/**
 * Created by dsk on 16/7/28.
 */
public interface UserMapper {

    @Insert("INSERT into user(name,age) VALUES( #{name}, #{age})")
    void insertUser(User user);
}
