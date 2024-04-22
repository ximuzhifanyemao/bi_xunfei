package com.yupi.springbootinit.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ChatMapperTest {
    @Resource
    private ChartMapper chartMapper;
    @Test
    void queryChartData() {
       // chartMapper.queryChartData();
    }
}