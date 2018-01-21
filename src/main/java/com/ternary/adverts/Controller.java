package com.ternary.adverts;

import com.google.common.collect.ImmutableList;
import com.ternary.adverts.dao.Repository;
import com.ternary.adverts.domain.Advert;
import com.ternary.adverts.domain.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        final ImmutableList<Advert> adverts = ImmutableList.copyOf(repository.findAll());
        final ArrayList<Advert> filteredAdverts = new ArrayList<>();
        filteredAdverts.addAll(adverts.stream().filter(advert -> advert.getAgeGroup() == state.getAgeGroup()).collect(Collectors.toList()));
        filteredAdverts.addAll(adverts.stream().filter(advert -> advert.getEmotion() == state.getEmotion()).collect(Collectors.toList()));
        filteredAdverts.addAll(adverts.stream().filter(advert -> advert.getGender() == state.getGender()).collect(Collectors.toList()));

        final Map<Advert, Long> countMap = filteredAdverts.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        final LinkedList<Advert> list = new LinkedList<>();
        countMap.entrySet().stream().sorted(Map.Entry.<Advert, Long>comparingByValue().reversed()).forEachOrdered(e -> list.add(e.getKey()));

        final Advert first = list.getFirst();
        repository.delete(first.getId());
        first.incrementCount();
        repository.save(first);
        return first;
    }
}
