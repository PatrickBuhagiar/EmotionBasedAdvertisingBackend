package com.ternary.adverts;

import com.ternary.adverts.dao.Repository;
import com.ternary.adverts.domain.Advert;
import com.ternary.adverts.domain.AgeGroup;
import com.ternary.adverts.domain.Emotion;
import com.ternary.adverts.domain.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

    private Repository repository;

    @Autowired
    public Application(final Repository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    private void init() {
        repository.save(new Advert(1L, "Colgate Advert", AgeGroup.ADULT, Emotion.SADNESS, Gender.ALL, "http://www.guy-sports.com/fun_pictures/colgate.jpg", 0));
        repository.save(new Advert(2L, "Durex Advert", AgeGroup.YOUNGADULT, Emotion.HAPPY, Gender.MALE, "https://i.pinimg.com/736x/60/6d/c0/606dc0d353991cd35950cd4059c45199--creative-posters-funny-ads.jpg", 0));
        repository.save(new Advert(3L, "Orbit Advert", AgeGroup.ADULT, Emotion.NEUTRAL, Gender.ALL, "http://wwwcdn.howdesign.com/wp-content/uploads/funny-ad-chicken.jpg", 0));
        repository.save(new Advert(4L, "H&M Advert", AgeGroup.YOUNGADULT, Emotion.NEUTRAL, Gender.FEMALE, "https://s-media-cache-ak0.pinimg.com/originals/d6/71/d8/d671d8bc50cbbc2686388a1bc15b715a.jpg", 0));
        repository.save(new Advert(5L, "Dog Food advert", AgeGroup.OLD, Emotion.ALL, Gender.ALL, "https://2.bp.blogspot.com/-6CRbAr-DulY/VEDZM2w4IYI/AAAAAAAAWMo/h2MBS4Tbwlo/s1600/funny-dog-weightloss-advert.jpg", 0));
        repository.save(new Advert(6L, "Old Spice Advert", AgeGroup.ADULT, Emotion.ALL, Gender.MALE, "https://i.pinimg.com/736x/1b/ed/a9/1beda91785bc9c2a77983271cbca062a--old-spice-funny-ads.jpg", 0));
    }
}
