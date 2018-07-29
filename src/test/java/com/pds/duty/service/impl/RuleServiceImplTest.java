package com.pds.duty.service.impl;

import com.pds.duty.DutyApplicationTests;
import com.pds.duty.domain.dto.RuleDTO;
import com.pds.duty.domain.vo.RuleVO;
import com.pds.duty.mapper.IRuleMapper;
import com.pds.duty.utils.CacheUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class RuleServiceImplTest extends DutyApplicationTests {

    @Autowired
    IRuleMapper iRuleMapper;

    @Test
    public void findAllByGroupId() {
        RuleVO ruleVO =new RuleVO();
        ruleVO.setGroupId(1);
//        List<RuleDTO> list = iRuleMapper.findAllByGroupId(ruleVO);
        List<RuleDTO> list = CacheUtil.getRule(ruleVO);
        System.out.println(list.size());

    }
}