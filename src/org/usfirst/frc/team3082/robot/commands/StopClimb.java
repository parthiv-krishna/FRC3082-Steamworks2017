package org.usfirst.frc.team3082.robot.commands;

import org.usfirst.frc.team3082.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/* This command stops the climber. */

public class StopClimb extends Command {

    public StopClimb() {
    	requires(Robot.climber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.climber.stop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
