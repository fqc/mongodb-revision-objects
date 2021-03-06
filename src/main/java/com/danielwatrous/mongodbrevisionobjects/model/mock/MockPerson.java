/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielwatrous.mongodbrevisionobjects.model.mock;

import com.danielwatrous.mongodbrevisionobjects.model.Person;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

/**
 *
 * @author watrous
 */
public class MockPerson implements Person {
    private Person.PersonName name;
    private Integer age;
    private String email;
    private boolean happy;

    @Inject
    public MockPerson(@Assisted PersonName name, @Assisted Integer age, @Assisted String email, @Assisted boolean happy) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.happy = happy;
    }

    public PersonName getName() {
        return name;
    }

    public void setName(PersonName name) {
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
