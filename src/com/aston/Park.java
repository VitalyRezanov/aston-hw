package com.aston;

import java.util.List;

public class Park {
    private List<Attraction> attractions;

    public Park(List<Attraction> attractions) {
        this.attractions = attractions;
    }

    public static class Attraction {
        private String name;
        private int time;
        private double cost;

        public Attraction(String name, int time, double cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "name:" + name + " time:" + time + " cost:" + cost;
        }
    }

    @Override
    public String toString() {
        return attractions.toString();
    }
}
