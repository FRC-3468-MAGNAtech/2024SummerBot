// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static class ShooterConstants
   {
    public static int ToptMotorPort = 2;
    public static int bottomMotorPort = 3;
    public static final double TopShootMototrSpeed = 0.7;
    public static final double BottomShootMototrSpeed = 0.7;
    public static final double TopIntakeMotorSpeed = -0.5;
    public static final double BottomIntakeMotorSpeed = -0.5;
    public static final double TopStopMotorSpeed = 0;
    public static final double BottomStopMotorSpeed = 0;
    
  }

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
    public static final int IntakeButton = XboxController.Button.kB.value;
    public static final int ShootButton = XboxController.Button.kA.value;
  }

  public static class DriveConstants {
    public static final int FrontLeftID = 0;
    public static final int BackLeftID = 0;
    public static final int FrontRightID = 0;
    public static final int BackRightID = 0;
    public static final int CurrentLimit = 40;
  }
}
