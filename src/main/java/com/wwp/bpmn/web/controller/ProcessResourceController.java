package com.wwp.bpmn.web.controller;

import com.wwp.bpmn.api.ProcessResourceApi;
import com.wwp.bpmn.domain.dto.ProcessDefinitionDto;
import com.wwp.bpmn.domain.dto.ProcessInstanceDto;
import com.wwp.bpmn.domain.entity.ProcessDefinition;
import com.wwp.bpmn.domain.entity.ProcessInstance;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wwp
 * @date 2022年06月30日 15:37
 */
@RestController
@RequestMapping("process/v1/resource/")
public class ProcessResourceController implements ProcessResourceApi {

    /**
     * 部署流程
     *
     * @param processDefinitionDto
     * @return
     */
    @Override
    @PostMapping("deploy")
    public ProcessDefinition deploy(ProcessDefinitionDto processDefinitionDto) {
        return null;
    }

    /**
     * 启动流程实例
     *
     * @param processInstanceDto
     * @return
     */
    @Override
    @PostMapping("start")
    public ProcessInstance start(ProcessInstanceDto processInstanceDto) {
        return null;
    }
}
