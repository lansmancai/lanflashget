package com.lansmancai.lanflashget.navigation;

import javax.swing.ImageIcon;

import com.lansmancai.lanflashget.util.ImageUtil;

/**
 * ������ɽڵ�
 */
public class FinishNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.FINISH_NODE_IMAGE;
	}

	public String getText() {
		return "�������";
	}

}
