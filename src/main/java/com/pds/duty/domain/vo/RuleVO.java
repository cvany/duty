package com.pds.duty.domain.vo;

import com.pds.duty.domain.base.BaseVO;
import lombok.Data;

import java.util.Date;

/**
 * 值班人员数据传输类
 */
@Data
public class RuleVO extends BaseVO {
    private Integer id;
    private Integer groupId;
    private Integer personId;
    private String name;
    private String weekStatus;
    private String weekendStatus;
    private Date createTime;
    private Date modifyTime;
}
