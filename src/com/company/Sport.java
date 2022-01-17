package com.company;

public class Sport implements Oyunchular {
    private String name;
    private int  playing;
    private String favorite;
    private int age;

    public Sport(String name, int playing, String favorite, int age) {
        this.name = name;
        this.playing =  playing;
        this.favorite = favorite;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getPlaying() {
        return playing;
    }

    public void setPlaying(int playing) {
        this.playing = playing;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void playing() {

        System.out.println(" Спорт тарыхы боюнча маалымат:"  );
    }

    @Override
    public String toString() {
        return getName() + "," + getPlaying() + "," + getAge() + "," + getFavorite();
    }
}
