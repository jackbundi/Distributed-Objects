package com.ics.four.hotelserver.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(groups = ValidateHotel.class)
    private String name;
    @OneToMany
    private List<Employee> employees = new ArrayList<>();
    @NotNull(groups = ValidateHotel.class)
    @ManyToOne
    private Group group;

    public Hotel(@NotNull(groups = ValidateHotel.class) String name, List<Employee> employees,
                 @NotNull(groups = ValidateHotel.class) Group group) {
        this.name = name;
        this.employees = employees;
        this.group = group;
    }

    protected Hotel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public interface ValidateHotel{

    }
}
