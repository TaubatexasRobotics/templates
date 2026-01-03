class Drivetrain {
  private final VictorSPX leftMotor = new VictorSPX(1);
  private final VictorSPX rightMotor = new VictorSPX(2);

  private final DifferentialDrive drive = new DifferentialDrive(
      leftMotor, rightMotor
  );

  public Drivetrain() {
    rightMotor.setInverted(true);
    drive.arcadeDrive(0, 0);
  }
}
