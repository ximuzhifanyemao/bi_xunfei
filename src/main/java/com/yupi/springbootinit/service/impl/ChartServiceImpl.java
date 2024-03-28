package com.yupi.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.springbootinit.model.entity.Chart;
import com.yupi.springbootinit.service.ChartService;
import com.yupi.springbootinit.mapper.ChatMapper;
import org.springframework.stereotype.Service;

/**
* @author 13238
* @description 针对表【chat(图表信息表)】的数据库操作Service实现
* @createDate 2024-03-02 09:15:06
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChatMapper, Chart>
    implements ChartService {

}




