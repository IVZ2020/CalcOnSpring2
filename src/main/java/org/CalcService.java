package org;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalcService {

    private Reader reader;
    private Writer writer;
    private CalcAction calcAction;
    private Operation operation;
    private Operation res;

    public CalcService(Reader reader, Writer writer, CalcAction calcAction, Operation operation) {
        this.reader = reader;
        this.writer = writer;
        this.calcAction = calcAction;
        this.operation = operation;
    }

    public void beginApp () {
        calcService(reader, writer, calcAction, operation);
    }

    public void calcService(Reader reader, Writer writer, CalcAction calcAction, Operation operation) {
            while (res.getStatus().equals("norm")) {
                writer.setLine("Input a");
                operation.setNum1(reader.readerDouble());
                writer.setLine("Input b");
                operation.setNum1(reader.readerDouble());
                writer.setLine("Input operation: sum / minus / mult/ div");
                operation.setOperation(reader.readerOperation());
                calcAction.setOperation(operation);
                res = calcAction.getResultOperation();
            }
    }
}
