package com.allgeier.iot.service;

import com.allgeier.iot.web.rest.data.DataItemDto;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Setter
public class DataStorageService {

    private List<DataItemDto> items;

    public List<DataItemDto> getData() {

        if (items == null){
            items = new ArrayList<>();
        }

        return items;
    }

    public void saveNewItem(DataItemDto data) {

        if (items == null){
            items = new ArrayList<>();
        }

        items.add(data);
    }
}
