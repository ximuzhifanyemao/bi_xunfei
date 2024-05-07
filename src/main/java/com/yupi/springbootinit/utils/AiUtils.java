package com.yupi.springbootinit.utils;

import com.yupi.springbootinit.model.dto.chart.AiResultDto;
import org.redisson.api.RedissonClient;

public class AiUtils {
    private final RedissonClient redissonClient;
    public AiUtils(RedissonClient redissonClient){
        this.redissonClient = redissonClient;
    }
    public AiResultDto getAns(long chartId, String question) {
        BigModelChart bigModelChart = new BigModelChart(chartId,redissonClient);
        bigModelChart.getResult(question);
        String aReturn = bigModelChart.getReturn();
        String chartData = "服务错误";
        String onAnalysis = "服务错误";
        if(aReturn.contains("：") && aReturn.contains("然后输出【【【【【"))
            onAnalysis = aReturn.substring(aReturn.indexOf("：") + 1,aReturn.indexOf("然后输出【【【【【"));
        String[] split = aReturn.split("```json");
        if(split.length == 2){
            chartData = split[1].substring(0,split[1].indexOf("```"));
        }

        AiResultDto aiResultDto = new AiResultDto();
        aiResultDto.setChartData(chartData.trim());
        aiResultDto.setOnAnalysis(onAnalysis.trim());

        return aiResultDto;
    }
}
