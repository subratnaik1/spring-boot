package com.subrat.sbeans;

import java.io.Serializable;

import lombok.Data;
@Data
public class Employee implements Serializable{
 private int id;
 private String name;
 private String department;
 private int salary;
}
