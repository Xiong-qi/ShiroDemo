package com.example.shirodemo.mapper;

import com.example.shirodemo.model.User;
import lombok.Getter;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("shiroMapper")
public class ShiroMapper {


    protected String getStatementNameWrap(String name) {
        return getNameSpace() + "." + name;
    }

    /**
     * 方法功能描述: 通过子类名得到命名空间路径
     *
     * @return 命名空间路径
     *
     */
    private String getNameSpace() {
        return this.getClass().getName();
    }

    @Autowired
    @Getter
    private SqlSessionTemplate sqlSessionTemplate;

    public User findUserByUsername(String username){
        return sqlSessionTemplate.selectOne(getStatementNameWrap("findUserByUsername"),username);
    };

}
