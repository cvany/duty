package com.pds.duty.mapper;

import com.pds.duty.domain.base.EntityMapper;
import com.pds.duty.domain.dto.RuleDTO;
import com.pds.duty.domain.vo.RuleVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IRuleMapper extends EntityMapper<RuleDTO, Integer> {

    /**
     * 查找該項目組下所有組員值班情況
     * @param ruleVo
     * @return
     */
    List<RuleDTO> findAllByGroupId(RuleVO ruleVo);

}
