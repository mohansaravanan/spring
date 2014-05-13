package com.papcloud.spring.service;

import org.springframework.stereotype.Service;

/**
 * Created by mohan.saravanan on 13/05/2014.
 */
@Service
public class StatusServiceImpl implements StatusService {

    @Override
    public Boolean getStatus() {
        return true;
    }

}
