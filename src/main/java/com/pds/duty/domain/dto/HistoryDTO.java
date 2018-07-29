package com.pds.duty.domain.dto;

import com.pds.duty.domain.base.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 值班记录数据传输类
 */
@Data
public class HistoryDTO  extends BaseEntity {
    private Integer id;
    private String name;
    private String week;
    private Date createTime;
}
