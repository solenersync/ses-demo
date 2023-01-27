package com.solenersync.sesdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
@RestController
@RequestMapping("/v1/random")
public class RandomBordController {

    private Random randomGenerator;
    private ArrayList<String> catalogue;

    @GetMapping("/random")
    public String index() {
        log.debug("Sending random bird");
        catalogue = new ArrayList<>();
        catalogue.add("blue tit");
        catalogue.add("dunnock");
        catalogue.add("crow");
        catalogue.add("buzzard");
        catalogue.add("bull finch");
        return getRandomItem(catalogue);
    }

    private String getRandomItem(List<String> catalogue){
        randomGenerator = new Random();
        int index = randomGenerator.nextInt(catalogue.size());
        String item = catalogue.get(index);
        return item;
    }

}
