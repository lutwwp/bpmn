package com.wwp.bpmn.api;

import com.wwp.bpmn.domain.dto.ProcessDefinitionDto;
import com.wwp.bpmn.domain.dto.ProcessInstanceDto;
import com.wwp.bpmn.domain.entity.ProcessDefinition;
import com.wwp.bpmn.domain.entity.ProcessInstance;

/**
 * @author wwp
 * @date 2022年06月30日 15:36
 */
public interface ProcessResourceApi {

    /**
     * 部署流程
     * @param processDefinitionDto
     * @return
     */
    ProcessDefinition deploy(ProcessDefinitionDto processDefinitionDto);

    /**
     * 启动流程实例
     * @param processInstanceDto
     * @return
     */
    ProcessInstance start(ProcessInstanceDto processInstanceDto);
}
