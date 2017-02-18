package org.usfirst.frc.team687.robot;

import edu.wpi.first.wpilibj.buttons.Button;


import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;

import org.usfirst.frc.team687.robot.commands.CloseGear;
import org.usfirst.frc.team687.robot.commands.OpenGear;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
////CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());
	
	Joystick leftJoy, rightJoy;
	Button button1, button2;
	Talon frontR, backR, frontL, backL;
	double rMotion;
	double lMotion;
	
	public OI(){
		leftJoy = new Joystick(0);
		rightJoy = new Joystick(1);
		button1 = new JoystickButton(leftJoy, 1);
		button2 = new JoystickButton(leftJoy, 2);
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
		
		button1.whenPressed(new OpenGear());
		button2.whenPressed(new CloseGear());
	}
	}
}
