package com.qa.RobotsCity;

import com.sidenis.robots.WorkerRobot;

public class RobotsCity {

    public void buildCity() {
        System.out.println("We build a city");
        System.out.println("We starts to create robots");

        WorkerRobot robot = new WorkerRobot();
        robot = null;

        try {
            robot.move();
            robot.doWork();
            robot.doWork();
            robot.doWork();
            robot.move();
        } catch (Exception e) {
            System.out.println("Exeption!!!  No house!!\n");
        }


        System.out.println("City ready");

    }
}
