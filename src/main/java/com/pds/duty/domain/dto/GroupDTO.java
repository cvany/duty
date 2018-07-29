package com.pds.duty.domain.dto;

import com.pds.duty.domain.base.BaseEntity;
import lombok.Data;

import java.util.List;

/**
 * 项目组数据传输类
 */
@Data
public class GroupDTO extends BaseEntity {
    private Integer id;
    private String name;
    private List<PersonDTO> person;
}
