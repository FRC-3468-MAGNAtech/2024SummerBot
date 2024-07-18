// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Shooter extends SubsystemBase {

  private CANSparkMax m_TopMotor;
  private CANSparkMax m_BottomMotor;

  /** Creates a new Shooter. */
  public Shooter() {
    m_TopMotor = new CANSparkMax(ShooterConstants.ToptMotorPort, com.revrobotics.CANSparkLowLevel.MotorType.kBrushless);
    m_BottomMotor = new CANSparkMax(ShooterConstants.bottomMotorPort, com.revrobotics.CANSparkLowLevel.MotorType.kBrushless);

  }
  public void NoteIntake() {
    m_TopMotor.set(ShooterConstants.TopIntakeMotorSpeed);
    m_BottomMotor.set(ShooterConstants.BottomIntakeMotorSpeed);

  }
  public void NoteShoot() {
    m_TopMotor.set(ShooterConstants.TopShootMototrSpeed);
    m_BottomMotor.set(ShooterConstants.BottomShootMototrSpeed);
  }

  public void ShooterStop() {
    m_TopMotor.set(ShooterConstants.TopStopMotorSpeed);
    m_BottomMotor.set(ShooterConstants.BottomStopMotorSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}