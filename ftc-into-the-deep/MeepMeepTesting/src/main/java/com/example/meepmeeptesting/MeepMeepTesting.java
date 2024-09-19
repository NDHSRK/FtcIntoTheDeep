package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.Action;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.SequentialAction;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .build();

        // BLUE_B3
/*
        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(14.76, -62.89, Math.toRadians(90)))
                .splineToSplineHeading(new Pose2d(6.44, -35.0, Math.toRadians(90)), Math.toRadians(90))
                .waitSeconds(2)
                .lineToY(-48)
                .setTangent(Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(37.11, -37.11, Math.toRadians(45)), Math.toRadians(45))
                .waitSeconds(2)
                .build());


 */

        Action toSubmersible = myBot.getDrive().actionBuilder(new Pose2d(14.76, -62.89, Math.toRadians(90)))
                .splineToSplineHeading(new Pose2d(6.44, -35.0, Math.toRadians(90)), Math.toRadians(90))
                .build();

        Action hangSpecimen = myBot.getDrive().actionBuilder(myBot.getPose())
                .waitSeconds(2)
                .build();

        Action toSample1 = myBot.getDrive().actionBuilder(myBot.getPose())
                .setTangent(Math.toRadians(90))
                .lineToY(-48)
                .setTangent(Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(37.11, -37.11, Math.toRadians(45)), Math.toRadians(45))
                .waitSeconds(2)
                .build();

        //**TODO !!Actions.runBlocking not supported in MeepMeep - runtime error.
        Actions.runBlocking(
                new SequentialAction(
                        toSubmersible,
                        hangSpecimen,
                        toSample1
                )
        );



 /*
        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(0, 0, Math.toRadians(0)))
        .lineToX(-62)
        .setTangent(0)
                .splineToSplineHeading(new Pose2d(-40, -30, Math.toRadians(-90)), Math.toRadians(-90))
                .build());
  */


        meepMeep.setBackground(MeepMeep.Background.FIELD_INTO_THE_DEEP_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }

}