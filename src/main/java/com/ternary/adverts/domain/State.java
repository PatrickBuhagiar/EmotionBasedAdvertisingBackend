package com.ternary.adverts.domain;

public class State {
    private AgeGroup ageGroup;
    private Emotion emotion;
    private Gender gender;

    public State(final AgeGroup ageGroup, final Emotion emotion, final Gender gender) {
        this.ageGroup = ageGroup;
        this.emotion = emotion;
        this.gender = gender;
    }

    public State() {
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
