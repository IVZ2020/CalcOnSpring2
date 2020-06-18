package org;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Operation {
    private double num1;
    private double num2;
    private double res;
    private String operation;
    private String status = "norm";
}
