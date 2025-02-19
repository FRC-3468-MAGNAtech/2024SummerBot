// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends Command {
	DoubleSupplier driveDouble;
	DoubleSupplier rotationDouble;
	DriveTrain m_DriveTrain;
	/** Creates a new ArcadeDrive. */
	public ArcadeDrive(DriveTrain train, DoubleSupplier drive, DoubleSupplier rot) {
		// Use addRequirements() here to declare subsystem dependencies.
		addRequirements(train);
		m_DriveTrain = train;
		driveDouble = drive;
		rotationDouble = rot;
	}

	// Called when the command is initially scheduled.
	@Override
	public void initialize() {}

	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute() {
		m_DriveTrain.arcadeDrive(driveDouble.getAsDouble(), rotationDouble.getAsDouble());
	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
		m_DriveTrain.stop();
	}

	// Returns true when the command should end.
	@Override
	public boolean isFinished() {
		return false;
	}
}
