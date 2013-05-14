/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielwatrous.mongodbrevisionobjects.model.morphia;

import com.danielwatrous.mongodbrevisionobjects.model.Person;
import com.google.code.morphia.annotations.Entity;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

/**
 *
 * @author watrous
 */
@Entity(noClassnameStored = true)
public class MorphiaPerson implements Person{
    private Person.PersonName name;
    private Integer age;
    private String email;
    private boolean happy;

    @Inject
    public MorphiaPerson(@Assisted PersonName name, @Assisted Integer age, @Assisted String email, @Assisted boolean happy) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.happy = happy;
    }

    public Person.PersonName getName() {
        return name;
    }

    public void setName(Person.PersonName name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }
}
