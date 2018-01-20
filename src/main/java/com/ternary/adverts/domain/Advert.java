package com.ternary.adverts.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Advert implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private AgeGroup ageGroup;
    private Emotion emotion;
    private Gender gender;
    private String imgURL;

    private Advert() {}

    public Advert(final String name,
                  final AgeGroup ageGroup,
                  final Emotion emotion,
                  final Gender gender, final String imgURL) {
        this.name = name;
        this.ageGroup = ageGroup;
        this.emotion = emotion;
        this.gender = gender;
        this.imgURL = imgURL;
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
}
