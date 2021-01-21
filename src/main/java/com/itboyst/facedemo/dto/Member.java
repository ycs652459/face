package com.itboyst.facedemo.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Member implements Serializable {
    @NotNull(message = "{member.mid.notnull.error}")
    private String mid;

}
