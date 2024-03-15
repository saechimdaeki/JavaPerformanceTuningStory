package me.saechimdaeki.javaperformance.chap01;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeTO implements Serializable {
    private String empName;
    private String empId;
    private String empPhone;

    public String getEmpName() {
        if (empName == null) {return "";} else {return empName;}
    }
}
