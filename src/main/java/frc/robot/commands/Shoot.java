// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class Shoot extends Command {
  private Shooter ShootNote;
  /** Creates a new Shoot. */
  public Shoot(Shooter Subsystem) {
    ShootNote = Subsystem;
    addRequirements(ShootNote);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    ShootNote.NoteShoot();
  }
  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    ShootNote.ShooterStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
