package com.easy.springboot.h5perf.mapper;

import com.easy.springboot.h5perf.model.TestTimeData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestTimeDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_time_data
     *
     * @mbg.generated Sat Apr 22 16:27:42 CST 2017
     */
    int insert(TestTimeData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_time_data
     *
     * @mbg.generated Sat Apr 22 16:27:42 CST 2017
     */
    int insertSelective(TestTimeData record);
}
