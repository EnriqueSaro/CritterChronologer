package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.entities.Employee;
import com.udacity.jdnd.course3.critter.entities.Pet;
import com.udacity.jdnd.course3.critter.entities.Schedule;
import com.udacity.jdnd.course3.critter.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public Schedule save(Schedule schedule){
        Schedule savedSchedule = scheduleRepository.save(schedule);


        //ADD bidirectional association, i guess...
        return savedSchedule;
    }

    public List<Schedule> findAll(){
        return scheduleRepository.findAll();
    }

    public List<Schedule> findAllByPetsContaining(Long petId){
        return scheduleRepository.findAllByPetsId(petId);
    }

    public List<Schedule> findAllByEmployeesContaining(Long employeeId){
        return scheduleRepository.findAllByEmployeesId(employeeId);
    }

    public List<Schedule> findAllByPetsCustomerId(Long customerId){
        return scheduleRepository.findAllByPetsCustomerId(customerId);
    }



}
