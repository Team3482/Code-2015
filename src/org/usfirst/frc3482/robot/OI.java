// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3482.robot;

import org.usfirst.frc3482.robot.commands.*;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
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
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick driveController;
    public Joystick xboxController;
    public Joystick arcadeButtons;
    
    //xbox controller buttons
    public JoystickButton rampButton;
    public JoystickButton manualLowerArmsButton;
    public JoystickButton lowerArmsButton;
    public JoystickButton manualRaiseArmsButton;
    public JoystickButton raiseArmsButton;
    public JoystickButton openArmsButton;
    public JoystickButton resetGyroButton;
    public JoystickButton closeArmsButton;
    
    // arcade buttons
    public JoystickButton openArmsArcadeButton;
    public JoystickButton closeArmsArcadeButton;
    public JoystickButton manualRaiseArmsArcadeButton;
    public JoystickButton manualLowerArmsArcadeButton;
    public JoystickButton prepareForFeedButton;
    public JoystickButton toTopButton;
    public JoystickButton toBottomButton;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    	driveController = new Joystick(0);
    	xboxController = new Joystick(1);
        //arcadeButtons = new Joystick(1);
        
    	// Joystick buttons
    	//resetGyroButton = new JoystickButton(driveController, 2);
        //resetGyroButton.toggleWhenPressed(new ResetGyro());
    	
        // arcade buttons
        /*manualLowerArmsArcadeButton = new JoystickButton(arcadeButtons, 1);
        manualLowerArmsArcadeButton.whileHeld(new ManualLowerArms());
        
        manualRaiseArmsArcadeButton = new JoystickButton(arcadeButtons, 2);
        manualRaiseArmsArcadeButton.whileHeld(new ManualRaiseArms());
        
        toBottomButton = new JoystickButton(arcadeButtons, 3);
        toBottomButton.whenPressed(new ArmsToBottom());
        
        prepareForFeedButton = new JoystickButton(arcadeButtons, 4);
        prepareForFeedButton.whenPressed(new PrepareForFeed());

        toTopButton = new JoystickButton(arcadeButtons, 5);
        toTopButton.whenPressed(new ArmsToTop());
        
        closeArmsArcadeButton = new JoystickButton(arcadeButtons, 6);
        closeArmsArcadeButton.whenPressed(new OpenArms(false));
        
        openArmsArcadeButton = new JoystickButton(arcadeButtons, 7);
        openArmsArcadeButton.whenPressed(new OpenArms(true));
        */ 
        
        // xbox buttons
        rampButton = new JoystickButton(xboxController, 1);
        rampButton.toggleWhenPressed(new ExtendRamp());
     
        manualLowerArmsButton = new JoystickButton(xboxController, 5);
        manualLowerArmsButton.whileHeld(new ManualLowerArms());
        
        manualRaiseArmsButton = new JoystickButton(xboxController, 6);
        manualRaiseArmsButton.whileHeld(new ManualRaiseArms());
        
        openArmsButton = new JoystickButton(xboxController, 4);
        openArmsButton.whenPressed(new OpenArms(true));
        
        closeArmsButton = new JoystickButton(xboxController, 3);
        closeArmsButton.whenPressed(new OpenArms(false));
        
        toBottomButton = new JoystickButton(xboxController, 2);
        toBottomButton.whenPressed(new ArmsToBottom());

        prepareForFeedButton = new JoystickButton(xboxController, 7);
        prepareForFeedButton.whenPressed(new PrepareForFeed());

        toTopButton = new JoystickButton(xboxController, 8);
        toTopButton.whenPressed(new ArmsToTop());
        
        //resetGyroButton = new JoystickButton(xboxController, 7);
        //resetGyroButton.toggleWhenPressed(new ResetGyro());
  
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new Autonomous());

        SmartDashboard.putData("ExtendRamp", new ExtendRamp());

        SmartDashboard.putData("OpenArms", new OpenArms(true));
        
        SmartDashboard.putData("CloseArms", new OpenArms(false));
        
        SmartDashboard.putData("ManualRaiseArms", new ManualRaiseArms());
        
        SmartDashboard.putData("ManualLowerArms", new ManualLowerArms());
        
        SmartDashboard.putData("Drive", new Drive());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    /*public Joystick getXboxController() {
        return xboxController;
    }*/
    public Joystick getDriveController() {
        return driveController;
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

