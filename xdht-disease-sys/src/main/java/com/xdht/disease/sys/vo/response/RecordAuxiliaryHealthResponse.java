package com.xdht.disease.sys.vo.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class RecordAuxiliaryHealthResponse {
    @ApiModelProperty(value = "辅助卫生用室调查表")
    private Map<String, Object> recordAuxiliaryHealth;

    @ApiModelProperty(value = "辅助卫生用室调查表--调查内容")
    private List<Map<String, Object>> recordAuxiliaryHealthDataList;
}