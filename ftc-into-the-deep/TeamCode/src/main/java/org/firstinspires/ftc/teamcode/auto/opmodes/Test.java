package org.firstinspires.ftc.teamcode.auto.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.common.RobotConstants;
import org.firstinspires.ftc.teamcode.common.RobotConstantsCurrentGame;

@Autonomous(name = "Test", group = "TeamCode")
//@Disabled
public class Test extends LinearOpMode {

    public void runOpMode() throws InterruptedException {
        FTCAutoDispatch.runAuto(RobotConstants.RunType.AUTONOMOUS,
                RobotConstantsCurrentGame.OpMode.TEST,
                RobotConstants.Alliance.NONE, this);
    }
}


