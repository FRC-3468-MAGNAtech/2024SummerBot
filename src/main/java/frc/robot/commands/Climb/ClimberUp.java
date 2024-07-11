// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Climb;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.ClimbConstants;
import frc.robot.subsystems.m_Climber;

public class ClimberUp extends Command {
  m_Climber climbyDude;
  /** Creates a new ClimberUp. */
  public ClimberUp(m_Climber m) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m);
    climbyDude = m;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (climbyDude.getEncoderValue() >= ClimbConstants.upperLimit) {
      climbyDude.stopArms();
      return;
    }
    climbyDude.setAscendSpeed();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    climbyDude.stopArms();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
