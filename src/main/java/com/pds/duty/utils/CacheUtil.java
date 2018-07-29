package com.pds.duty.utils;

import com.pds.duty.domain.dto.RuleDTO;
import com.pds.duty.domain.vo.RuleVO;
import com.pds.duty.mapper.IRuleMapper;

import java.util.ArrayList;
import java.util.List;

public class CacheUtil {
    /**
     * 工作日值班缓存情况
     */
    public static List<RuleDTO> cacheList = new ArrayList<>();
    /**
     * 规则mapper
     */
    private static IRuleMapper iRuleMapper = null;


    /**
     * 获取值班规则
     *
     * @return
     */
    public static List<RuleDTO> getRule(RuleVO rulevo) {
        //如果缓存集合为空，则从数据库中获取数据
        if (cacheList.isEmpty()) {
            if (null == iRuleMapper) {
                iRuleMapper = (IRuleMapper) ContextUtil.getBean(IRuleMapper.class);
            }
            cacheList = iRuleMapper.findAllByGroupId(rulevo);
        }

        return cacheList;
    }

    /**
     * 更新值班规则状态
     *
     * @param rulevo
     */
    public static void updateRule(RuleVO rulevo) {

    }


}
