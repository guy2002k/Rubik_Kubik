/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Chassis extends Subsystem {
  private WPI_TalonSRX rightMaster;
  private WPI_TalonSRX leftMaster;
  private WPI_TalonSRX rightSlave;
  private WPI_TalonSRX leftSlave;
  private DifferentialDrive drive;
  private Chassis instance;

  public Chassis getInstance(){
    if(instance==null)
     instance=new Chassis();
    return instance; 
  }

  public Chassis() {
    //talons
    rightMaster=new WPI_TalonSRX(RobotMap.PORT_MASTER_RIGHT);
    leftMaster=new WPI_TalonSRX(RobotMap.PORT_MASTER_LEFT);
    rightSlave=new WPI_TalonSRX(RobotMap.PORT_SLAVE_RIGHT);
    leftSlave=new WPI_TalonSRX(RobotMap.PORT_SLAVE_LEFT);

    //makes the slaves follow the master
    rightSlave.follow(rightMaster);
    leftSlave.follow(leftMaster);

    //drive
    drive=new DifferentialDrive(leftMaster, rightMaster);
    drive.setSafetyEnabled(true);

  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
