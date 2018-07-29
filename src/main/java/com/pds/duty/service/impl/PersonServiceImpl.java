package com.pds.duty.service.impl;

import com.pds.duty.domain.dto.PersonDTO;
import com.pds.duty.domain.vo.PersonVO;
import com.pds.duty.mapper.IPersonMapper;
import com.pds.duty.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    IPersonMapper iPersonMapper;

    @Override
    public List<PersonDTO> findPersons(PersonVO personVO) {
        return iPersonMapper.search(personVO);
    }
}
