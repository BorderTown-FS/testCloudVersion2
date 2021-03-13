package com.testCloud.springCloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：fengshuo
 * @date ：Created in 2021/3/13 16:57
 * @description：消费实体类
 * @version: 1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private long id;
    private String serial;
}
