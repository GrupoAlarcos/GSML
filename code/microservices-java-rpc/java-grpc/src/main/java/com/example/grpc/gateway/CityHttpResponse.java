package com.example.grpc.gateway;
public class CityHttpResponse {

        private String id;

        private String name;
        private String state;
        private Integer population;

        public CityHttpResponse() {
        }

        public CityHttpResponse(String name, String state, Integer population) {
            this.name = name;
            this.state = state;
            this.population = population;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getPopulation() {
            return population;
        }

        public void setPopulation(Integer population) {
            this.population = population;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

}
