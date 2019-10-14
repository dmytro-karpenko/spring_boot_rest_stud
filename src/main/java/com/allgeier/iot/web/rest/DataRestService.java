package com.allgeier.iot.web.rest;

import com.allgeier.iot.service.DataStorageService;
import com.allgeier.iot.web.rest.data.DataItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataRestService {

    @Autowired
    DataStorageService service;

    @RequestMapping(value = "/getData", method = RequestMethod.GET)
    List<DataItemDto> getData() {
        List<DataItemDto> data = service.getData();

        return data;
    }

    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    @ResponseBody
    public void saveNewItem(@RequestBody DataItemDto data) {
        service.saveNewItem(data);
    }
}
