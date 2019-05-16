package com.example.demo.dao.user;

import com.example.demo.dao.user.UserEntity;
import com.example.demo.dao.user.UserEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 12:50:58 CST 2019
     */
    long countByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 12:50:58 CST 2019
     */
    int deleteByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 12:50:58 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 12:50:58 CST 2019
     */
    int insert(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 12:50:58 CST 2019
     */
    int insertSelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 12:50:58 CST 2019
     */
    List<UserEntity> selectByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 12:50:58 CST 2019
     */
    UserEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 12:50:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 12:50:58 CST 2019
     */
    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 12:50:58 CST 2019
     */
    int updateByPrimaryKeySelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 12:50:58 CST 2019
     */
    int updateByPrimaryKey(UserEntity record);
}