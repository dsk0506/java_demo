package com.dsk.mapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import com.dsk.bean.primary.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by dsk on 16/7/28.
 */
public interface UserMapper {

    @Insert("INSERT into user(name,age) VALUES( #{name}, #{age})")
    void insertUser(User user);

    @Select("select * from user where id= #{id}")
    public User getUserByID(int id);

    @Insert("insert into user(name, age) values(#{name}, #{age})")
    public int add(User user);

    @Delete("delete from user where id = #{id}")
    public int deleteById(int id);

    @Update("update user set name = #{name}, age = #{age} where id = #{id}")
    public int update(User user);

    @Select("select * from user where id = #{id}")
    public User getUserById(int id);

    @Select("select * from user")
    public List<User> getAllUsers();
}
