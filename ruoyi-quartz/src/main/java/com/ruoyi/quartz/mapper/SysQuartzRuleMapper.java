package com.ruoyi.quartz.mapper;

import java.util.List;
import com.ruoyi.quartz.domain.SysQuartzRule;

/**
 * 定时任务模块的规则类Mapper接口
 * 
 * @author hsy
 * @date 2020-12-03
 */
public interface SysQuartzRuleMapper 
{
    /**
     * 查询定时任务模块的规则类
     * 
     * @param ruleId 定时任务模块的规则类ID
     * @return 定时任务模块的规则类
     */
    public SysQuartzRule selectSysQuartzRuleById(String ruleId);

    /**
     * 查询定时任务模块的规则类列表
     * 
     * @param sysQuartzRule 定时任务模块的规则类
     * @return 定时任务模块的规则类集合
     */
    public List<SysQuartzRule> selectSysQuartzRuleList(SysQuartzRule sysQuartzRule);

    /**
     * 新增定时任务模块的规则类
     * 
     * @param sysQuartzRule 定时任务模块的规则类
     * @return 结果
     */
    public int insertSysQuartzRule(SysQuartzRule sysQuartzRule);

    /**
     * 修改定时任务模块的规则类
     * 
     * @param sysQuartzRule 定时任务模块的规则类
     * @return 结果
     */
    public int updateSysQuartzRule(SysQuartzRule sysQuartzRule);

    /**
     * 删除定时任务模块的规则类
     * 
     * @param ruleId 定时任务模块的规则类ID
     * @return 结果
     */
    public int deleteSysQuartzRuleById(String ruleId);

    /**
     * 批量删除定时任务模块的规则类
     * 
     * @param ruleIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysQuartzRuleByIds(String[] ruleIds);
}