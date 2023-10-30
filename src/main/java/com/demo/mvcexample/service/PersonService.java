package com.demo.mvcexample.service;

import com.demo.mvcexample.model.Person;
import com.demo.mvcexample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PersonService implements PersonRepository {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Person> S saveAndFlush(S entity) {
        return personRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Person> List<S> saveAllAndFlush(Iterable<S> entities) {
        return personRepository.saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Person> entities) {
        personRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        personRepository.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        personRepository.deleteAllInBatch();
    }

    @Override
    public Person getOne(Long aLong) {
        return personRepository.getOne(aLong);
    }

    @Override
    public Person getById(Long aLong) {
        return personRepository.getById(aLong);
    }

    @Override
    public Person getReferenceById(Long aLong) {
        return personRepository.getReferenceById(aLong);
    }

    @Override
    public <S extends Person> Optional<S> findOne(Example<S> example) {
        return personRepository.findOne(example);
    }

    @Override
    public <S extends Person> List<S> findAll(Example<S> example) {
        return personRepository.findAll(example);
    }

    @Override
    public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
        return personRepository.findAll(example, sort);
    }

    @Override
    public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
        return personRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Person> long count(Example<S> example) {
        return personRepository.count(example);
    }

    @Override
    public <S extends Person> boolean exists(Example<S> example) {
        return personRepository.exists(example);
    }

    @Override
    public <S extends Person, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return personRepository.findBy(example, queryFunction);
    }

    @Override
    public <S extends Person> S save(S entity) {
        return personRepository.save(entity);
    }

    @Override
    public <S extends Person> List<S> saveAll(Iterable<S> entities) {
        return personRepository.saveAll(entities);
    }

    @Override
    public Optional<Person> findById(Long aLong) {
        return personRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return personRepository.existsById(aLong);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> findAllById(Iterable<Long> longs) {
        return personRepository.findAllById(longs);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        personRepository.deleteById(aLong);
    }

    @Override
    public void delete(Person entity) {
        personRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        personRepository.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Person> entities) {
        personRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        personRepository.deleteAll();
    }

    @Override
    public List<Person> findAll(Sort sort) {
        return personRepository.findAll(sort);
    }

    @Override
    public Page<Person> findAll(Pageable pageable) {
        return personRepository.findAll(pageable);
    }
}
