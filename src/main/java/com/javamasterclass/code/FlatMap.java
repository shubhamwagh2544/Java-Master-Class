package com.javamasterclass.code;

import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Country {
    String countryName;
    List<State> states;
}

class State {
    String stateName;
    int population;
}

public class FlatMap {
    public static void main(String[] args) {
        Country country1 = new Country();
        country1.countryName = "India";
        State state1 = new State();
        state1.stateName = "Haryana";
        state1.population = 1000;

        State state2 = new State();
        state2.stateName = "Rajasthan";
        state2.population = 1500;

        State state3 = new State();
        state3.stateName = "Gujarat";
        state3.population = 1200;

        country1.states = List.of(state1, state2, state3);

        Country country2 = new Country();
        country2.countryName = "America";
        State state4 = new State();
        state4.stateName = "Texas";
        state4.population = 1000;

        State state5 = new State();
        state5.stateName = "California";
        state5.population = 1400;

        State state6 = new State();
        state6.stateName = "Florida";
        state6.population = 900;

        country2.states = List.of(state4, state5, state6);

        //we want to work on stream of states for all countries : stream of country<stream of state>

        //get stream of country
        List<Country> countryList = List.of(country1, country2);

        //when we use flatmap, we get stream of states, but we need country info also
        //we need some mechanism to hold both country info and state info :> create record
        //record containing info for country and state

        var finalResult =
                countryList
                .stream()
                .flatMap(country -> country.states.stream()
                        .map(state -> new Triple(
                                country.countryName,
                                state.stateName,
                                state.population
                                )
                        )
                )
                .collect(Collectors.groupingBy(
                                Triple::population,
                                Collectors.mapping(
                                        triple -> new Triple(
                                                triple.country(),
                                                triple.state(),
                                                triple.population()
                                        ),
                                        Collectors.toList()
                                )
                        )
                )
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(entry -> -entry.getKey()))
                .toList()
                .get(0);

        System.out.println(finalResult);
    }
}

record Triple(String country, String state, int population) {
    @Override
    public String toString() {
        return this.country + " : " + this.state;
    }
}