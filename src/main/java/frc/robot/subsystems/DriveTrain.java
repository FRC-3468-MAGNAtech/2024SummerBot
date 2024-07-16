// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants.DriveConstants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrainn. */
DifferentialDrive m_drivetrain;

  public DriveTrain() {
    CANSparkMax leftFront = new CANSparkMax(DriveConstants.FrontLeftID, MotorType.kBrushless);
    CANSparkMax leftRear = new CANSparkMax(DriveConstants.BackLeftID, MotorType.kBrushless);
    CANSparkMax rightFront = new CANSparkMax(DriveConstants.FrontRightID, MotorType.kBrushless);
    CANSparkMax rightRear = new CANSparkMax(DriveConstants.BackRightID, MotorType.kBrushless);

    leftFront.setSmartCurrentLimit(DriveConstants.CurrentLimit);
    leftRear.setSmartCurrentLimit(DriveConstants.CurrentLimit);
    rightFront.setSmartCurrentLimit(DriveConstants.CurrentLimit);
    rightRear.setSmartCurrentLimit(DriveConstants.CurrentLimit);

    leftRear.follow(leftFront);
    rightRear.follow(rightFront);

    leftFront.setInverted(true);
    rightFront.setInverted(false);

    m_drivetrain = new DifferentialDrive(leftFront, rightFront);

    

  }

  public void arcadeDrive(double speed, double rotation){
    m_drivetrain.arcadeDrive(speed, rotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
