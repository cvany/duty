package com.pds.duty.controller;

import com.pds.duty.domain.dto.RuleDTO;
import com.pds.duty.domain.vo.RuleVO;
import com.pds.duty.service.IRuleService;
import com.pds.duty.utils.CacheUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RuleController {

    @Autowired
    IRuleService ruleService;

    /**
     *
     * @return
     */
    @RequestMapping("findRules")
    public String findPersons(RuleVO ruleVO){
        ruleVO.setGroupId(1);
        List<RuleDTO> list = CacheUtil.getRule(ruleVO);
        System.out.println(list.size());
        return "";
    }


}
