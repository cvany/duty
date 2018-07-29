package com.pds.duty.service;

import com.pds.duty.domain.dto.PersonDTO;
import com.pds.duty.domain.vo.PersonVO;

import java.util.List;

public interface IPersonService {

    /**
     * 根据组id查找值班人员
     *
     * @param personVO
     * @return
     */
    List<PersonDTO> findPersons(PersonVO personVO);
}
