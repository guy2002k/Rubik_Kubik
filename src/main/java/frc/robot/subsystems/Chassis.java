/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Add your docs here.
 */
public class Chassis extends Subsystem {
  private PWMTalonSRX rightMaster;
  private PWMTalonSRX leftMaster;
  private PWMTalonSRX rightSlave;
  private PWMTalonSRX leftSlave;
  private DifferentialDrive drive;
  private Chassis instance;

  public Chassis getInstance(){
    if(instance==null)
     instance=new Chassis();
    return instance; 
  }

  public Chassis() {
    
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
