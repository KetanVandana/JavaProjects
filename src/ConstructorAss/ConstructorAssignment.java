package ConstructorAss;

import java.util.Arrays;

public class ConstructorAssignment {
	private String name;
	private double version;
	private String[] plugin;
	
	public ConstructorAssignment(String name, double version, String[] plugin) {
		this.name = name;
		this.version = version;
		this.plugin = plugin;
	}

	public ConstructorAssignment(double version, String[] plugin) {
		super();
		this.version = version;
		this.plugin = plugin;
	}

	public ConstructorAssignment(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String[] getPlugin() {
		return plugin;
	}

	public void setPlugin(String[] plugin) {
		this.plugin = plugin;
	}

	@Override
	public String toString() {
		return "ConstructorAssignment [name=" + name + ", version=" + version + ", plugin=" + Arrays.toString(plugin)
				+ "]";
	}
	
	
	
	
	
	

}

