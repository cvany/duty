package com.pds.duty.domain.dto;

import com.pds.duty.domain.base.BaseEntity;
import lombok.Data;

/**
 * 值班人员数据传输类
 */
@Data
public class PersonDTO extends BaseEntity {
    private Integer id;
    private String name;
    private Integer groupId;
}
