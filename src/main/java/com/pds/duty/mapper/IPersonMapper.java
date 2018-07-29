package com.pds.duty.mapper;

import com.pds.duty.domain.base.EntityMapper;
import com.pds.duty.domain.dto.PersonDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IPersonMapper extends EntityMapper<PersonDTO, Integer> {

}
