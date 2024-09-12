## TeamCode Module

8/31/2024 testing round tripMajor architectural change.

Look at the document "Recommended Notre Dame FTC Team software configuration 2024-2025.docx".
It contains the assumption that for this season Roadrunner will control the drive train during
Autonomous while our own OpModes will control the drive train during TeleOp. Therefore, in
the current release we can remove all support for moving the robot with our own software in
Autonomous.