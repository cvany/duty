package com.pds.duty.controller;

import com.pds.duty.domain.dto.PersonDTO;
import com.pds.duty.domain.vo.PersonVO;
import com.pds.duty.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    IPersonService personService;

    /**
     *
     * @return
     */
    @RequestMapping("findPersons")
    public String findPersons(PersonVO personVO){
        personVO.setGroupId(1);
        List<PersonDTO> list = personService.findPersons(personVO);
        System.out.println(list.size());
        return "";
    }


}
