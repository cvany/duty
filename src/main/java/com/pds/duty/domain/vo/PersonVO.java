package com.pds.duty.domain.vo;

import com.pds.duty.domain.base.BaseVO;
import lombok.Data;

/**
 * 值班人员数据传输类
 */
@Data
public class PersonVO extends BaseVO {
    private Integer id;
    private Integer groupId;
    private String name;
}
