package com.papcloud.spring.controller;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by mohan.saravanan on 13/05/2014.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusJson {

    private Boolean status;

    public StatusJson(Boolean status) {
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }
}
