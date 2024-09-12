package org.firstinspires.ftc.teamcode.common;

public class RobotConstantsCurrentGame {

    public enum OpMode {
        // Autonomous OpModes
        TEST(OpModeType.AUTO_TEST),
        AUTO_NO_DRIVE(OpModeType.AUTO_TEST),

        // TeleOp OpModes
        TELEOP_NO_DRIVE(OpModeType.TELEOP_TEST),

        // Pseudo OpModes for running Autonomous actions from within
        // TeleOp. These are not "real" OpMoces in that they don't
        // appear on the Driver Station but they are present in
        // RobotAction.xml.
        TELEOP_TAKE_PICTURE_WEBCAM(OpModeType.PSEUDO_OPMODE),

        // Indication that an OpMode has not yet been assigned.
        OPMODE_NPOS(OpModeType.PSEUDO_OPMODE);

        public enum OpModeType {COMPETITION, AUTO_TEST, TELEOP_TEST, PSEUDO_OPMODE}
        private final OpModeType opModeType;

        OpMode(OpModeType pOpModeType) {
            opModeType = pOpModeType;
        }

        public OpModeType getOpModeType() {
            return opModeType;
        }
    }

    // The CameraId identifies each unique camera and its position on
    // the robot.
    public enum InternalWebcamId {
        FRONT_WEBCAM, REAR_WEBCAM, WEBCAM_NPOS
    }

    public enum ProcessorIdentifier {
        RAW_FRAME, APRIL_TAG, CAMERA_STREAM_PREVIEW, PROCESSOR_NPOS
    }

}