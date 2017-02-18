package org.usfirst.frc.team687.robot.subsystems;

import org.usfirst.frc.team687.robot.RobotMap;
import org.usfirst.frc.team687.robot.OI;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	Joystick leftJoy, rightJoy;
	Talon frontR, backR, frontL, backL;
	double rMotion;
	double lMotion;
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		rMotion = rightJoy.getY();
		lMotion = leftJoy.getY();
		frontR = new Talon(1);
		backR = new Talon(2);
		frontL = new Talon(3);
		backL = new Talon(4);
		
		if (rMotion > 0) {
			frontR.set(rMotion);
			backR.set(rMotion);
		} 
		
		if (lMotion > 0) {
			frontL.set(-lMotion);
			backL.set(-lMotion);
		}
	}
	
	public void takeJoystickInputs(Joystick left, Joystick right) {
		
	}
}
