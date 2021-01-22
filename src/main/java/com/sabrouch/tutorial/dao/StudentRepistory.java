package com.sabrouch.tutorial.dao;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sabrouch.
 * Date: 1/22/2021
 */
public interface StudentRepistory extends JpaRepository<Student, Long> {
}
