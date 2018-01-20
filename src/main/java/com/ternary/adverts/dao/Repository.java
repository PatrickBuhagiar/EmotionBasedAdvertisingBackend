package com.ternary.adverts.dao;

import com.ternary.adverts.domain.Advert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Repository extends CrudRepository<Advert, Long> {
}
