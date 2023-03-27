package com.lansmancai.lanflashget.state;

import javax.swing.ImageIcon;

import com.lansmancai.lanflashget.util.ImageUtil;

public class Connecting extends AbstractState {

	@Override
	public ImageIcon getIcon() {
		return ImageUtil.CONNECTING_IMAGE;
	}
	
	public String getState() {
		return "connecting";
	}
}
