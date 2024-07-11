// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.sql.ClientInfoStatus;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkLimitSwitch;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.SparkLimitSwitch.Type;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.ClimbConstants;

public class m_Climber extends SubsystemBase {
  CANSparkMax climbArmNeo;
  RelativeEncoder armEncoder;
  SparkLimitSwitch armLimitSwitch;

  /** Creates a new m_Climber. */
  public m_Climber() {
    climbArmNeo = new CANSparkMax(Constants.ClimbConstants.SparkMaxID,MotorType.kBrushless);
    armEncoder = climbArmNeo.getEncoder();
    climbArmNeo.setIdleMode(IdleMode.kBrake);
    armLimitSwitch = climbArmNeo.getReverseLimitSwitch(Type.kNormallyOpen);
    armLimitSwitch.enableLimitSwitch(true);
  }

  public void setAscendSpeed() {
    climbArmNeo.set(ClimbConstants.ascensionSpeed);
  }

  public void setDescendSpeed() {
    climbArmNeo.set(ClimbConstants.descensionSpeed);
  }

  public void stopArms() {
    climbArmNeo.set(0);
  }

  public void setHome() {
    armEncoder.setPosition(0);
  }

  public double getEncoderValue() {
    return armEncoder.getPosition();
  }

  public boolean getLimitSwitch() {
    return armLimitSwitch.isPressed();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putBoolean("LimSwitch", getLimitSwitch());
    if (getLimitSwitch())
      setHome();
  }
}
