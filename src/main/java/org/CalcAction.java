package org;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CalcAction {

    private Operation operation;
    private Operation resultOperation;

    private void calculation (Operation operation) {
        double a = operation.getNum1();
        double b = operation.getNum2();
        String op = operation.getOperation();
        resultOperation = operation;
        resultOperation.setStatus("norm");
        switch (op) {
            case "plus":
                resultOperation.setRes(a + b);
            case "minus":
                resultOperation.setRes(a - b);
            case "mult":
                resultOperation.setRes(a * b);
            case "div":
                if (b != 0) {
                    resultOperation.setRes(a / b);
                } else {
                    resultOperation = operation;
                    resultOperation.setStatus("dumm");
                }
            default:
                resultOperation = operation;
                resultOperation.setStatus("dumm");
        }
    }
}
