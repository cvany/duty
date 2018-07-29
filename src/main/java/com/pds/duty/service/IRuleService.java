package com.pds.duty.service;

import com.pds.duty.domain.dto.RuleDTO;
import com.pds.duty.domain.vo.RuleVO;

import java.util.List;

public interface IRuleService {
    /**
     * 查找該項目組下所有組員值班情況
     * @param ruleVo
     * @return
     */
    List<RuleDTO> findAllByGroupId(RuleVO ruleVo);
}
