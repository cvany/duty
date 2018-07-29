package com.pds.duty.domain.dto;

import com.pds.duty.domain.base.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 规则数据传输类
 */
@Data
public class RuleDTO extends BaseEntity {
    private Integer id;
    private Integer groupId;
    private Integer personId;
    private String name;
    private String weekStatus;
    private String weekendStatus;
    private Date createTime;
    private Date modifyTime;
}
