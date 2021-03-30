package com.sylinx.p5.pojo;

import java.util.*;

public class Student {

    private String name;
    private Address address;
    private String [] books;
    private List<String> hobbys;
    private Map<String, String> card;
    private Set<String> games;
    private Properties info;
    private String wife;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ",\n address=" + address +
                ",\n books=" + Arrays.toString(books) +
                ",\n hobbys=" + hobbys +
                ",\n card=" + card +
                ",\n games=" + games +
                ",\n info=" + info +
                ",\n wife='" + wife + '\'' +
                '}';
    }
}
