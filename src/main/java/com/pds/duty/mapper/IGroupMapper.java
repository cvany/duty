package com.pds.duty.mapper;

import com.pds.duty.domain.base.EntityMapper;
import com.pds.duty.domain.dto.GroupDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IGroupMapper extends EntityMapper<GroupDTO, Integer> {

}
