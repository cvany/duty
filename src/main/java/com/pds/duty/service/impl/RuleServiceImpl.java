package com.pds.duty.service.impl;

import com.pds.duty.domain.dto.RuleDTO;
import com.pds.duty.domain.vo.RuleVO;
import com.pds.duty.mapper.IRuleMapper;
import com.pds.duty.service.IRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RuleServiceImpl implements IRuleService {

    @Autowired
    IRuleMapper iRuleMapper;

    @Override
    public List<RuleDTO> findAllByGroupId(RuleVO ruleVo) {
        return iRuleMapper.findAllByGroupId(ruleVo);
    }
}
