package com.ternary.adverts;

import com.netflix.discovery.converters.Auto;
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
    private void init(){
        repository.save(new Advert("Colgate Advert", AgeGroup.ADULT, Emotion.SADNESS, Gender.ALL, "http://www.guy-sports.com/fun_pictures/colgate.jpg"));
        repository.save(new Advert("Durex Advert", AgeGroup.ADOLESCENT, Emotion.HAPPY, Gender.MALE, "https://i.pinimg.com/736x/60/6d/c0/606dc0d353991cd35950cd4059c45199--creative-posters-funny-ads.jpg"));
        repository.save(new Advert("Orbit Advert", AgeGroup.ADULT, Emotion.NEUTRAL, Gender.ALL, "http://wwwcdn.howdesign.com/wp-content/uploads/funny-ad-chicken.jpg"));
        repository.save(new Advert("H&M Advert", AgeGroup.ADOLESCENT, Emotion.NEUTRAL, Gender.FEMALE, "https://s-media-cache-ak0.pinimg.com/originals/d6/71/d8/d671d8bc50cbbc2686388a1bc15b715a.jpg"));
        repository.save(new Advert("Dog Food advert", AgeGroup.OLD, Emotion.ALL, Gender.ALL, "https://2.bp.blogspot.com/-6CRbAr-DulY/VEDZM2w4IYI/AAAAAAAAWMo/h2MBS4Tbwlo/s1600/funny-dog-weightloss-advert.jpg"));
        repository.save(new Advert("Old Spice Advert", AgeGroup.ADULT, Emotion.ALL, Gender.MALE, "https://i.pinimg.com/736x/1b/ed/a9/1beda91785bc9c2a77983271cbca062a--old-spice-funny-ads.jpg"));
    }
}
