package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Java funcional");


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        //List<String> lista = Arrays.asList("hola", "que", "tal");
        List<String> lista = new ArrayList<>();
        lista.add("hola soy el");
        lista.add("1 :)");

        lista.stream().forEach((x) -> System.out.println(x));
        Empleado empleado= new Empleado();
        empleado.setNombre("pepe");
        empleado.setApellido("juarez");

        List<Empleado> emp = new ArrayList<>();
        emp.add(empleado);
        empleado= new Empleado();
        empleado.setNombre("Maria");
        empleado.setApellido("Torres");
        emp.add(empleado);
        emp.stream().forEach((x) -> System.out.println(x.apellido));


    }
}