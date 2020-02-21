package com.altsen.mb.pojo;

import lombok.Data;

/**
 * @AUTOR zxs
 * @Date: 2020/2/21 15:19
 * @Content:
 **/
@Data
public class ResponseResult {
    private Integer code;

    public ResponseResult(Integer code) {
        this.code = code;
    }
}
