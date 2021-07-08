package com.example.ncp_test_proj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NcpController {
    @GetMapping("/")
    public List<NcpDto> index() throws Exception{
        NcpDto dto = new NcpDto();
        dto.setName("hong");
        dto.setAddr("sejong");
        dto.setAge(35);

        NcpDto dto2 = new NcpDto();
        dto2.setName("kim");
        dto2.setAddr("daejeon");
        dto2.setAge(20);

        List<NcpDto> list = new ArrayList<NcpDto>();
        list.add(dto);
        list.add(dto2);

        return list;
    }
}
