package com.pds.duty.Enum;

import lombok.Getter;
import lombok.Setter;

public enum  StatusEnum {
    /**
     * 就绪
     */
    REATY("READY"),
    /**
     * 值班中
     */
    PROCESS("PROCESS"),
    /**
     * 已值班
     */
    DONE("DONE");
    @Setter
    @Getter
    private String status;

    StatusEnum(String status){
        this.status =status;
    }


}
