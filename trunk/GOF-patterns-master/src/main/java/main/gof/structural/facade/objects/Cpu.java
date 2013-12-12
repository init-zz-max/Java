package main.gof.structural.facade.objects;

/**
 * Complex parts 1
 */
public class Cpu {
    public void freeze() {
        System.out.println("CPU freeze");
        //next operations
    }

    public void jump(long position) {
        System.out.println("CPU jump");
        //next operations

    }

    public void execute() {
        System.out.println("CPU freeze");
        //next operations
    }
}
