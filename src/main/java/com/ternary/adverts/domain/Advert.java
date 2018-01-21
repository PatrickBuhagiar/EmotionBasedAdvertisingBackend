package com.ternary.adverts.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Advert implements Serializable {

    @Id
    private long id;
    private int counter;
    private String name;
    private AgeGroup ageGroup;
    private Emotion emotion;
    private Gender gender;
    private String imgURL;

    private Advert() {
    }

    public Advert(final Long id,
                  final String name,
                  final AgeGroup ageGroup,
                  final Emotion emotion,
                  final Gender gender,
                  final String imgURL,
                  final Integer count) {
        this.id = id;
        this.name = name;
        this.ageGroup = ageGroup;
        this.emotion = emotion;
        this.gender = gender;
        this.imgURL = imgURL;
        this.counter = count;
    }

    public int getCounter() {
        return counter;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setAgeGroup(final AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public void setEmotion(final Emotion emotion) {
        this.emotion = emotion;
    }

    public void setGender(final Gender gender) {
        this.gender = gender;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(final String imgURL) {
        this.imgURL = imgURL;
    }

    public String getName() {
        return name;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public Gender getGender() {
        return gender;
    }

    public void incrementCount() {
        this.counter += 1;
    }
}
