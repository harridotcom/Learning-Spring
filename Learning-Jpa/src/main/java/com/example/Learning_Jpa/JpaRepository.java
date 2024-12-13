package com.example.Learning_Jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class JpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course find(long id){
        Course ans = entityManager.find(Course.class, id);
        return ans;
    }

    public void delete(long id){
        Course ans = entityManager.find(Course.class, id);
        entityManager.remove(ans);
    }
}
