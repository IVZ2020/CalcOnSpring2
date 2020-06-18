package org;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Writer {

    private String line;
    private void writer (String line) {
        System.out.println(line);
    }
}
