package com.test.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.entity.Test;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author hanlipeng
 * @date 2019-05-31
 */
@Mapper
@Repository
public interface TestDAO extends BaseMapper<Test> {
    int insertOnDuplicateKeyUpdate(List<Test> tests);
}
