package com.example.day15.practice.population;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PopulationManager {

        private final Map<String, Integer> population; // 도시 이름(String)을 키로, 인구(Integer)를 값으로 갖는 맵을 선언합니다.

        public PopulationManager() {
            this.population = new HashMap<>(); // 생성자에서 맵을 초기화합니다.
        }

        public void addOrUpdateCity(String city, int population) {
            this.population.put(city, population); // 도시와 인구를 맵에 추가하거나 업데이트합니다.
        }

        public void removeCity(String city) {
            this.population.remove(city); // 도시를 맵에서 삭제합니다.
        }

        public void displayPopulation(String city) {
            if (this.population.containsKey(city)) {
                System.out.println("도시: " + city + " || 인구: " + this.population.get(city)); // 특정 도시의 인구를 출력합니다.
            } else {
                System.out.println("해당 도시의 정보를 찾을 수 없습니다.");
            }
        }

        public void displayAll() {
            for (Map.Entry<String, Integer> entry : this.population.entrySet()) {
                System.out.println("도시: " + entry.getKey() + " || 인구: " + entry.getValue()); // 모든 도시의 인구를 출력합니다.
            }
        }
}
