package cc.flintstone.bluej_x_templ;

import bluej.extensions.BlueJ;
import bluej.extensions.Extension;

public class MainClass extends Extension {
	
	private BlueJ blueJ;
	
	private static final String NAME = "";
	private static final String VERSION = "";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String getVersion() {
		return VERSION;
	}

	@Override
	public boolean isCompatible() {
		return true;
	}

	@Override
	public void startup(BlueJ bluej) {
		this.blueJ = bluej;
	}
	
	public BlueJ getBlueJ() {
		return blueJ;
	}
	
	public static void main(String[] args) {
		System.exit(1);
	}

}
