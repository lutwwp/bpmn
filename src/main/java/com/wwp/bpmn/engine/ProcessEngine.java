package com.wwp.bpmn.engine;

import com.wwp.bpmn.engine.config.ProcessEngineConfiguration;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wwp
 * @date 2022年06月30日 15:00
 */
@Component
public class ProcessEngine {
    /**
     * 全局配置
     */
    @Resource
    private ProcessEngineConfiguration processEngineConfiguration;

    private static final String VERSION = "1.0.0";

    public static String version() {
        return VERSION;
    }
}
