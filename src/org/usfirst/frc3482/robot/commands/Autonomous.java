package org.usfirst.frc3482.robot.commands;

import org.usfirst.frc3482.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
    
	// 1: pull back two center trash cans
	// 2: push forward one set of tote/trash can
	// 3: push forward three sets of tote/trash can
	int mode = 2;
	
    public  Autonomous() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	requires(Robot.chassis);
    	
    	if(mode == 1) {
    		addSequential(new ManualRaiseArms(), .5);
    		addSequential(new Move(.5, 0, 0, .25), .25);
    	} else if(mode == 2) {
    		addSequential(new ArmsToBottom());
    		addSequential(new Move(0, .8, 0, .5), .5);
    	} else if(mode == 3) {
    		
    	}
    }
}
