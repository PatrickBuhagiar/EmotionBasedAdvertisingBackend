package com.ternary.adverts;

import com.ternary.adverts.dao.Repository;
import com.ternary.adverts.domain.Advert;
import com.ternary.adverts.domain.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    private final Repository repository;

    @Autowired
    public Controller(final Repository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "adverts/choose")
    public @ResponseBody
    Advert getRestaurant(@RequestBody final State state) {
        return repository.findOne(1L);
    }
}
