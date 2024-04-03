package com.yupi.springbootinit.model.vo;

import lombok.Data;

/**
 * ai 返回对象
 */
@Data
public class BiResponse {
    private String genChart;

    private String genResult;

    private Long chartId;
}
