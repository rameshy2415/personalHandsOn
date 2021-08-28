package com.acn.designPattern;

public class Computer {
	private String hdd;
	private String ram;
	private boolean isGraphic;
	
	public Computer(ComputerBuilder computerBuilder) {
		this.hdd=computerBuilder.hdd;
		this.ram=computerBuilder.ram;
		this.isGraphic=computerBuilder.isGraphic;
	}
	
/*	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public boolean isGraphic() {
		return isGraphic;
	}
	public void setGraphic(boolean isGraphic) {
		this.isGraphic = isGraphic;
	}*/
	
	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", isGraphic=" + isGraphic + "]";
	}

	public static class ComputerBuilder{
		
		private String hdd;
		private String ram;
		private boolean isGraphic;
		
		public ComputerBuilder setHdd(String hdd) {
			this.hdd = hdd;
			return this;
		}
		public ComputerBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		public ComputerBuilder setGraphic(boolean isGraphic) {
			this.isGraphic = isGraphic;
			return this;
		}
		public Computer build() {
			return new Computer(this);
		}
		
	}
	
	

}
