package com.papcloud.spring.controller;

import com.papcloud.spring.service.StatusService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class StatusControllerTest {

    @Mock
    private StatusService statusService;

    @InjectMocks
    private StatusController underTest = new StatusController(statusService);

    @Test
    public void shouldGetStatus() {
        //given
        when(statusService.getStatus()).thenReturn(true);

        //when
        StatusJson status = underTest.findStatus();

        //then
        assertThat(status, notNullValue());
        assertThat(status.getStatus(), is(true));
    }


}