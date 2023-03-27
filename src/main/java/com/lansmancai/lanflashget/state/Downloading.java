package com.lansmancai.lanflashget.state;

import javax.swing.ImageIcon;

import com.lansmancai.lanflashget.object.Resource;
import com.lansmancai.lanflashget.util.ImageUtil;

public class Downloading extends AbstractState {

	@Override
	public ImageIcon getIcon() {
		return ImageUtil.DOWNLOADING_IMAGE;
	}
	public String getState() {
		return "downloading";
	}
}
