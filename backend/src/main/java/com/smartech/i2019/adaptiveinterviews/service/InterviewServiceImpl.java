package com.smartech.i2019.adaptiveinterviews.service;

import com.smartech.i2019.adaptiveinterviews.api.InterviewService;
import com.smartech.i2019.adaptiveinterviews.model.Interview;
import com.smartech.i2019.adaptiveinterviews.repository.InterviewRepository;
import com.smartech.i2019.adaptiveinterviews.specification.InterviewSpecification;
import com.smartech.i2019.adaptiveinterviews.util.Dates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewRepository interviewRepository;
    @Autowired
    private InterviewSpecification interviewSpecification;
    @Autowired
    private Dates date;

    @Override
    public void add(Interview interview) {
        interviewRepository.saveAndFlush(interview);
    }

    @Override
    public void edit(Interview interview) {
        interviewRepository.saveAndFlush(interview);
    }

    @Override
    public void delete(long id) {
        interviewRepository.deleteById(id);
    }

    @Override
    public List<Interview> findAll() {
        return interviewRepository.findAll();
    }

    @Override
    public Interview findById(long id) {
        return interviewRepository.findById(id).orElse(null);
    }

    @Override
    public List<Interview> listByDateNextDay() {
        return interviewRepository.findAll(interviewSpecification.hasDate(date.getSqlNextDay()));
    }

    @Override
    public List<Interview> listByDateSubtractDay() {
        return interviewRepository.findAll(interviewSpecification.hasDate(date.getSqlSubtractDay()));
    }

    @Override
    public List<Interview> listByDate(Date date) {
        return interviewRepository.findAll(interviewSpecification.hasDate(date));
    }

    @Override
    public List<Interview> listTodayAndAfter() {
        return interviewRepository.findAll(Specification.where(
                interviewSpecification.hasDate(date.getSqlNextDay()).and(
                        interviewSpecification.hasDescription(""))));
    }

    @Override
    public List<Interview> listWithoutReview() {
        return interviewRepository.findAll(interviewSpecification.hasDescription(""));
    }

}
