// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3482.robot.subsystems;

import org.usfirst.frc3482.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Arms extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController arms = RobotMap.armsArms;
    //wired wrong so pressed returns false and released returns true
    DigitalInput limitSwitch1 = RobotMap.armsLimitSwitch1;
    DigitalInput limitSwitch2 = RobotMap.armsLimitSwitch2;
    DigitalInput limitSwitch3 = RobotMap.armsLimitSwitch3;
    DoubleSolenoid doubleSolenoid1 = RobotMap.armsDoubleSolenoid1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    int lastDirection = 1;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void open()
    {
    	doubleSolenoid1.set(DoubleSolenoid.Value.kForward);
    }
    
    public void close()
    {
    	doubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void printLimitSwitches() {
    	System.out.println("Bottom: " + limitSwitch1.get());
    	System.out.println("Middle: " + limitSwitch2.get());
    	System.out.println("Top: " + limitSwitch3.get());
    }
    
    public void toTop()
    {
    	while(limitSwitch3.get()) {
    		arms.set(1.0);
    	}
    }
    
    public void prepareForFeed() {
    	//while(limitSwitch2.get() || limitSwitch3.get()) {
    	while(limitSwitch2.get()) {
        	System.out.println("Middle: " + limitSwitch2.get());
    		arms.set(1.0);
    	}
    }
    public void toBottom()
    {
    	while (limitSwitch1.get()) {
    		arms.set(-1.0);
    	}
    }
    
    public void moveUp() {
    	if(limitSwitch3.get()) {
    		lastDirection = 1;
    		arms.set(1);
    	} else {
    		stop();
    	}
    }
    
    public void moveDown() {
    	if(limitSwitch1.get()) {
    		lastDirection = -1;
    		arms.set(-1);
    	} else {
    		stop();
    	}
    }
    
    public void stop() {
    	arms.set(0);
    }
}

